/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc2;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class VIP extends Ingresso{
    private double adicional;
    
    public VIP(double valor, double valorAdicional){
        super(valor);
        this.adicional = valorAdicional;
    }
    
    public double imprimeValor(){
        return super.imprimeValor() + this.adicional;
    }
}