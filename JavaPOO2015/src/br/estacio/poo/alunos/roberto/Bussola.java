package br.estacio.poo.alunos.roberto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author fic
 */
public class Bussola extends JFrame {
    private JButton buttonNorte = new JButton("Norte");
    private JButton buttonOeste = new JButton("Oeste");
    private JButton buttonLeste = new JButton("Leste");
    private JButton buttonSul = new JButton("Sul");
    
    public static void main(String args[]){
          new Bussola();
    }
    
    public Bussola()
    {
        super( "Bussola" );
        setSize( 300, 250 );
        setLayout( new BorderLayout(5, 5) );
        add( buttonNorte, BorderLayout.NORTH );
        add( buttonOeste, BorderLayout.WEST );
        add( buttonLeste, BorderLayout.EAST );
        add( buttonSul, BorderLayout.SOUTH );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible( true );
    }
    
    
}
