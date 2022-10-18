#include <stdio.h>
#include "esfera.h"

int main() {
    // Variável para o controle de execução do loop
    int isLooping = 1;
    
    do {
        Esfera *esfera;
        double raio;
        printf("Digite o raio da esfera: ");
        scanf("%lf", &raio);
        esfera = create(raio);
        
        printf("\nRaio: %.2lf\n",   getRaio(esfera));
        printf("Diametro: %.2lf\n", getDiametro(esfera));
        printf("Area: %.3lf\n",     getArea(esfera));
        printf("Volume: %.3lf\n\n", getVolume(esfera));
        destroy(esfera);
        
        if (raio == 0) {
            isLooping = 0;
        }
        
    } while (isLooping);
    
    return 0;
}