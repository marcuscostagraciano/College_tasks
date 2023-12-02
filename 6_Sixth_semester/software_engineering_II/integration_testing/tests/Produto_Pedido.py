import sys

sys.path.insert(0, '/home/gianluca/dev/College_tasks/6_Sixth_semester/software_engineering_II/integration_testing')

from Produto import Produto
from Pedido import Pedido

prod1 = Produto(12)
prod2 = Produto(16)
prod3 = Produto(23)
prod4 = Produto(5)
prod5 = Produto(67)
ped = Pedido([prod1, prod2, prod3, prod4, prod5])

print(ped)
print(ped.valor_pedido)

prod6 = Produto(54)
ped.add_produto(prod6)

print(ped)
print(ped.valor_pedido)

prod7 = Produto(54)
ped.add_produto(prod6)

print(ped)
print(ped.valor_pedido)

ped.remove_produto(prod6)

print(ped)
print(ped.valor_pedido)
