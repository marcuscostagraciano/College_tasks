import pandas as pd

class Autenticacao:
    def __init__(self, senha: str, email: str) -> None:
        self._senha = senha
        self._email = email

        usuarios = pd.read_csv('mock_data/USERS.csv')

        

    @property
    def senha(self) -> str:
        return self._senha

    @senha.setter
    def senha(self, novo_senha) -> None:
        self._senha = novo_senha

    @property
    def email(self) -> str:
        return self._email

    @email.setter
    def email(self, novo_email) -> None:
        self._email = novo_email

    def __str__(self) -> str:
        return f"senha: {self.senha}. Email: {self.email}"
