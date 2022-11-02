#include <stdio.h>
#include <stdlib.h>

typedef struct pilha Pilha;

// Inicializa uma pilha.
Pilha * inicializa(void);

// imprime os elementos da pilha.
void imprime(Pilha *p);

// Verifica se a pilha está vazia.
int vazia(Pilha *p);

// Libera a pilha deve antes liberar todos os elementos.
void libera(Pilha *p);

// Insere um elemento no topo da pilha.
Pilha * push(Pilha *p, int v);

// Retira o elemento do topo da pilha.
int pop(Pilha **p);
