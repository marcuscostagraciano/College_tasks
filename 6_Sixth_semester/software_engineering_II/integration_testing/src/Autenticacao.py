import pandas as pd

class Autenticacao:
    def __init__(self, senha: str, email: str) -> None:
        self._senha = senha
        self._email = email
        self._nome = None
        self._conta = None
        self.validarUsuario()

    def validarUsuario(self) -> None:
        try:
            usuarios = pd.read_csv('mock_data/USERS.csv', index_col='email')
            usuario = usuarios.loc[self.email]
        
            if (str(usuario.senha) != self.senha):
                raise Exception('Usuário inválido')
            
        except KeyError:
            print('E-mail não cadastrado')

        except Exception as e:
            print(e)

        else:
            self._nome = usuario.nome
            self._conta = usuario.conta

    @property
    def email(self) -> str:
        return self._email

    @property
    def nome(self) -> str:
        return self._nome

    @property
    def senha(self) -> str:
        return self._senha

    @property
    def conta(self) -> str:
        return self._conta

    def __str__(self) -> str:
        return f"Nome: {self.nome}. E-mail: {self.email}"