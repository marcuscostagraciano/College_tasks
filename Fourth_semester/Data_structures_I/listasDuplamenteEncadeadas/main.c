#include "listdup.h"

int main(void) {
    
	ListaDUPLA *l;
	ListaDUPLA *achou;
	l = inicializa();
    
	l = insere_ordenado(l, 10);
	l = insere_ordenado(l, 15);
	l = insere_ordenado(l, 20);
	l = insere_ordenado(l, 30);
	l = insere_ordenado(l, 40);
	l = insere_ordenado(l, 50);

	l = insere_ordenado(l, 5);
	l = insere_ordenado(l, 1);
	l = insere_ordenado(l, 3);
	l = insere_ordenado(l, 0);
	l = append(l, 5);
	l = insere_ordenado(l, 2);
	l = insere_ordenado(l, 2);

	printf("Impressão do elementos da lista: \n");
	imprime(l);
	printf("\nImpressão inversa dos elementos da lista: \n");
	imprime_inverso(l);
	printf("Qtd de números %d: %d\n\n", 2, count(l, 2));
    
    
    ListaDUPLA *l1 = inicializa(), *l2 = inicializa(), *l1ext = inicializa();
    l1 = insere_ordenado(l1, 0); l1 = insere_ordenado(l1, 1);
    l2 = insere_ordenado(l2, 2); l2 = insere_ordenado(l2, 3);
    
	printf("l1: \n");
	imprime(l1);
	
	printf("l2: \n");
	imprime(l2);
	printf("Posição do 2 na l2: %d\n", indexOf(l2, 2));
	
	printf("l1 extendida: \n");
	extend(l1, l2);
	imprime(l1);
	printf("Posição do 2 na l1: %d\n", indexOf(l1ext, 2));
    
	return 0;
}
