package br.estacio.poo.alunos.miqueias.biblioteca;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private float valorLivro;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPagina(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public float getValorLivro() {
        return this.valorLivro;
    }

    public void setValorLivro(float valorLivro) {
        this.valorLivro = valorLivro;
    }

    public Livro(int codigo, String titulo, String autor, String ISBN, int numeroPaginas, float valorLivro) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.valorLivro = valorLivro;
    }
}
