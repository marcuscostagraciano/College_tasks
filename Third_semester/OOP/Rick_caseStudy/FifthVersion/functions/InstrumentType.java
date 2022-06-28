package FifthVersion.functions;

/**
 *
 * @author Gianluca Starke e Marcus Vinicius - BSI3
 */
public enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;
    
    @Override
    public String toString(){
        return switch (this) {
            case GUITAR -> "Guitar";
            case BANJO -> "Banjo";
            case DOBRO -> "Dobro";
            case FIDDLE -> "Fiddle";
            case BASS -> "Bass";
            case MANDOLIN -> "Mandolin";
            default -> "Unspecified";
        };
    }
}