def send_gmail(mensagem):
    import yagmail
    from email_senders.credentials_config.credentials import account_settings

    sending_account = account_settings["sending_account"]
    sender_password = account_settings["password"]
    receiver_account = account_settings["receiver_account"]
    
    with yagmail.SMTP(sending_account, sender_password) as yag:
        yag.send(to= receiver_account,
                 subject= "Compras por menos de R$ 4.70",
                 contents = mensagem)