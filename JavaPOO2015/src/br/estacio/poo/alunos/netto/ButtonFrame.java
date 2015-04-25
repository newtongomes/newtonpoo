package br.estacio.poo.alunos.netto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{ 
    private JButton plainJButton;
    private JButton fancyJButton;
    
    public ButtonFrame(){ 
        super( "Testing Buttons" ); 
        setLayout( new FlowLayout() );
        plainJButton = new JButton( "Plain Button" );
        add( plainJButton );
        Icon bug1 = new ImageIcon( getClass().getResource( "bug1.gif" ) ); 
        Icon bug2 = new ImageIcon( getClass().getResource( "bug2.gif" ) ); 
        fancyJButton = new JButton( "Fancy Button", bug1 );
        fancyJButton.setRolloverIcon( bug2 );
        add( fancyJButton );
        ButtonHandler handler = new ButtonHandler(); 
        fancyJButton.addActionListener( handler ); 
        plainJButton.addActionListener( handler ); 
    }
    
    private class ButtonHandler implements ActionListener { 
        @Override
        public void actionPerformed( ActionEvent event ){
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()) ); 
        } 
    }
    
    public static void main( String args[] ){ 
        ButtonFrame buttonFrame = new ButtonFrame(); // cria ButtonFrame
        buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        buttonFrame.setSize( 275, 110 ); // configura o tamanho do frame
        buttonFrame.setVisible( true ); // exibe o frame
    }
}