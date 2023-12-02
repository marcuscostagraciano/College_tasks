import pandas as pd

class Produto:
    def __init__(self, cod_prod: int) -> None:
        self._codigo_prod = cod_prod
        self.puxar_dados_por_cod_prod()

    def puxar_dados_por_cod_prod(self) -> None:
        produtos = pd.read_csv('mock_data/PRODUCTS.csv')
        produto = produtos.loc[produtos['cod_prod'] == self._codigo_prod]
        self._nome_prod = produto['nome_prod'].values[0]
        self._fabricante = produto['nome_fabricante'].values[0]
        self._preco = produto['preco'].values[0]

    @property
    def codigo_produto(self) -> int:
        return self._codigo_prod

    @codigo_produto.setter
    def codigo_produto(self, novo_codigo: int) -> None:
        self._codigo_prod = novo_codigo

    @property
    def nome_produto(self) -> str:
        return self._nome_prod

    @nome_produto.setter
    def nome_produto(self, novo_nome: str) -> None:
        self._nome_prod = novo_nome

    @property
    def nome_fabricante(self) -> str:
        return self._fabricante

    @nome_fabricante.setter
    def nome_fabricante(self, novo_nome: str) -> None:
        self._fabricante = novo_nome

    @property
    def preco(self) -> int:
        return self._preco

    @preco.setter
    def preco(self, novo_preco: int) -> None:
        self._preco = novo_preco

    def __str__(self) -> str:
        return f"Cod {self.codigo_produto}: {self.nome_produto}" + \
            f" - {self.nome_fabricante}. R$ {self.preco}"

produto = Produto(12)

print(produto.codigo_produto)
print(produto.nome_produto)
print(produto.nome_fabricante)
print(produto.preco)