import Lista1.lista_classes.*;
import Lista2.list_classes.exerc1.*;
import Lista2.list_classes.exerc2.VIP;
import Lista2.list_classes.exerc3.*;
import Lista2.list_classes.exerc4.*;
import Lista2.list_classes.exerc5.*;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Exercício 1
        Empregado emp1 = new Empregado(1,"nome1","email1",1000);
        System.out.println("Salário original: " + emp1.getSalario());
        emp1.aumentoSalarial(50);
        System.out.println("Novo salário: " + emp1.getSalario() + "\n");
        
        Chefe che1 = new Chefe(2,"nome2","email2",2000, 500);
        System.out.println("Salário original: " + che1.getSalario());
        che1.aumentoSalarial(50);
        System.out.println("Novo salário: " + che1.getSalario());
        
        // Exercício 2
        VIP vip1 = new VIP(50, 5);
        System.out.println(vip1.imprimeValor());
        
        // Exercício 3        
        Tecnico tec1 = new Tecnico("tec1","endereço do técnico",001,"tec@email.com",001,10);
        Administrativo adm1 = new Administrativo("adm1","endereço do adm",002,"adm@email.com",002,2);
        System.out.println("Código de matricula: " + tec1.getMatricula() + 
                            "\nNome: " + tec1.getNome() + "\n");
        System.out.println("Código de matricula: " + adm1.getMatricula() + 
                            "\nNome: " + adm1.getNome() + "\n");        

        // Exercício 4
        Cachorro doguin1 = new Cachorro("Doguin");
        Gato gatin1 = new Gato("Gatin");
        System.out.println(doguin1.latir() + "! " + doguin1.caminhar());        
        System.out.println(gatin1.miar()+ "! " + gatin1.caminhar());
        
        // Exercício 5
        Pobre pobre = new Pobre("Pessoa pobre 1",18);
        Rica rica = new Rica("Pessoa rica 1",50,0);
        System.out.println(pobre.trabalha());
        System.out.println(rica.fazCompras());
    }    
}