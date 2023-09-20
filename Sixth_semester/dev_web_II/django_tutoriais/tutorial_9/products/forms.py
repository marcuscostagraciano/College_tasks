from collections.abc import Mapping
from typing import Any
from django import forms
from django.core.files.base import File
from django.db.models.base import Model
from django.forms.utils import ErrorList
from .models import Product

class ProductForm(forms.ModelForm):
    def __init__(self, *args, **kwargs):
        super(ProductForm, self).__init__(*args, **kwargs)
        self.fields['name'].widget.attrs = {
        'class': 'form-control col-md-6'
        }
        self.fields['description'].widget.attrs = {
        'class': 'form-control col-md-6'
        }
        self.fields['price'].widget.attrs = {
        'class': 'form-control col-md-6',
        'step': 'any',
        'min': '1',
        }
        
    class Meta:
        model = Product
        fields = ('name', 'description', 'price')
