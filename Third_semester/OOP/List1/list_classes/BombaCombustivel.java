package List1.lista_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorPorLitro=  5; // valorLitro = umRim;
    private double qtdCombustivelNaBomba = 100;
    
    public double abastecerPorValor(double valorAbastecido){
        alterarQuantidadeCombustivel(valorAbastecido / this.valorPorLitro);
        return valorAbastecido / this.valorPorLitro;
    }
    
    public double abastecerPorLitro(int litrosAbastecidos){        
        alterarQuantidadeCombustivel(litrosAbastecidos);
        return litrosAbastecidos * this.valorPorLitro;
    }
    
    public void alterarValor(double nValor){
        this.valorPorLitro = nValor;
    }
    
    public void alterarCombustivel(String nTipo){
        this.tipoCombustivel = nTipo;
    }
    
    public void alterarQuantidadeCombustivel(double qtdRetirada){
        this.qtdCombustivelNaBomba -= qtdRetirada;
    }
    
    public double getLitrosNaBomba(){return this.qtdCombustivelNaBomba;}
}