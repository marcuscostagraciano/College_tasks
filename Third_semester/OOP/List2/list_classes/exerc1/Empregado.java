/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.list_classes.exerc1;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Empregado {
    private int codigo;
    private String nome, email;
    private float salario;
    
    public Empregado(int cod, String name, String email, float salario){
        this.codigo = cod;
        this.nome = name;
        this.email = email;
        this.salario = salario;
    }    
    
    public void aumentoSalarial(int percentual, float diferencial){
        this.salario += (this.salario * percentual / 100) + diferencial;
    }
    
    public float getSalario(){
        return this.salario;
    }
}