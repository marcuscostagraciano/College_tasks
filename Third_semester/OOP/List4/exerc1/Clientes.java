/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List4.exerc1;

import java.util.ArrayList;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Clientes {
    private String nome, cpf;
    private ArrayList<CCorrente> contas;

    public Clientes(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        contas = new ArrayList<CCorrente>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public void addContas(CCorrente conta) {
        contas.add(conta);
    }

    public ArrayList<CCorrente> getContas() {
        return contas;
    }
    
    @Override
    public String toString() {
        return (this.nome + ": " + this.contas);
    }
}