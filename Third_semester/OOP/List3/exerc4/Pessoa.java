/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List3.exerc4;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public abstract class Pessoa {
    private String nome, endereco;
    
    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public abstract void imprimirDados();
}