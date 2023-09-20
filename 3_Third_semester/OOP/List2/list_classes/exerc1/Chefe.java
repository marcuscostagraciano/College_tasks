/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc1;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Chefe extends Empregado{
    private float beneficio;
    
    public Chefe(int cod, String name, String email, float salario, float beneficio){
        super(cod, name, email, salario);
        this.beneficio = beneficio;
    }    
    
    public void aumentoSalarial(int percentual){
        super.aumentoSalarial(percentual, this.beneficio);
    }
}