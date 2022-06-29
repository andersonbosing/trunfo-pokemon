package bancodobrasil.classes;

public class Banco {
    
    public Banco(){
    }
    
    private String nome;
    private String cnpj;
    private Agencia agencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Banco{" + "nome=" + nome + ", cnpj=" + cnpj + ", agencia=" + agencia + '}';
    }
    
}
