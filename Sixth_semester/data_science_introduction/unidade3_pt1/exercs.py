from dataclasses import dataclass, field
from math import ceil
import matplotlib.pyplot as plt

# quase um json
all_data = {
    'ex1': {
        'data': [108, 139, 120, 123, 120, 132, 123, 131, 131,
                 157, 150, 124, 111, 101, 135, 119, 116, 117,
                 127, 128, 139, 119, 118, 114, 127],
        'num_classes': 5
    },
    'ex2': {
        'data': [121, 148, 94, 142, 170, 88, 221, 106,
                 186, 85, 18, 106, 67, 149, 28, 60,
                 101, 134, 139, 168, 92, 154, 53, 66],
        'num_classes': 6
        }
}

@dataclass
class Dados:
    """  """
    amostras: list[int]
    num_classes: int
    menor_valor: int = field(init=False)
    maior_valor: int = field(init=False)
    amplitude_total: int = field(init=False)
    largura_classe: int = field(init=False)

    def __post_init__(self):
        self.menor_valor = min(self.amostras)
        self.maior_valor = max(self.amostras)
        self.amplitude_total = self.maior_valor - self.menor_valor
        self.largura_classe = ceil(self.amplitude_total / self.num_classes)

    def get_ultimo_limite_superior(self) -> int:
        return self.menor_valor + \
            ((self.num_classes - 1) * self.largura_classe) + \
            (self.largura_classe - 1)


dados_exerc = Dados(all_data['ex1']['data'], all_data['ex1']['num_classes'])

amostras = dados_exerc.amostras
menor_valor = dados_exerc.menor_valor
ultimo_limite_superior = dados_exerc.get_ultimo_limite_superior()
largura_classes = dados_exerc.largura_classe

classes = list(range(menor_valor - largura_classes,
                     ultimo_limite_superior,
                     largura_classes))
classes.append(ultimo_limite_superior)
classes.append(ultimo_limite_superior + largura_classes)

plt.xticks(classes)
frequencias, limites_inferiores, _ = plt.hist(amostras,
                                              bins=classes,
                                              edgecolor='k')

pontos_medios = 0.5 * (limites_inferiores[1:] + limites_inferiores[:-1])
plt.plot(pontos_medios, frequencias, 'k--o')
plt.show()
