package br.fic.poo.agencia.classes;

/**
 *
 * @author Newton Gomes - 22-abr-2013
 */
public class Usuario 
{
    private String nome;
    private String cpf;
    private String telefone;
    private String login;
    private String senha;

    public Usuario() 
    { }

    public Usuario(String nome, String cpf, 
            String telefone, String login, 
            String senha) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

}
