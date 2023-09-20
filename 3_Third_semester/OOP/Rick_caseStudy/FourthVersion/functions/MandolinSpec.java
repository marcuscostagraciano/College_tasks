/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FourthVersion.functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder,
            String model, Type type, Style style, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) {
            return false;
        }
        if (!(otherSpec instanceof MandolinSpec)) {
            return false;
        }
        MandolinSpec spec = (MandolinSpec) otherSpec;
        if (!style.equals(spec.style)) {
            return false;
        }
        return true;
    }
}