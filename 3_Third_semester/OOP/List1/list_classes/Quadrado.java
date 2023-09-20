package List1.lista_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Quadrado {
    private double lado;
    
    public Quadrado(double ladoInicial){
        this.lado = ladoInicial;}
    
    public void mudarLado(double nLado){
        this.lado = nLado;}
    
    public double getLado() {return this.lado;}    
    public double getArea() {return this.lado*this.lado;}
}