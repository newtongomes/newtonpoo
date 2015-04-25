package br.estacio.poo.alunos.miqueias.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private int codigo;
    private String nome;
    private String local;
    private ArrayList<Livro> livros;
    private int capacidade;
    private int quantidade;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Biblioteca(String nome, String local) {
        this.nome = nome;
        this.local = local;
        livros = new ArrayList<Livro>();

    }

    public void addLivro(Livro livros) {
        this.livros.add(livros);
    }

    public Livro buscaLivro(int codigo) {
        Livro livro = null;
        for (Livro livro1 : this.livros) {
            if (livro1.getCodigo() == codigo) {
                livro = livro1;
                break;
            }
        }
        return livro;
    }

    public ArrayList<Livro> buscaLivro(String titulo) {
        ArrayList<Livro> livro = new ArrayList<>();
        for (Livro livro1 : this.livros) {
            if (livro1.getTitulo().contains(titulo)) {
                livro.add(livro1);
            }
        }
        return livro;
    }
    
    public int quantidadeLivros() {
        return livros.size();
    }

    public ArrayList<Livro> buscaLivro() {
        return this.livros;
    }
}
