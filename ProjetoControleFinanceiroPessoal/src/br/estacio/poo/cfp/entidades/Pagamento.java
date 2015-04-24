package br.estacio.poo.cfp.entidades;

import java.util.GregorianCalendar;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton Gomes - 13/04/2015
 */
public class Pagamento extends Conta
{
    //private PlanoContasPagamento conta;  // Enum
    private Fornecedor fornecedor;
    private String situacao;  // 1-Aberto 2-Paga 3-Cancelada
    private GregorianCalendar dataPagamento;
    
    
}
