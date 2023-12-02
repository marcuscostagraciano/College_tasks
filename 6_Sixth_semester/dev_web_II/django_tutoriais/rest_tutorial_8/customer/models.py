from django.db import models


# Create your models here.
class Customer(models.Model):
    nome = models.CharField("Name", max_length=240)
    email = models.EmailField()
    created = models.DateField(auto_now_add=True)

    def __str__(self) -> str:
        return self.nome
