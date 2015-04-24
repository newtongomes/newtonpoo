package br.fic.poo.teleentrega.classes;

import java.util.ArrayList;

/**
 *
 * @author francisco.newton
 */
public class Pedido 
{
    private static final int STATUS_ABERTO = 0;
    private static final int STATUS_FECHADO = 0;
    private static final int STATUS_CANCELADO = 0;
    
    private int numero;
    private String data;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens;
    private Entregador entrega;
    private int status;

    public Pedido() 
    { }

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Entregador getEntrega() {
        return entrega;
    }

    public void setEntrega(Entregador entrega) {
        this.entrega = entrega;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
