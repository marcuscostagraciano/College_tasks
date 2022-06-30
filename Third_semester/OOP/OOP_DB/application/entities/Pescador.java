package entities;

/**
 *
 * @author Gianluca Starke e Marcus Vinicius - BSI3
 */
public class Pescador {
    private int pkCpf, telefone, idLicenca;
    private String nome, dataNasc, endereco, vencimentoLicenca;
    
    public Pescador(int pk_cpf, String nome, String data_nasc, String end,
                    int tel, int id_licenca, String vencimento_licenca){
        this.pkCpf = pk_cpf;
        this.nome = nome;
        this.dataNasc = data_nasc;
        this.endereco = end;
        this.telefone = tel;
        this.idLicenca = id_licenca;
        this.vencimentoLicenca = vencimento_licenca;
    }

    public int getPkCpf() {
        return pkCpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getIdLicenca() {
        return idLicenca;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getVencimentoLicenca() {
        return vencimentoLicenca;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setVencimentoLicenca(String vencimentoLicenca) {
        this.vencimentoLicenca = vencimentoLicenca;
    }    
        
}