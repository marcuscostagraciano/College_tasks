#include "listaEncadeada.h"

Lista * inicializa(){
    return NULL;
}

Lista * insere(Lista * l, int i){
    Lista * novo = (Lista *) malloc(sizeof(Lista));
        novo -> info = i;
        novo -> prox = l;
    
    return novo;
}

Lista * append(Lista *l, int valor) {
    Lista * novo = (Lista *) malloc(sizeof(Lista));
        novo -> info = valor;
        novo -> prox = NULL;
    Lista * p = l;
    
    if (l == NULL)
        return insere(l, valor);
    
    while(!(p -> prox == NULL))
        p = p -> prox;
        
    p -> prox = novo;
    return l;
}

Lista * insere_ordenado(Lista * l, int i){
    Lista * p = l, *ant = NULL;
    Lista * novo = (Lista *) malloc(sizeof(Lista));
        novo->info = i;
    
    if (l == NULL){
        novo -> prox = NULL;
        return novo;
    }
    
    while (!(p == NULL) && (p -> info < i)){
        ant = p;
        p = p -> prox;
    }
    
    if (ant == NULL){
        novo -> prox = p;
        return  novo;
    } else {
        ant -> prox = novo;
        novo -> prox = p;
        return l;
    }
}

void imprime(Lista *l){
    Lista * aux = l;
    
    while(!(aux == NULL)){
        printf("[%d] --> ", aux -> info);
        aux = aux->prox;
    }
    
    printf("NULL\n");
}

int naLista(Lista *l, int procurado){
    for (Lista * aux = l; !(aux == NULL); aux = aux -> prox){
        if(aux -> info == procurado)
            return 1;
    }
    
    return 0;
}

Lista * busca(Lista *l, int procurado){
    for (Lista * aux = l; !(aux == NULL); aux = aux -> prox){
        if(aux -> info == procurado)
            return aux;
    }
    
    return NULL;
}

int vazia(Lista *l){
    return (l == NULL);
}

Lista * retira(Lista * l, int v){
    Lista * ant = NULL;
    Lista * p = l;
   
    while (!(p == NULL) && !(p -> info == v)){
        ant = p;
        p = p -> prox;
    }
    
    if (p == NULL)
        return l;
        
    if (ant == NULL)
        l = p -> prox;
        
    else {
        ant -> prox = p -> prox;
    }
    
    free(p);
    return l;
}

void libera(Lista *l){
    Lista * p = l;
    Lista * t;
    
    while(!(p == NULL)){
        t = p -> prox;
        free(p);
        p = t;
    }
}
