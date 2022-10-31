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
    } else {
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

ListaDUPLA * append(ListaDUPLA *l, int elemento) {
    if (l == NULL)
        l = insere(l, elemento);
    
    else {
        ListaDUPLA * ultimo = ultimoElemento(l);
        ListaDUPLA * novo = (ListaDUPLA *) malloc(sizeof(ListaDUPLA));
            novo -> ant = ultimo;
            novo -> info = elemento;
            novo -> prox = NULL;
        ultimo -> prox = novo;
    }
        
    return l;
}

int count(ListaDUPLA *l, int elemento) {
    ListaDUPLA * aux;
    int countElemento = 0;
    
    for (aux = l; !(aux == NULL); aux = aux -> prox)
        if (aux -> info == elemento)
            countElemento++;

    return countElemento;
}

void * extend(ListaDUPLA *l1, ListaDUPLA *l2) {
    ListaDUPLA * aux = ultimoElemento(l1);
    aux -> prox = l2;
    l2 -> ant = aux;
    
    return l1;
} 

int indexOf(ListaDUPLA *l, int elemento) {
    ListaDUPLA * aux;
    int index = 0;
    
    for (aux = l; !(aux == NULL); aux = aux -> prox) {
        if (aux -> info == elemento)
            return index;
        index++;
    }
}

int getElementoByIndex(ListaDUPLA *l, int index) {
    ListaDUPLA * aux;
    int curIndex = 0;
    
    for (aux = l; !(aux == NULL); aux = aux -> prox) {
        if (curIndex == index)
            return aux -> info;
        curIndex++;
    }
    
    // Retorna -1 para sinalizar erro, já que a lista não tem um index -1.
    exit(-1);
}

ListaDUPLA * slice(ListaDUPLA *l, int startingPos, int endingPos) {
    ListaDUPLA * novaLista = inicializa();
    
    if (startingPos > endingPos) {
        int temp = startingPos;
        startingPos = endingPos;
        endingPos = temp;
        
        for (int i = startingPos; i < endingPos; i++)
            novaLista = insere(novaLista, getElementoByIndex(l, i));
                
    } else {
        for (int i = startingPos; i < endingPos; i++)
            novaLista = append(novaLista, getElementoByIndex(l, i));
    }
    
    return novaLista;
}
