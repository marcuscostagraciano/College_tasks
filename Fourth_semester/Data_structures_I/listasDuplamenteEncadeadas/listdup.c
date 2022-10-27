#include "listdup.h"

ListaDUPLA * inicializa(void) {
	return NULL;
}


ListaDUPLA * insere (ListaDUPLA* l, int v) {
	ListaDUPLA *novo = (ListaDUPLA*) malloc(sizeof(ListaDUPLA));
    novo -> info = v;
    novo -> prox = l;
    novo -> ant = NULL;

    if (!(l == NULL))
        l -> ant = novo;
    return novo;
}


ListaDUPLA * busca (ListaDUPLA* l, int v) {
	ListaDUPLA* p;
    for (p = l; !(p == NULL); p = p -> prox)
        if (p -> info == v)
            return p;
    return NULL; 
}


ListaDUPLA * retira (ListaDUPLA* l, int v) {
	ListaDUPLA* p = busca(l,v);
    
	if (p == NULL)
        return l; 
        
    if (l == p) 
        l = p -> prox;
    else
        p -> ant -> prox = p -> prox;

    if (!(p -> prox == NULL)) 
        p -> prox -> ant = p -> ant;

    free(p);
    return l;
}


void imprime(ListaDUPLA *l) {
    ListaDUPLA * aux = l;
    
    while(!(aux == NULL)) {
        printf("[%d] --> ", aux->info);
        aux = aux->prox;
    }
    
    printf("NULL\n");
}


int vazia(ListaDUPLA *l) {
    return (l == NULL);    
}


ListaDUPLA* insere_ordenado (ListaDUPLA *l, int v) {
    ListaDUPLA * p = l, *ant = NULL;
    ListaDUPLA *novo = (ListaDUPLA *) malloc(sizeof(ListaDUPLA));
        novo -> info = v;
    
    if (l == NULL) {
        novo -> ant = NULL;
        novo -> prox = NULL;
        return novo;
    }
    
    while (!(p == NULL) && (p -> info < v)) {
        ant = p;
        p = p -> prox;
    }
    
    if (ant == NULL) {
        p -> ant = novo;
        
        novo -> ant = ant;        
        novo -> prox = p;
        return  novo;
    } 
    else {
        if (!(p == NULL))
          p -> ant = novo;
        ant -> prox = novo;
        
        novo -> ant = ant;
        novo -> prox = p;
        return l;
    }
}


void libera(ListaDUPLA *l) {
    ListaDUPLA * p = l;
    ListaDUPLA * t;
    
    while(!(p == NULL)) {
        t = p -> prox;
        free(p);
        p = t;
    }
}


void imprime_inverso(ListaDUPLA *l) {
    ListaDUPLA *aux = ultimoElemento(l);
    
    while(!(aux == NULL)) {
        printf("[%d] --> ", aux -> info);
        aux = aux -> ant;
    }
    
    printf("NULL\n");
}


ListaDUPLA * ultimoElemento(ListaDUPLA *l) {
    ListaDUPLA * aux = l;
    
    while (!(aux -> prox == NULL))
        aux = aux -> prox;
    
    return aux;
}
