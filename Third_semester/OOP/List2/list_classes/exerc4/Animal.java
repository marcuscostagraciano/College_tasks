/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.list_classes.exerc4;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Animal {
    private String nome, raca;
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public String caminhar(){
        return this.nome + " está caminhando...";
    }
}