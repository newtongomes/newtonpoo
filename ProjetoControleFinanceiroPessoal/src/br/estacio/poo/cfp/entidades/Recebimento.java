package br.estacio.poo.cfp.entidades;

import java.util.GregorianCalendar;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton Gomes - 13/04/2015
 */
public class Recebimento extends Conta
{
    //private PlanoContasRecebimento conta;  // Enum
    private Cliente cliente;
    private String situacao;  // 1-Aberto 2-Recebida 3-Cancelada
    private GregorianCalendar dataRecebimento;
    
    
}
