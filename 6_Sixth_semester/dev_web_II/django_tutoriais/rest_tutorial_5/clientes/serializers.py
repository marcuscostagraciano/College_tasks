from rest_framework import serializers
from .models import Cliente
from .validators import cpf_valido, nome_valido, rg_valido, celular_valido


class ClienteSerializer(serializers.ModelSerializer):
    class Meta:
        model = Cliente
        fields = '__all__'

    def validate(self, data):
        if not cpf_valido(data['cpf']):
            raise serializers.ValidationError({'cpf': "Número de CPF inválido"})

        if not nome_valido(data['nome']):
            raise serializers.ValidationError({'nome': "Não inclua números neste campo"})

        if not rg_valido(data['rg']):
            raise serializers.ValidationError({'rg': "O RG deve ter 9 dígitos"})

        if not celular_valido(data['celular']):
            raise serializers.ValidationError(
                {'celular':
                    "O número de celular deve seguir este modelo: 12 12345-6789 (respeitando os espaços e traço)"}
                )
        return data
