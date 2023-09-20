#include <stdio.h>
#include <stdlib.h>

struct lista{
  int info;
  struct lista *prox;
};

typedef struct lista Lista;

// Inicializa uma lista.
Lista * inicializa(void);

// Insere um elemento no início da lista.
Lista * insere(Lista * l, int i);

// Insire um elemento no fim da lista.
Lista * append(Lista *l, int valor);

// Insere um elemento na lista de forma ordenada (do menor pro maior).
Lista * insere_ordenado(Lista * l, int i);

// Imprime os elementos presentes na lista (do primeiro pro último).
void imprime(Lista *l);

// Verifica se o número está ou não na lista.
int naLista(Lista *l, int procurado);

// Retorna o endereço do número procurado na lista.
Lista * busca(Lista *l, int procurado);

// Retira um número da lista.
Lista * retira(Lista * l, int v);

// Verifica se a lista está vazia.
int vazia(Lista *l);

// 
void libera(Lista *l);
