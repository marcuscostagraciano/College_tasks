package List1.lista_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Bola {
    private String cor, material;
    private double circunferencia;
    
    public Bola(String cor, String mat, int circ){
        this.cor = cor;
        this.material = mat;
        this.circunferencia = circ;        
    }
    
    public void trocarCor(String novaCor){
        this.cor = novaCor;
    }
    
    public String mostraCor(){return this.cor;}    
}