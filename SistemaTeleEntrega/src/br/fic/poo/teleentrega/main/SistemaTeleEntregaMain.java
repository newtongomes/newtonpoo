
/*
 * Projeto para Atividade Estruturada
 * FIC - Programação Orientada a Ojetos
 * 2012.2
 * Newton Gomes - 17/10/2012
 * Sistema de Tele-Entregas com Vendas através de Pedidos por Telefone
 */
package br.fic.poo.teleentrega.main;

import br.fic.poo.teleentrega.frames.*;

/**
 *
 * @author francisco.newton
 */
public class SistemaTeleEntregaMain 
{
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new FramePrincipal().setVisible(true);
                new FramePrincipal();
            }
        });
    }
}
