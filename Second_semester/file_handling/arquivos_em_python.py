from letras_ptbr import frequencia_letras, letras, frequencia_letras_alf
from letters_en import alp_letters_frequency

import matplotlib.pyplot as plt
import numpy as np
import collections

frequencia_letras = frequencia_letras_alf
letters_frequency = alp_letters_frequency

labels = frequencia_letras.keys()
letras = collections.Counter(frequencia_letras).values()
letters = collections.Counter(letters_frequency).values()

x = np.arange(len(labels))
width = 0.3

fig, ax = plt.subplots()
rects1 = ax.bar(x - width/2, letras, width, label='Português')
rects2 = ax.bar(x + width/2, letters, width, label='Inglês')

ax.set_ylabel('# de vezes')
ax.set_title('Frequência de letras: Fahrenheit 451')
ax.set_xticks(x)
ax.set_xticklabels(labels)
ax.legend()

plt.show()