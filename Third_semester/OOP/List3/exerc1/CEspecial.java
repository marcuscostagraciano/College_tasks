/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List3.exerc1;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class CEspecial extends CCorrente{
    private double limite;
    
    public CEspecial(int num, double saldo, Clientes cliente, double limite){
        super(num, saldo, cliente);
        this.limite = limite;
    }
    
    @Override
    public void debitar(double valor) {
        if (valor <= (super.getSaldo() + this.limite)) {
            super.setSaldo(super.getSaldo() - valor);
        } else {
            System.out.print("Saldo Insuficiente");
        }
    }
            
}