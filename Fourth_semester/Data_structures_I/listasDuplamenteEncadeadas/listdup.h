#include<stdio.h>
#include<stdlib.h>

struct listaDup {
	int info;
    struct listaDup* ant;
    struct listaDup* prox;
};
typedef struct listaDup ListaDUPLA;

ListaDUPLA* inicializa(void);

ListaDUPLA* insere (ListaDUPLA* l, int v);

ListaDUPLA* busca (ListaDUPLA* l, int v);

ListaDUPLA* retira (ListaDUPLA* l, int v);

void imprime(ListaDUPLA *l);

/*
int vazia(ListaDUPLA *l);

ListaDUPLA* insere_ordenado (ListaDUPLA *l, int v);

void libera(ListaDUPLA *l);

void imprime_inverso(ListaDUPLA *l);

*/
