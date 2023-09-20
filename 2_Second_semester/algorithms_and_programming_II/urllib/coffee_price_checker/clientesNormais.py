def comprarCafeClienteNormal():
    import urllib.request

    # Clientes normais
    paginaCB = urllib.request.urlopen("http://beans.itcarlow.ie/prices.html")
    textoCB  = paginaCB.read().decode("utf8")
    inicioCB  = textoCB.find(">$") + 2
    fimCB  = inicioCB + 4
    precoCB  = textoCB[inicioCB:fimCB]
    precoCB = float(precoCB)

    if precoCB < 4.74:
        return (f"Comprar! Preço: {precoCB}")   
    else:
        return (f"Espere! Preço: {precoCB}")    
    
print(comprarCafeClienteNormal())