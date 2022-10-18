#include <stdio.h>

int main() {
    int qtdJogos, pontuacaoMaria = 0, pontuacaoJoao = 0, 
        distanciaAteCentro, distanciaAteAlvo;
    scanf("%d", &qtdJogos);
    
    for (int i = 0; i < qtdJogos; i++) {
        for (int j = 0; j < 3; j++){
            scanf("%d %d", &distanciaAteCentro, &distanciaAteAlvo);
            pontuacaoJoao += distanciaAteCentro * distanciaAteAlvo;
        }
        
        for (int j = 0; j < 3; j++){
            scanf("%d %d", &distanciaAteCentro, &distanciaAteAlvo);
            pontuacaoMaria += distanciaAteCentro * distanciaAteAlvo;
        }
        
        if (pontuacaoJoao < pontuacaoMaria){
            printf("MARIA\n");
        } else {
            printf("JOAO\n");
        }
        
        pontuacaoMaria = 0; pontuacaoJoao = 0;
    }
    

    return 0;
}