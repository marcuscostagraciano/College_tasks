/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List3.exerc1;
import java.util.Calendar;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class CInvestimento extends CCorrente{
    private int dia_investimento, periodo;
    
    public CInvestimento(int num, float saldo, Clientes cliente, int dinv, int per) {
        super(num, saldo, cliente);
        this.dia_investimento = dinv;
        this.periodo = per;
    }
    
    public void atualizar_saldo() {
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
        if (dia == (this.dia_investimento + periodo)) {
            super.setSaldo((double) (super.getSaldo() * 1.20));
        } else {
            System.out.println("Ainda no dia do investimento");
        }
    }
    
}