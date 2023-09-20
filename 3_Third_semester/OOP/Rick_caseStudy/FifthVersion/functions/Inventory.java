package FifthVersion.functions;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gianluca Starke e Marcus Vinicius - BSI3
 */
public class Inventory {
    private List<Instrument> inventory;

    public Inventory(){
        inventory = new LinkedList<>();
    }

   public void addInstrument(String serialNumber, double price, InstrumentSpec spec){

    Instrument instrument = new Instrument(serialNumber, price, spec);
    inventory.add(instrument);
    }

   public Instrument getInstrument(String serialNumber){
    for (Instrument instrument : inventory){
     if(instrument.getserialNumber().equals(serialNumber)){
         return instrument;
    }
    }
    return null;
   }
   
   public List search(InstrumentSpec searchSpec){
    List matchingInstruments = new LinkedList();
        for (Instrument instrument : inventory) {
            if (instrument.getSpec().matches(searchSpec)){
                matchingInstruments.add(instrument);
            }
        }
    return matchingInstruments;
   }
} 
