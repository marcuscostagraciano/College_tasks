from django.db import models


# Create your models here.
class Book(models.Model):
    title = models.CharField(max_length=250)
    subtitle = models.CharField(max_length=250)
    author = models.CharField(max_length=100)
    isbn = models.CharField(max_length=13)

    class Meta:
        db_table = 'books'

    def __str__(self) -> str:
        return f"{self.title}: {self.subtitle}"
