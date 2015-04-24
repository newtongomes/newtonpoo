package br.fic.poo.teleentrega.classes;

/**
 *
 * @author francisco.newton
 */
public class ItemPedido 
{
    private Produto produto;
    private float quantidade;
    private float valor;

    public ItemPedido() 
    { }
    
    public ItemPedido(Produto produto, float quantidade, float valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
