def belowMaxPrice(price):
    msg = "Verificamos a url enviada e tivemos o seguinte resultado:\n"
    
    if price < 4.70:
        msg += f"<b>Compre!</b> Preço: {price}, R$ {round(4.70-price,2)} abaixo do parâmetro de R$ 4,70"
    else:
        msg += f"<b>Espere!</b> Preço: {price}, R$ {round(price-4.70,2)} acima do parâmetro de R$ 4,70"
        
    return msg


def main(url):    
    from email_senders.gmail_sender import send_gmail
    import urllib.request
    import time
    
    
    with urllib.request.urlopen(url) as page:
        readed_page = page.read().decode("utf8")         
        
        try:
            starting_position = readed_page.find("R$") + 3
            ending_position = starting_position + 5
            price = readed_page[starting_position:ending_position]
            price = price.replace(",",".")   
            price = float(price)        
            
        except:
            starting_position = readed_page.find("$") + 1
            ending_position = starting_position + 4
            price = readed_page[starting_position:ending_position]
               
        price = float(price)  
        send_gmail(belowMaxPrice(price))
        # Para o envio correto do email, é necessário alterar as credencias em: email_senders/credentials_config/credentials
        time.sleep(2)
               

main(str(input("Digite a url do site produto: ")))