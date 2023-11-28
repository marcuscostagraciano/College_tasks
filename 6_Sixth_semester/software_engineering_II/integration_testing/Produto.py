class Produto:
    def __init__(self, cod_prod: int, nome_prod: str,
                 nome_fabricante: str, preco: int) -> None:
        self._codigo_prod = cod_prod
        self._nome_prod = nome_prod
        self._fabricante = nome_fabricante
        self._preco = preco

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
            f" - {self.nome_fabricante}: R$ {self.preco}"
