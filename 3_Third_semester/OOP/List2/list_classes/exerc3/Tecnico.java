/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc3;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Tecnico extends Assistente{
    private int bonusSalarial;
    
    public Tecnico(String nome, String end, int tel, String email, int matricula, int bonus){
        super(nome, end, tel, email, matricula);
        this.bonusSalarial = bonus;
    }
}