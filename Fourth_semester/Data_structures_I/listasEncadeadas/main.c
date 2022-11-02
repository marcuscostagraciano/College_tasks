#include "listaEncadeada.h"

int main(){
    Lista * lista;
    lista = inicializa();
    lista = append(lista, 5);
    lista = append(lista, 25);
    lista = insere(lista, 20);
    imprime(lista);
    
    lista = retira(lista, 20);
    imprime(lista);
    
    return 0;
}
