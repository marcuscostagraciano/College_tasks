/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FourthVersion.functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
    COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
    
    @Override
    public String toString(){
        return switch(this){
            case INDIAN_ROSEWOOD -> "indian rosewood";
            case BRAZILIAN_ROSEWOOD -> "brazilian rosewood";
            case MAHOGANY -> "mahogany";
            case MAPLE ->"maple";
            case COCOBOLO ->"cocobolo";
            case CEDAR ->"cedar";
            case ADIRONDACK ->"adirondack";
            case ALDER -> "alder";
            case SITKA -> "sitka";
        };
    }
}