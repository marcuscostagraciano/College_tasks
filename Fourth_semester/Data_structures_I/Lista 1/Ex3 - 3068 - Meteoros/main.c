#include <stdio.h>
int isInsideInverval(int *farmCoordinates, int *meteorCoordinates);

int main() {
    int farmCoord[4], totalMeteorQty, meteorCoord[2], 
        testQty = 0;
    
    while (1) {
        // The number of meteors inside the farm is declared here to make it 0 every iteration
        int meteorsInsideFarm = 0;
        
        // Scans the farm perimeter
        scanf ("%d %d %d %d", &farmCoord[0], &farmCoord[1], &farmCoord[2], &farmCoord[3]);
                
        // Checks if the loop will continue: x1 == y1 == x2 == y2 == 0
        if (farmCoord[0] == farmCoord[1] && farmCoord[1] == farmCoord[2] && farmCoord[2] == farmCoord[3] && farmCoord[3] == 0){
            break;
        }
        
        // Scans the meteor quantity
        scanf("%d", &totalMeteorQty);
        
        // Scans the meteor coordinates and checks if they've fallen inside the farm
        for (int i = 0; i < totalMeteorQty; i++) {
            scanf("%d %d", &meteorCoord[0], &meteorCoord[1]);
            
            if (isInsideInverval(farmCoord, meteorCoord)){
                meteorsInsideFarm++;
            }
        }
        
        printf("Teste %d\n", ++testQty);
        printf("%d\n", meteorsInsideFarm);
    }

    return 0;
}


int isInsideInverval(int *farmCoordinates, int *meteorCoordinates) {
    // If the meteor is inside the farm perimeter, this function returns '1'
    if (farmCoordinates[0] <= meteorCoordinates[0] && meteorCoordinates[0] <= farmCoordinates[2] &&
        farmCoordinates[1] >= meteorCoordinates[1] && meteorCoordinates[1] >= farmCoordinates[3]) {
        return 1;
    }
    
    return 0;
}