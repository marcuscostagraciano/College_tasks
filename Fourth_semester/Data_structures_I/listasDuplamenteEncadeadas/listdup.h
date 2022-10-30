#include <stdio.h>
#include <stdlib.h>

struct listaDup {
	struct listaDup* ant;
	int info;
    struct listaDup* prox;
};
typedef struct listaDup ListaDUPLA;

// inicializa uma lista.
ListaDUPLA* inicializa(void);

// Insere um elemento no início da lista.
ListaDUPLA* insere (ListaDUPLA* l, int v);

// Retorna o endereço do número procurado na lista.
ListaDUPLA* busca (ListaDUPLA* l, int v);

// Retira um número da lista.
ListaDUPLA* retira (ListaDUPLA* l, int v);

// Imprime os elementos presentes na lista (do primeiro pro último).
void imprime(ListaDUPLA *l);

// Verifica se a lista está vazia
int vazia(ListaDUPLA *l);

// Insere um elemento na lista de forma ordenada (do menor pro maior).
ListaDUPLA* insere_ordenado (ListaDUPLA *l, int v);

// Insere um elemento na última posição da lista.
ListaDUPLA * append(ListaDUPLA *l, int elemento);

// Retorna o endereço do último elemento da lista (útil para a impressão inversa).
ListaDUPLA * ultimoElemento(ListaDUPLA *l);

// Imprime os elementos presentes na lista (do último pro primeiro).
void imprime_inverso(ListaDUPLA *l);

// Retorna o número de aparições de um elemento na lista.
int count(ListaDUPLA *l, int elemento);

// Adiciona os elementos da lista 2 na lista 1.
void * extend(ListaDUPLA *l1, ListaDUPLA *l2);

// Retorna o índice do primeiro elemento com o valor especificado.
int indexOf(ListaDUPLA *l, int elemento);

// 
void libera(ListaDUPLA *l);
