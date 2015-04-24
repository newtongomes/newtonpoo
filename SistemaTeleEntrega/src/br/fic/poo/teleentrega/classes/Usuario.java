package br.fic.poo.teleentrega.classes;

/**
 *
 * @author francisco.newton
 */
public class Usuario extends Pessoa implements Comparable
{
    private String login;
    private String senha;

    public Usuario() 
    { }
    
    public Usuario(int codigo, String nome, String telefone, String cpf,
            String login, String senha) {
        super(codigo, nome, telefone, cpf);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int compareTo(Object usuario)
    {
        return this.getCodigo() - ((Usuario)usuario).getCodigo(); 
        
        //if (this.getCodigo() < ((Usuario)usuario).getCodigo())
        //    return -1;
        //else
        //    if (this.getCodigo() > ((Usuario)usuario).getCodigo())
        //        return 1;
        //    else
        //        return 0;
    }
    
}
