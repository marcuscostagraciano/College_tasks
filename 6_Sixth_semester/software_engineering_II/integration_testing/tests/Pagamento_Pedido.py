from path_normalizer import normalize_path
normalize_path()

from src.Autenticacao import Autenticacao
from src.Produto import Produto
from src.Pedido import Pedido
from src.Pagamento import Pagamento


def escolher_forma_pagamento(pagamento: Pagamento):
    forma_de_pagamento = input('Por favor, escolha uma forma de pagamento (Cartão/Pix): ')
    pagamento.tipo_pagamento = forma_de_pagamento


aut = Autenticacao('123', 'jose@email.com')

produtos = [
    Produto(67),
    Produto(36),
]

pedido = Pedido(produtos)
print(pedido)
print(pedido.produtos)

pagamento = Pagamento(pedido, aut)
print(pagamento)

print(f"Tipo de pagamento: {pagamento.tipo_pagamento}")
escolher_forma_pagamento(pagamento)
print(f"Novo tipo de pagamento: {pagamento.tipo_pagamento}")
print(f"Número da conta: {pagamento.conta}")
print(f"Saldo da conta: {pagamento.saldo}")
pagamento.pagar()
