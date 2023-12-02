from Pedido import Pedido

class Pagamento:
    def __init__(self, ped: Pedido) -> None:
        ...

    @property
    def tipo_pagamento(self) -> str:
        return self.tipo_pagamento

    @tipo_pagamento.setter
    def tipo_pagamento(self, tipo_pagamento: str) -> None:
        tipo_pagamento: str = tipo_pagamento.lower()

        match tipo_pagamento:
            case 'cartao':
                self.tipo_pagamento = 'Cartao'
            case 'pix':
                self.tipo_pagamento = 'Pix'
            case _:
                raise TypeError('Property Pagamento.tipo_pagamento must be "Cartao" or "Pix"')