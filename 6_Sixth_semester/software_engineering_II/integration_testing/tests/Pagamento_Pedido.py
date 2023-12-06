from path_normalizer import normalize_path
normalize_path()

from src.Produto import Produto
from src.Pedido import Pedido
from src.Pagamento import Pagamento

def escolher_forma_pagamento(pagamento: Pagamento):
    forma_de_pagamento = input('Por favor, escolha uma forma de pagamento (Cartão/Pix): ')
    pagamento.tipo_pagamento = forma_de_pagamento

produtos = [
    Produto(67),
    Produto(36),
]

pedido = Pedido(produtos)
print(pedido)
print(pedido.produtos)

pagamento = Pagamento(pedido)
print(pagamento)

print(pagamento.tipo_pagamento)
escolher_forma_pagamento(pagamento)
print(pagamento.tipo_pagamento)