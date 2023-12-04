class Autenticacao:
    def __init__(self, nome: str, email: str) -> None:
        self._nome = nome
        self._email = email

    @property
    def nome(self) -> str:
        return self._nome

    @nome.setter
    def nome(self, novo_nome) -> None:
        self._nome = novo_nome

    @property
    def email(self) -> str:
        return self._email

    @email.setter
    def email(self, novo_email) -> None:
        self._email = novo_email

    def __str__(self) -> str:
        return f"Nome: {self.nome}. Email: {self.email}"
