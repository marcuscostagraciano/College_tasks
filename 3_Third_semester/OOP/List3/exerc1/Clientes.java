/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List3.exerc1;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Clientes {
    private String nome;
    private int cpf;

    public Clientes(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return this.cpf;
    } 
    
}