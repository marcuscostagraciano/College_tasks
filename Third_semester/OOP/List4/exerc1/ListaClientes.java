/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List4.exerc1;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class ListaClientes {
    private List<Clientes> clientes;

    public ListaClientes(){
        clientes = new ArrayList<Clientes>();
    }
    public void addClientes(Clientes cli){
        clientes.add(cli);
    }
    
    public void imprimeClientes(){
        for(Clientes cli:clientes)
            System.out.println(cli);
    }
}