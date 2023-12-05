from .Pedido import Pedido
import regex_spm

class Pagamento:
    def __init__(self, ped: Pedido) -> None:
        self._pedido = ped
        self._tipo_pagamento = ''

    @property
    def tipo_pagamento(self) -> str:
        return self._tipo_pagamento
    
    @property
    def pedido(self) -> str:
        return self._pedido

    @tipo_pagamento.setter
    def tipo_pagamento(self, tipo_pagamento: str) -> None:
        tipo_pagamento: str = tipo_pagamento.lower()

        match regex_spm.fullmatch_in(tipo_pagamento):
            case r'^cart(a|ã)o$':
                self._tipo_pagamento = 'Cartao'
            case r'^pix$':
                self._tipo_pagamento = 'Pix'
            case _:
                raise TypeError('Property Pagamento.tipo_pagamento must be "Cartao" or "Pix"')
            
    def __str__(self) -> str:
        produtos = 'código | produto | fabricante | preço\n'

        for produto in self.pedido.produtos:
            print(produto)
            produtos += f'{produto["codigo_produto"]} | {produto["nome_produto"]} | {produto["nome_fabricante"]} | {produto["preco"]}\n'

        return f'{produtos}'
