/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc1;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Estagiario extends Empregado{
    private int descontos;
    
    public Estagiario(int cod, String name, String email, float salario, int desc){
        super(cod, name, email, salario);
        this.descontos = desc;
    }
    
    public void aumentoSalarial(int percentual){
        super.aumentoSalarial(percentual, -this.descontos);        
    }
}