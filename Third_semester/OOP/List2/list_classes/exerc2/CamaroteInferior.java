/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.list_classes.exerc2;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class CamaroteInferior extends VIP{
    private String localizacao;
    
    public CamaroteInferior(double valor, double valorAdicional, String local){
        super(valor, valorAdicional);
        this.localizacao = local;
    }
    
    /*
    * @return location
    */
    public String getLocalizacao(){
        return this.localizacao;
    }
    
}