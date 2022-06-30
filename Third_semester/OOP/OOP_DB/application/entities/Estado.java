package entities;

/**
 *
 * @author Gianluca Starke e Marcus Vinicius - BSI3
 */
public enum Estado {
    AM, GO, MG, SP;
   
    @Override
    public String toString(){
        return switch (this) {
            case AM -> "Amazonas";
            case GO -> "Goias";
            case MG -> "Minas gerais";
            case SP -> "Sao Paulo";
        };
    }
}