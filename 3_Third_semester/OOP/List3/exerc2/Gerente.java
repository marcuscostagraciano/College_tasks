/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List3.exerc2;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    
    @Override
    public void aumentaSalario(){
        super.setSalario(super.getSalario() + (super.getSalario() * 10/100));
    }
}