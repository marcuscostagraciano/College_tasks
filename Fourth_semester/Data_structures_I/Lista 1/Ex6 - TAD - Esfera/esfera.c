#include <stdlib.h>     // Usado para as funções: malloc, free, exit.
#include <stdio.h>      // Usado para as funções: printf.
#include "esfera.h"

const double PI = 3.14159;

Esfera* create (double raio) {
    // Aloca na memória um espaço para dados do tipo abstrato Esfera.
    Esfera *e = (Esfera*) malloc(sizeof(Esfera));
    
    // Caso não haja espaço na memória (for nulo), retornará a mensagem de erro e o espaço não será alocado.
    if (e == NULL) {
    	printf("Memória insuficiente!\n");
        exit(1);
    }
    
    // Atribui o parâmetro raio para o raio da esfera
    e -> raio = raio;
    return e;
}


void destroy(Esfera* e) {
    // Libera o espaço de memória alocada para certa esfera.
    free(e);
}


double getRaio(Esfera* e) {
    // Retorna o raio da esfera.
    return e -> raio;
}

double getDiametro(Esfera* e) {
    // Retorna o diâmetro da esfera.
    return (e -> raio) * 2;
}

double getArea(Esfera* e) {
    // Retorna a área da esfera.
    return (4.0 * PI * ((e -> raio) * (e -> raio)));
}


double getVolume(Esfera* e) {
    // Retorna o volume da esfera.
    return (getArea(e) * (e->raio) / 3.0);
}
