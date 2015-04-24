package br.estacio.poo.agenda.entidade;

/**
 *
 * @author Newton
 */
public class Contato 
{
    // Atributos
    private int id;
    private String nome;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    // Construtores
    public Contato() 
    {
    }
    
    public Contato(int id, String nome, String telefoneResidencial, String telefoneComercial, String celular, String email) {
        this.id = id;
        this.nome = nome;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;
        this.celular = celular;
        this.email = email;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
}
