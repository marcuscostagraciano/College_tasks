#include <stdio.h>
#include <math.h>

int main() {
    int qtd_casas[3],tamanhoTabuleiro;
    scanf("%d", &tamanhoTabuleiro);
    
    qtd_casas[0] = tamanhoTabuleiro * tamanhoTabuleiro;
    qtd_casas[1] = ceil(qtd_casas[0] / 2.0);
    qtd_casas[2] = floor(qtd_casas[0] / 2.0);
    
    printf("%d casas brancas e %d casas pretas\n", 
            qtd_casas[1], qtd_casas[2]);

    return 0;
}