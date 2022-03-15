from clientesNormais import comprarCafeClienteNormal
from clientesFieis import comprarCafeClienteFiel
from email_senders.gmail_sender import send_gmail

mensagem = f"""Cliente normal:\n{comprarCafeClienteNormal()}\n
               Cliente fiel:\n{comprarCafeClienteFiel()}"""

try:
    send_gmail(mensagem)
except:
    print("Falha no envio")