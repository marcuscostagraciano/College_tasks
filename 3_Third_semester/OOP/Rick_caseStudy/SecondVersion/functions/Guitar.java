/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Guitar {
    private String serialNumber, model;
    private double price;    
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, Builder builder,
            String model, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}