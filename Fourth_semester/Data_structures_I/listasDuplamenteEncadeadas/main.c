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

	printf("Impressão do elementos da lista: \n");
	imprime(l);
	l = retira(l, 20);
	printf("\nImpressão inversa dos elementos da lista: \n");
	imprime_inverso(l);  

	return 0;
}
