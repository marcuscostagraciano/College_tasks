package FifthVersion.functions;

/**
 *
 * @author Gianluca Starke e Marcus Vinicius - BSI3
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
            case ANY -> "any";
            default -> "any";
        };
    }
}