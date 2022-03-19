package list_classes;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura, peso;
    
    public Pessoa(String n, int i, int a, double p){
        this.nome = n;
        this.idade = i;
        this.altura = a;
        this.peso = p;
    }
    
    public void envelhecer(){
        this.idade+=1;
        if (this.idade < 21)
        {crescer(0.5);}
    }
    
    /**
     *
     * @param peso
     */
    public void engordar(double peso){
        this.peso += peso;
    }
    
    /**
     *
     * @param peso
     */
    public void emagrecer(double peso){
        this.peso -= peso;
    }
    
    /**
     *
     * @param tamanho
     */
    public void crescer(double tamanho){
        this.altura += tamanho;
    }
    
    public String getNome()     {return this.nome;}
    public int getIdade()       {return this.idade;}
    public double getAltura()   {return this.altura;}
    public double getPeso()     {return this.peso;}
}