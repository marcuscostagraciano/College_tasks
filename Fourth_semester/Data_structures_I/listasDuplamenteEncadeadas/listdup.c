#include "listdup.h"

ListaDUPLA * inicializa(void){
	return NULL;
}


ListaDUPLA * insere (ListaDUPLA* l, int v){
	ListaDUPLA *novo = (ListaDUPLA*) malloc(sizeof(ListaDUPLA));
    novo -> info = v;
    novo -> prox = l;
    novo -> ant = NULL;

    if (!(l == NULL))
        l -> ant = novo;
    return novo;
}


ListaDUPLA * busca (ListaDUPLA* l, int v){
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


void imprime(ListaDUPLA *l){
    ListaDUPLA * aux = l;
    
    while(!(aux == NULL)){
        printf("[%d] --> ", aux->info);
        aux = aux->prox;
    }
    
    printf("NULL\n");
}


int vazia(ListaDUPLA *l) {
    return (l == NULL);    
}


ListaDUPLA* insere_ordenado (ListaDUPLA *l, int v) {

}


ListaDUPLA* insere_ordenado (ListaDUPLA *l, int v) {
    
}


void libera(ListaDUPLA *l) {
    
}


void imprime_inverso(ListaDUPLA *l) {
    
}
