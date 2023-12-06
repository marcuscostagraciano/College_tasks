from .Autenticacao import Autenticacao
from .Pedido import Pedido
import pandas as pd
import regex_spm


class Pagamento:
    def __init__(self, ped: Pedido, aut: Autenticacao) -> None:
        self._pedido = ped
        self._tipo_pagamento = None
        self._conta = aut.conta

    def pagar(self) -> None:
        try:
            if(self.tipo_pagamento == None):
                raise Exception('Escolha a forma de pagamento.')
            
            if(self.pedido.valor_pedido > self.saldo):
                raise Exception('Não foi possível efetuar o pagamento: saldo insuficiente.')
            
            contas = pd.read_csv('mock_data/CONTAS.csv', index_col='conta')

            if(self.tipo_pagamento == 'Pix'):
                contas.loc[self.conta].saldo -= self.pedido.valor_pedido
        
            if(self.tipo_pagamento == 'Cartao'):
                contas.loc[self.conta].limite_disponivel -= self.pedido.valor_pedido

            contas.to_csv('mock_data/CONTAS.csv')

        except Exception as e:
            print(e)

    @property
    def saldo(self) -> float:
        contas = pd.read_csv('mock_data/CONTAS.csv', index_col='conta')
        conta = contas.loc[self.conta]
        
        if(self.tipo_pagamento == 'Pix'):
            return conta.saldo
        
        if(self.tipo_pagamento == 'Cartao'):
            return conta.limite_disponivel
        
        raise Exception('Escolha a forma de pagamento.')

    @property
    def pedido(self) -> str:
        return self._pedido
    
    @property
    def conta(self) -> str:
        return self._conta

    @property
    def tipo_pagamento(self) -> str:
        return self._tipo_pagamento

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

        produtos += f'Valor Total: {self.pedido.valor_pedido}'

        return f'{produtos}'
