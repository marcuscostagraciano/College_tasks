/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List3.exerc1;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class CPoupanca extends CCorrente{
    private double saldominimo;
    
    public CPoupanca(int num, double saldo, Clientes cliente, double saldoMinimo){
        super(num, saldo, cliente);
        this.saldominimo = saldoMinimo;
    }
    
    @Override
    public void debitar(double valor) {
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
            if (super.getSaldo() < this.saldominimo){
                this.saldominimo = super.getSaldo();}
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    public void atualizar_saldo() {
        super.setSaldo((float) (super.getSaldo() + (this.saldominimo * 0.05)));
        this.saldominimo = super.getSaldo();

    }

    public double get_saldominimo(){
        return this.saldominimo;
    }   
    
}