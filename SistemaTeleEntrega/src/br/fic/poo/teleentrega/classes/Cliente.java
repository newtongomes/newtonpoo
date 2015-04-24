package br.fic.poo.teleentrega.classes;

/**
 *
 * @author francisco.newton
 */
public class Cliente extends Pessoa 
{
    private String endereco;
    private String referencia;

    public Cliente() 
    { }
    
    public Cliente(int codigo, String nome, String telefone, String cpf,
            String endereco, String referencia) {
        super(codigo, nome, telefone, cpf);
        this.endereco = endereco;
        this.referencia = referencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


}
