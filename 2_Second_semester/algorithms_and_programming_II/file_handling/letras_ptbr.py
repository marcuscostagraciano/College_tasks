with open("ptbr_fahrenheit-451.txt", encoding="utf8") as file_ptbr:
    texto = file_ptbr.read().lower()
    
"""
Número de vezes que uma palavra aparece no texto:

texto_sem_pontuacao = " "
for palavra in texto:
    if palavra.isalpha() or palavra == " ":
        texto_sem_pontuacao += palavra

palavras = texto_sem_pontuacao.split()

frequencia_palavras = {}
for palavra in palavras:
    frequencia_palavras[palavra] = frequencia_palavras.get(palavra, 0)+1
"""
import unidecode
# Usando o módulo unidecode para ignorar os acentos, fazendo a frequência das letras mais fiel

letras = [unidecode.unidecode(l) for l in texto if l.isalpha()]

""" Sem usar o counter
frequencia_letras = {}
for letra in letras:
    frequencia_letras[letra] = frequencia_letras.get(letra, 0)+1

from operator import itemgetter
top_letras = sorted(frequencia_letras.items(), key=itemgetter(1), reverse=True)

for letra, qtde in top_letras:
    print (f"{letra}: {qtde}")
"""

# Usando o counter:
from collections import Counter
frequencia_letras = Counter(letras)
frequencia_letras_alf = {}

for i in sorted (frequencia_letras) :
    frequencia_letras_alf[i] = frequencia_letras[i]