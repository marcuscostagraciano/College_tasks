/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood, topWood;

    public GuitarSpec(Builder builder, String model, Type type,
                        Wood backWood, Wood topWood){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder(){
        return builder;
    }

    public String getModel(){
        return model;
    }
    public Type getType(){
        return type;
    }

    public Wood getBackWood(){
        return backWood;
    }

    public Wood getTopWood(){
        return topWood;
    }
}