import list_classes.BichinhoVirtual;
import list_classes.Bola;
import list_classes.BombaCombustivel;
import list_classes.Pessoa;
import list_classes.Quadrado;
import list_classes.TV;

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
        Bola bola1 = new Bola("azul","borracha",15);        
        System.out.println("Cor da bola: "+bola1.mostraCor());
        bola1.trocarCor("verde");
        System.out.println("Nova cor da bola: "+bola1.mostraCor());
        
        // Exercício 2
        Quadrado quadrado1 = new Quadrado(5);        
        System.out.println("\nLado: "+quadrado1.getLado());
        System.out.println("Área: "+quadrado1.getArea());
        quadrado1.mudarLado(5);
        System.out.println("Novo lado: "+quadrado1.getLado());
        System.out.println("Nova área: "+quadrado1.getArea());
        
        // Exercício 3
        Pessoa pessoa1 = new Pessoa("pessoa1",18,180,90);        
        System.out.println("\nNome: "+pessoa1.getNome());
        System.out.println("Idade: "+pessoa1.getIdade());
        System.out.println("Altura: "+pessoa1.getAltura()+" cm");
        System.out.println("Peso: "+pessoa1.getPeso()+" kg");
        pessoa1.envelhecer();  
        pessoa1.crescer(2);
        pessoa1.emagrecer(5);
        System.out.println("Nova idade: "+pessoa1.getIdade());
        System.out.println("Nova altura: "+pessoa1.getAltura()+" cm");
        System.out.println("Novo peso: "+pessoa1.getPeso()+" kg");
        
        // Exercício 4
        TV tv1 = new TV();
        System.out.println("\nCanal padrão: "+tv1.getCanal());
        System.out.println("Volume padrão: "+tv1.getVolume());
        tv1.alterarCanal(9);
        tv1.diminuirVolume();
        System.out.println("Colocar no canal 9: "+tv1.getCanal());
        System.out.println("Novo volume: "+tv1.getVolume());
        //Forçando canal < 0
        tv1.alterarCanal(0); tv1.diminuirCanal(); 
        //Forçando volume < 0
        tv1.diminuirVolume();tv1.diminuirVolume();tv1.diminuirVolume();tv1.diminuirVolume(); 
        System.out.println("Novo canal: "+tv1.getCanal());
        System.out.println("Novo volume: "+tv1.getVolume());
        
        // Exercício 5
        BichinhoVirtual bichinho1 = new BichinhoVirtual("Jamelão");
        System.out.println("\nNome: "+bichinho1.getNome());
        bichinho1.alterarFome(95);
        bichinho1.alterarSaude(98);
        System.out.println("Fome: "+bichinho1.getFome());
        System.out.println("Saúde: "+bichinho1.getSaude());
        System.out.println("Humor: "+bichinho1.getHumor());
        
        // Exercício 6
        BombaCombustivel bomba1 = new BombaCombustivel();
        System.out.println("\nLitros na bomba: "+bomba1.getLitrosNaBomba()+" litros");
        System.out.println("Litros abastecidos por valor: "+bomba1.abastecerPorValor(50));
        System.out.println("Valor abastecido: R$"+bomba1.abastecerPorLitro(50));
        System.out.println("Nova qtd de litros na bomba: "+bomba1.getLitrosNaBomba()+" litros");
    }
    
}