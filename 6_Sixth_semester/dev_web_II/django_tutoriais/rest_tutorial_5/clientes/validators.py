import re
from validate_docbr import CPF


def cpf_valido(numero_cpf: str) -> bool:
    return CPF().validate(numero_cpf)


def nome_valido(nome: str) -> bool:
    return nome.isalpha()


def rg_valido(rg: str) -> bool:
    return len(rg) == 9


def celular_valido(celular: str) -> list:
    modelo = '[0-9]{2} [0-9]{5}-[0-9]{4}'
    return re.findall(modelo, celular)
