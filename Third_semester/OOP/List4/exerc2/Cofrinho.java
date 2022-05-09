/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List4.exerc2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho(){
        moedas = new ArrayList<Moeda>();
    }
    
    public void adicionar(Moeda moeda){
        moedas.add(moeda);
    }
    
    public double calcularTotal(){
        int valor = 0;
        for (Moeda moeda: moedas){
            valor+= moeda.getValor();
        }
        
        return valor;
    }
 
    public int contarMoedas(){
        return moedas.size();
    }
    
    public int moedasPorValor(int valor){
        return Collections.frequency(moedas, valor);
                
        /* Most basic:
        int count = 0;
        for (Moeda moeda: moedas){
            if(moeda.getValor() == valor)
            {count++;}
        }
        
        return count; */
    }
    
    public double maiorValor(){
       //Most basic: 
       double maxValue = 0;
       for (Moeda moeda: moedas){
            if(moeda.getValor() > maxValue)
            {maxValue = moeda.getValor();}
       }
        
        return maxValue;
    }
}