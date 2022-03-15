with open("en_fahrenheit-451.txt", encoding="utf8") as file:
    text = file.read().lower()
    
import unidecode
letters = [unidecode.unidecode(l) for l in text if l.isalpha()]

from collections import Counter
letters_frequency = dict(Counter(letters))

alp_letters_frequency = {}
for i in sorted (letters_frequency) :
    alp_letters_frequency[i] = letters_frequency[i]