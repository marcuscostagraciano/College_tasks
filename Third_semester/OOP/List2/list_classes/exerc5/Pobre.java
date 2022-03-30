/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.list_classes.exerc5;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Pobre extends Pessoa{
    
    public Pobre(String nome, int idade){
        super(nome, idade);
    } 
    
   public String trabalha(){
       return "Trabalhando";
   }
}