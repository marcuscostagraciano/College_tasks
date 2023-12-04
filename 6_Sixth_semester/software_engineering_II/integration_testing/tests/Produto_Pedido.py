from .path_normalizer import normalize_path
normalize_path()

from src.Produto import Produto
from src.Pedido import Pedido


prod1 = Produto(12)
prod2 = Produto(16)
prod3 = Produto(23)
prod4 = Produto(5)
prod5 = Produto(67)
ped = Pedido([prod1, prod2, prod3, prod4, prod5])

print(ped)
print(f"{ped.valor_pedido:.3f}")

prod6 = Produto(54)
ped.add_produto(prod6)

print(ped)
print(f"{ped.valor_pedido:.3f}")

prod7 = Produto(54)
ped.add_produto(prod6)

print(ped)
print(f"{ped.valor_pedido:.3f}")

ped.remove_produto(prod6)

print(ped)
print(f"{ped.valor_pedido:.3f}")
