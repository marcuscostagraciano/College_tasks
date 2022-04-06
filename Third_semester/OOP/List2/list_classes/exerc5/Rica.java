/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc5;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Rica extends Pessoa{
    private double dinheiro;
    
    public Rica(String nome, int idade, double dinheiro){
        super(nome, idade);
        this.dinheiro = dinheiro;
    } 
    
    public String fazCompras(){
        return "Comprando";
    }
}