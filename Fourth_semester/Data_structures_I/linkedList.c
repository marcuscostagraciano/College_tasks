#include <stdio.h>
#include <stdlib.h>

typedef struct lista {
    int info;
    struct lista *prox;
} Lista;

Lista * init(void);
Lista * insertStart(Lista *lista, int elemento);
void print(Lista *lista);
int inLista(Lista *lista, int element);
int indexOf(Lista *lista, int element);

int main() {
    Lista *lista;
    lista = init();
    lista = insertStart(lista, 15);
    lista = insertStart(lista, 20);
    lista = insertStart(lista, 30);
    printf("inLista: %d\n", inLista(lista, 5));
    printf("indexOf: %d\n", indexOf(lista, 15));
    printf("f1: %d", lista -> info);
    
    
    return 0;
}


Lista * init(void) {
    return NULL;
}


Lista * insertStart(Lista *lista, int elemento) {
    Lista *novo = (Lista *) malloc(sizeof(Lista));
    novo -> info = elemento;
    novo -> prox = lista;
    
    return novo;
}


void print(Lista *lista) {
    /* Versão com While */
    Lista * aux = lista;
    
    printf("[");
    while (!(aux == NULL)) {
        printf("%d, ", aux -> info);
        aux = aux -> prox;
    }
    printf("]\n");
}


int inLista(Lista *lista, int element) {
    for (Lista *aux = lista; aux != NULL; aux = aux -> prox){
        if (aux -> info == element){
            return 1;
        }
    }
    
    return 0;
}


int indexOf(Lista *lista, int element) {
    int count = 0;
    for (Lista *aux = lista; aux != NULL; aux = aux -> prox){
        if (aux -> info == element){
            return count;
        }
        count++;
    }
    
    return 0;
}
