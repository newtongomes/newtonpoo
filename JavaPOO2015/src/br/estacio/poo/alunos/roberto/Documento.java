package br.estacio.poo.alunos.roberto;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fic
 */
public class Documento extends JFrame{
    private JLabel cabecalho = new JLabel("Cabeçalho", JLabel.CENTER);
    private JLabel corpo = new JLabel("Corpo", JLabel.CENTER);
    private JLabel rodape = new JLabel("Rodapé", JLabel.CENTER);
    
    public static void main(String args[]){
        new Documento();
    }
    
    public Documento(){
        super( "Documento" );
        setSize( 300, 250 );
        setLayout( new BorderLayout(5, 5) );
        add( cabecalho, BorderLayout.NORTH );
        add( corpo, BorderLayout.CENTER );
        add( rodape, BorderLayout.SOUTH );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible( true );
    }
    
}
