package list_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Bola {
    private String cor, material;
    private double circunferencia;
        
    /**
     *
     * @param cor
     * @param mat
     * @param circ
     */
    public Bola(String cor, String mat, int circ){
        this.cor = cor;
        this.material = mat;
        this.circunferencia = circ;        
    }    
    
    /**
     *
     * @param novaCor
     */
    public void trocarCor(String novaCor){
        this.cor = novaCor;
    }    
        
    /**
     *
     * @return Cor
     */
    public String mostraCor(){
        return this.cor;
    }    
}