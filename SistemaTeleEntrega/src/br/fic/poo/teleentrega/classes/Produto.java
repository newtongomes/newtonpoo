package br.fic.poo.teleentrega.classes;

/**
 *
 * @author francisco.newton
 */
public class Produto 
{
    private int codigo;
    private String descricao;
    private String referencia;
    private String unidade;
    private float valor;

    public Produto() 
    { }

    public Produto(int codigo, String descricao, String referencia, String unidade, float valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.referencia = referencia;
        this.unidade = unidade;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
