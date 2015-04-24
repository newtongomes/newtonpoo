package br.fic.poo.agencia.classes;

/**
 *
 * @author Newton
 */
public class Companhia 
{
    private int codigo;
    private String nome;
    private String nacionalidade;
    private char operacao;  // 'N'-Nacional 'I'-Internacional

    public Companhia()
    { }
    
    public Companhia(int codigo, String nome, String nacionalidade, char operacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.operacao = operacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }
    
    
    
}
