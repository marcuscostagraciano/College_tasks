import entities.*;

/**
 *
 * @author Gianluca Starke e Marcus Vinicius - BSI3
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pescador pescador1 = new Pescador(0, "Gianluca Starke", "2003-04-17", "Endereço 123", 
                                         12345678, 1223334444, "2023-05-12");
        System.out.println(pescador1.getDataNasc());
    }    
}