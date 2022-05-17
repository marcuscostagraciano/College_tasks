/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
    
    @Override
    public String toString(){
        switch (this) {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case COLLINGS: return "Collings";
            case OLSON: return "Olson";
            case RYAN: return "Ryan";
            case PRS: return "PRS";
            default: return "any";
        }
    }
}