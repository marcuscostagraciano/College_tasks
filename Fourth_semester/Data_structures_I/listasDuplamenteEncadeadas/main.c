#include "listdup.h"

int main(void)
{
	ListaDUPLA *l;
	ListaDUPLA *achou;
	l = inicializa();
	
	l = insere (l, 15);
	l = insere (l, 20);
	l = insere (l, 30);
	l = insere (l, 40);

	imprime(l);
  l = retira(l, 20);
	
	//imprime(l);
   
	
	return 0;
}
