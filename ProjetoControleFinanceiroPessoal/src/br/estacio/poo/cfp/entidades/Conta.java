package br.estacio.poo.cfp.entidades;

import java.util.GregorianCalendar;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton Gomes - 13/04/2015
 */
public class Conta 
{
    private Integer codigo;
    private String descricao;
    private Float valor;
    private GregorianCalendar emissao;
    private GregorianCalendar vencimento;
    private String parcelado;  // Sim ou Não
    private Integer totalParcelas;
    private Integer parcela;
    
    
}
