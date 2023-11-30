from Produto import Produto
from typing import TypeAlias

Produtos: TypeAlias = Produto | list[Produto] | tuple[Produto]


class Pedido:
    def __init__(self, prod: None | Produtos = None) -> None:
        match prod:
            case None:
                self._produtos = []
            case Produto():
                self._produtos = [prod]
            case list() | tuple():
                self._produtos.extend(prod)
            case _:
                raise TypeError("Only products are allowed")

    def add_produto(self, produto: Produtos) -> None:
        match produto:
            case Produto():
                self._produtos.append(produto)
            case list() | tuple():
                self._produtos.extend(produto)
            case _:
                raise TypeError("Only products are allowed")

    def remove_produto(self, produto: Produto) -> None:
        self._produtos.remove(produto)

    @property
    def valor_pedido(self) -> float | int:
        return sum([prod.preco for prod in self._produtos])

    def __str__(self) -> str:
        return f"{[prod.nome_produto for prod in self._produtos]}"
