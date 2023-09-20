#include <stdio.h>

int main() {
    int e, f, c, refrigerantesTomados = 0;
    scanf("%d %d %d", &e, &f, &c);
    
    if ((e + f) != 0){
        int qtdLatas = e + f;
        
        while (c <= qtdLatas){
            refrigerantesTomados++;
            qtdLatas -= c;
            qtdLatas++;
        }
    }
    
    
    printf("%d\n", refrigerantesTomados);


    return 0;
}