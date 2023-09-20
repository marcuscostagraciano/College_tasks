package List1.lista_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class TV {
    private int canal, volume = 5;
    
    public void alterarCanal(int numCanal){
        if (0 <= numCanal && numCanal <= 10)
        {this.canal = numCanal;}
    }
    
    public void aumentarCanal(){
        if (this.canal < 10) {this.canal++;}
        else {this.canal = 0;}
    }
    
    public void diminuirCanal(){
        if (this.canal > 0){this.canal--;}
        else {this.canal = 10;}
    }
    
    public void aumentarVolume(){
        if (this.volume < 10)
        {this.volume++;}
    }
    
    public void diminuirVolume(){
        if (this.volume > 0)
        {this.volume--;}
    }
    
    public int getCanal(){return this.canal;}
    public int getVolume(){return this.volume;}
}