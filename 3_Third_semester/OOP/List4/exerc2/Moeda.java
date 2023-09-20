/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List4.exerc2;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Moeda {
    private double valor;
    private String nome;
    
    public Moeda(double valor, String nome){
        this.valor = valor;
        this.nome = nome;        
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public String getNome(){
        return this.nome;
    }
}