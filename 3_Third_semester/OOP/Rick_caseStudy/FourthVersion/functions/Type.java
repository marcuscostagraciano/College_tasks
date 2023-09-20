/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FourthVersion.functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public enum Type {
    ACOUSTIC, ELECTRIC;
    
    @Override
    public String toString(){
        return switch (this) {
            case ACOUSTIC -> "acoustic";
            case ELECTRIC -> "electric";
            default -> "acoustic";
        };
    }
}