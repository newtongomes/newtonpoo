package br.fic.poo.agencia.main;

import br.fic.poo.agencia.frames.FramePrincipal;
import javax.swing.UIManager;
/*
 * Projeto para Atividade Estruturada
 * FIC - Programação Orientada a Ojetos
 * 2013.1
 * @author Newton Gomes - 22-abr-2013
 * Sistema de Agência de Viagens
 */
public class SistemaAgenciaViagens 
{
    public static void main(String args[]) 
    {
        new FramePrincipal();
        
    }
}



/*
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        { e.printStackTrace(); }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
*/