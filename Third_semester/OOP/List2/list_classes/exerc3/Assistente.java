/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc3;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Assistente extends Funcionario{
    private int matricula;
    
    public Assistente(String nome, String end, int tel, String email, int matricula){
        super(nome, end, tel, email);
        this.matricula = matricula;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }
}