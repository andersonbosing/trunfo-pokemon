package bancodobrasil;

import bancodobrasil.classes.Agencia;
import bancodobrasil.classes.Banco;
import bancodobrasil.classes.Endereco;

public class Main {

    public static void main(String[] args) {

        /*
        Um banco possui muitas agencias e 
        estas agencias possuem muitos correntistas, 
        sendo contas correntes ou contas poupanças. 
        Cada correntista possui um endereço para onde deve ser 
        enviado o cartão.
        */
        
        Endereco endereco = new Endereco(148, 
                "Avenida Tal", 
                "Bairro tal");
        
        Agencia agenciaBB = new Agencia(456, 
                "62.859.132/0001-20", endereco);

        Banco bb = new Banco();
        bb.setCnpj("93.949.513/0001-24");
        bb.setNome("Banco do Brasil");
        bb.setAgencia(agenciaBB);
        
        System.out.println(bb.toString());
        
    }
    
}
