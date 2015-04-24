package br.fic.poo.agencia.classes;

/**
 *
 * @author Newton Gomes - 22-abr-2013
 */
public class Cliente 
{
    private Integer codigo;
    private String nome;
    private String endereco;
    private String cpf;
    private String rg;
    private String telefone;
    private String celular;
    private String email;

    public Cliente() 
    { }

    public Cliente(Integer codigo, String endereco, 
            String cpf, String rg, String telefone, 
            String celular, String email) 
    {
        this.codigo = codigo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public Integer getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(Integer codigo) 
    {
        this.codigo = codigo;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getRg() 
    {
        return rg;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public String getCelular() 
    {
        return celular;
    }

    public void setCelular(String celular) 
    {
        this.celular = celular;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
}
