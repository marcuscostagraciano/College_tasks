#include "pilha.h"

Pilha * inicializa(void) {
    return NULL;
}

void imprime(Pilha *p) {
    Pilha * q;
    
    for (q = p; !(q == NULL); q = q -> prox)
        printf("%d \n", q -> info);
}

int vazia(Pilha *p) {
    return (p == NULL);
}

void libera(Pilha *p) {
    Pilha *q = p;
    
    while (!(q == NULL)) {
        Pilha *temp = q -> prox;
        free(q);
        q = temp;
    }
}

Pilha * push(Pilha *p, int v) {
    Pilha * aux = p;
    Pilha * novo = (Pilha *) malloc(sizeof(Pilha));
        novo -> info = v;
        novo -> prox = NULL;
    
    if (!vazia(aux)) {
        while(!(aux -> prox == NULL))
            aux = aux -> prox;
            
        aux -> prox = novo;
        return p;
    }
    
    return novo;
}

// WIP
int pop(Pilha **p) {
    if (!(p == NULL)) {
        while (!(p -> prox == NULL))
            p = p -> prox;
        
        free(p -> prox);
        p -> prox == NULL;
        return (p -> info);
    }
}

Pilha * ultimoElemento(Pilha *p) {
    Pilha * aux = p;
    
    while (!(aux -> prox == NULL))
        aux = aux -> prox;
    
    return aux;
}
