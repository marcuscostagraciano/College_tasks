#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isEasy(char *surname);
int len(char *word);
void copyString(char *str1, char *str2);

int main() {
    char surname[42], aux_surname[42];
    int surnameQty;
    
    // Scans the number of surnames for checking.
    scanf("%d", &surnameQty);
    
    for (int i = 0; i < surnameQty; i++){
        scanf("%s", surname);
        
        // Calling the copyString() so the aux_surname can be 
        // updated without changing the original array.
        copyString(surname, aux_surname);
        
        // Calling the isEasy() to check if the surname is easy or not.
        if (isEasy(aux_surname)){
            printf("%s nao eh facil\n", surname);
        }
        else {
            printf("%s eh facil\n", surname);
        }
        
        // Cleans the aux_surname after every checking.
        memset(aux_surname, 0, 42);
    }
    
    
    return 0;
}


int isEasy(char *surname) {
    const char CONSONANTS[] = "bcdfghjklmnpqrstvwxyz";
    int surnameLength = len(surname);
    
    for (int i = 0; i < (surnameLength - 2); i++) {
        if (strchr(CONSONANTS, surname[i]) && strchr(CONSONANTS, surname[i + 1]) && strchr(CONSONANTS, surname[i + 2])) {
            return 1;
        }
    }
    
    return 0;
}


int len(char *word) {
    int letterQty = 0;
    
    for (int i = 0; word[i] != '\0'; i++){
        letterQty++;
    }
    
    return letterQty;
}


void copyString(char *str1, char *str2){
    for (int i = 0; i < len(str1); i++){
            str2[i] = tolower(str1[i]);
    }
}
