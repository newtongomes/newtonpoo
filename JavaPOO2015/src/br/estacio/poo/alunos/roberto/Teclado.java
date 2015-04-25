package br.estacio.poo.alunos.roberto;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author fic
 */
public class Teclado extends JFrame {
      private JButton button1 = new JButton("1");
      private JButton button2 = new JButton("2");
      private JButton button3 = new JButton("3");
      private JButton button4 = new JButton("4");
      private JButton button5 = new JButton("5");
      private JButton button6 = new JButton("6");
      private JButton button7 = new JButton("7");
      private JButton button8 = new JButton("8");
      private JButton button9 = new JButton("9");
      private JButton buttonAsterisco = new JButton("*");
      private JButton button0 = new JButton("0");
      private JButton buttonTralha = new JButton("#");
    
      public static void main(String args[]){
          new Teclado();
      }
      
      public Teclado(){
            super( "Teclado" );
            setSize( 300, 250 );
            setLayout( new GridLayout(4, 3, 3, 3) );
            add( button1 );
            add( button2 );
            add( button3 );
            add( button4 );
            add( button5 );
            add( button6 );
            add( button7 );
            add( button8 );
            add( button9 );
            add( buttonAsterisco );
            add( button0 );
            add( buttonTralha );
            setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            setVisible( true );
      }
    
}
