/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThirdVersion.functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
    
    @Override
    public String toString(){
        return switch (this) {
            case FENDER -> "fender";
            case MARTIN -> "martin";
            case GIBSON -> "gibson";
            case COLLINGS -> "collings";
            case OLSON -> "olson";
            case RYAN -> "ryan";
            case PRS -> "prs";
            default -> "any";
        };
    }
}