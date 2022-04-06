/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.list_classes.exerc2;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class CamaroteSuperior extends VIP{
    
    public CamaroteSuperior(double valor, double valorAdicional){
        super((valor + valor*10/100), valorAdicional);
    }
    
    public double imprimeValor(){
        return super.imprimeValor();
    }
}