package list_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class BichinhoVirtual {
    private String nome;
    private int fome, saude, idade;
    
    public BichinhoVirtual(String n){this.nome = n;}
    
    public void alterarNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void alterarFome(int nFome){
        this.fome = nFome;
    }
    
    public void alterarSaude(int nSaude){
        this.saude = nSaude;
    }
    
    public void alterarIdade(int nIdade){
        this.idade = nIdade;
    }
    
    public String getNome(){return this.nome;}    
    public int getFome(){return this.fome;}    
    public int getSaude(){return this.saude;}    
    public int getIdade(){return this.idade;}
    public int getHumor(){return (this.fome + this.saude) / 2;}    
}