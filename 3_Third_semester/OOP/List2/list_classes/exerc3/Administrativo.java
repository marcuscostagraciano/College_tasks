/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc3;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Administrativo extends Assistente{
    private String turno;
    private int bonusSalarial;
    
    public Administrativo(String nome, String end, int tel, String email, int matricula, int turno){
        super(nome, end, tel, email, matricula);
        
        this.turno = (turno % 2 == 0 ? "Noturno" : "Diurno");
        this.bonusSalarial = (this.turno.equals("Noturno") ? 25 : 0);               
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @return the bonusSalarial
     */
    public int getBonusSalarial() {
        return bonusSalarial;
    }   
    
}