package FifthVersion.functions;

/**
 *
 * @author Gianluca Starke e Marcus Vinicius - BSI3
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