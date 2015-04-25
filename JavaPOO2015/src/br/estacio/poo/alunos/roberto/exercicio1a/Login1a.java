package br.com.poo.exercicio_frame_layout.exercicio1a;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author fic
 */
public class Login1a extends JFrame{
    private JLabel labelUsuario = new JLabel("Usuário:");
    private JLabel labelSenha = new JLabel("Senha:");
    private JTextField textUsuario = new JTextField(15);
    private JTextField textSenha = new JTextField(15);
    private JButton buttonOk = new JButton("Ok");
    private JButton buttonSair = new JButton("Sair");
    
    public static void main(String args[]){
        new Login1a();
    }
    
    public Login1a()
    {
        super( "Login de acesso" );
        setSize( 270, 130 );
        setLayout( new FlowLayout() );
        add( labelUsuario );
        add( textUsuario );
        add( labelSenha );
        add( textSenha );
        add( buttonOk );
        add( buttonSair );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible( true );
    }
    
}
