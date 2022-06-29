package bancodobrasil.classes;

public class Agencia {
    
    public Agencia(){
    }
    
    public Agencia(int numeroAgencia, String cnpj,
            Endereco endereco){
        this.numeroAgencia = numeroAgencia;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }
    
    private int numeroAgencia;
    private String cnpj;
    private Endereco endereco;

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Agencia{" + "numeroAgencia=" + numeroAgencia + ", cnpj=" + cnpj + ", endereco=" + endereco + '}';
    }
    
}
