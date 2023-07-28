#include "pilha.h"

int main(){
    Pilha *p; // aponta para o topo da pilha
    p = inicializa();
    p = push(p, 10);
    p = push(p, 30);
    p = push(p, 40);
    
    imprime(p);
    printf("Valor removido do topo: %d\n", pop(&p));
    imprime(p);
    libera(p);
    
    return 0;
}
