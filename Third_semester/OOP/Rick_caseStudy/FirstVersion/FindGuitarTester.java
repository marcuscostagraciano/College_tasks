import functions.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class FindGuitarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        
        inventory.addGuitar("", 0, Builder.FENDER, "Stratocaster", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
        
        
        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocaster", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()){
            System.out.println("Erin, you might like these guitars: ");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a "+
                        guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n" +
                        guitar.getBackWood()+ " back and sides,\n" +
                        guitar.getTopWood() + " top.\n You can have it for only $"+
                        guitar.getPrice() + "! \n ----");
            }
        } 
        else { System.out.println("Sorry, Erin, we have nothing for you.");
        }     
    }   
    
    private static void initializeInventory(Inventory inventory){
        //Add guitar to the inventory
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}