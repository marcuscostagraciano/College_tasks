import os, django

os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'crm_project.settings')
django.setup()

from faker import Faker
import random
from customer.models import Customer


def criando_pessoas(quantidade_de_pessoas):
    fake = Faker('pt_BR')
    Faker.seed(10)
    for _ in range(quantidade_de_pessoas):
        name = fake.name()
        email = '{}@{}'.format(name.lower(),fake.free_email_domain())
        email = email.replace(' ', '')
        created = fake.date()
        p = Customer(name=name, email=email, created=created)
        p.save()


criando_pessoas(50)
print("Pessoas criadas com sucesso!")
