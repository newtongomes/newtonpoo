package br.estacio.poo.agenda.entidade;

import java.util.ArrayList;

/**
 *
 * @author Newton
 */
public class Agenda 
{
    private String proprietario;
    private String senha;
    private boolean protegido;
    private boolean maximizado;
    private String cor;
    
    private ArrayList<Contato> contatos;

    public Agenda() {
    }
    
    public Agenda(String proprietario, String senha) {
        this.proprietario = proprietario;
        this.senha = senha;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isProtegido() {
        return protegido;
    }

    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    public boolean isMaximizado() {
        return maximizado;
    }

    public void setMaximizado(boolean maximizado) {
        this.maximizado = maximizado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    
}
