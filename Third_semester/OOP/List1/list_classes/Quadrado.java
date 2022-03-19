package list_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Quadrado {
    private double lado;
    
    
    /**
     *
     * @param ladoInicial
     */
    public Quadrado(double ladoInicial){
        this.lado = ladoInicial;
    }
    
    /**
     *
     * @param nLado
     */
    public void mudarLado(double nLado){
        this.lado = nLado;
    }
    
    /**
     *
     * @return Lado
     */
    public double getLado(){
        return this.lado;
    }
    
    /**
     *
     * @return Area
     */
    public double getArea(){
        return this.lado*this.lado;
    }
}
