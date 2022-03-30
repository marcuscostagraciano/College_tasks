/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.list_classes.exerc3;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Funcionario {
    private String nome, endereco, email;
    private int telefone;
    
    public Funcionario(String nome, String end, int tel, String email){
        this.nome = nome;
        this.endereco = end;
        this.telefone = tel;
        this.email = email;
    }  

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }  
    
}