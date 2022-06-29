package bancodobrasil.classes;

public class Endereco {
    
    public Endereco(int numero, String nomeRua, String nomeBairro){
        this.numero = numero;
        this.nomeRua = nomeRua;
        this.nomeBairro = nomeBairro;
    }
    
    private int numero;
    private String nomeRua;
    private String nomeBairro;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "numero=" + numero + ", nomeRua=" + nomeRua + ", nomeBairro=" + nomeBairro + '}';
    }
    
}
