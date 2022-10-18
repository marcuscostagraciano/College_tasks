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
Lista * busca(Lista *lista, int procurado);
int indexOf(Lista *lista, int element);
int get(Lista *lista, int element);
Lista * retira(Lista *l, int v);
void libera(Lista *l);

int main() {
    Lista *lista;
    lista = init();
    lista = insertStart(lista, 15);
    lista = insertStart(lista, 20);
    lista = insertStart(lista, 30);
    lista = insertStart(lista, 40);
    lista = insertStart(lista, 50);
    printf("inLista: %d\n", inLista(lista, 30));
    printf("indexOf: %d\n", indexOf(lista, 30));
    printf("first element: %d\n", lista -> info);
    printf("getElement using index 0: %d\n", get(lista, 0));
    
    lista = retira(lista, 15);
    lista = retira(lista, 30);
    libera(lista);
    
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


Lista * busca(Lista *lista, int procurado) {
    for (Lista *aux = lista; aux != NULL; aux = aux -> prox){
        if (aux -> info == procurado){
            return aux;
        }
    }
    
    return NULL;
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


int get(Lista *lista, int element) {
    int count = 0;
    for (Lista *aux = lista; aux != NULL; aux = aux -> prox){
        if (count == element){
            return aux -> info;
        }
        count++;
    }
}


Lista * retira(Lista * l, int v){
    Lista *ant = NULL;
    Lista *p = l;
   
    
    while (p != NULL && p->info != v){
        ant = p;
        p = p->prox;
    }
    if (p == NULL)
        return l;
        
    if (ant == NULL)
        l = p->prox;
    else{
        ant->prox = p->prox;
    }
    
    free(p);
    
    return l;
}


void libera(Lista *l) {
    Lista *p = l;
    Lista *t;
    
    while (!(p == NULL)) {
        t = p -> prox;  // Guarda a referência para o próximo elemento
        free(p);        // Libera a memória apontada por P
        p = t;          // Aponta para o próximo elemento
    }
}
