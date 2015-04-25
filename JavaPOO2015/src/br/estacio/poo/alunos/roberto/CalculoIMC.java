package br.estacio.poo.alunos.roberto;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
/**
 *
 * @author fic
 */
public class CalculoIMC extends JFrame 
{
    private JLabel labelTitulo = new JLabel( "Cálculo do IMC" );
    private JLabel labelPeso = new JLabel( "Peso:", JLabel.RIGHT );
    private JTextField textPeso = new JTextField( 15 );
    private JLabel labelAltura = new JLabel( "Altura:", JLabel.RIGHT );
    private JTextField textAltura = new JTextField( 15 );
    private JButton btnCalcular = new JButton( "Calcular" );
    private JTextField textResultado = new JTextField( 15 );
    
    public static void main(String args[])
    {
        new CalculoIMC();
    }
    
    public CalculoIMC()
    {
        super( "Cálculo do IMC" );
        setSize( 300, 150 );
        GridBagConstraints cons = new GridBagConstraints();
        setLayout( new GridBagLayout() );
         
        cons.insets = new Insets(0,0,10,0);
        cons.gridy = 0;  
        cons.gridx = 0;
        cons.gridwidth = 2;
        add( labelTitulo, cons );
        cons.fill = GridBagConstraints.BOTH;
        cons.insets = new Insets(0,0,0,0);
        cons.gridwidth = 1;
        cons.gridy = 1;  
        cons.gridx = 0;
        add( labelPeso, cons );
        cons.gridx = 1;
        add( textPeso, cons );
        cons.gridy = 2;  
        cons.gridx = 0;
        add( labelAltura, cons );
        cons.gridx = 1;
        add( textAltura, cons );
        cons.gridy = 3;  
        cons.gridx = 0;
        add( btnCalcular, cons );  
        cons.gridx = 1;
        add( textResultado, cons );
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible( true );
        
    }
    
}
