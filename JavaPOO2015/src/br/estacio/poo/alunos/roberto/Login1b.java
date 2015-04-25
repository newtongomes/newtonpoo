package br.estacio.poo.alunos.roberto;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author fic
 */
public class Login1b extends JFrame {
    private JLabel labelUsuario = new JLabel("Usuário:", JLabel.RIGHT);
    private JLabel labelSenha = new JLabel("Senha:", JLabel.RIGHT);
    private JTextField textUsuario = new JTextField(15);
    private JTextField textSenha = new JTextField(15);
    private JButton buttonOk = new JButton("Ok");
    private JButton buttonSair = new JButton("Sair");
    
    public static void main(String args[]){
        new Login1b();
    }
    
    public Login1b()
    {
        super( "Login de acesso" );
        setSize( 350, 130 );
        setLayout( new GridLayout( 3, 2, 3, 3 ) );
        add( labelUsuario);
        add( textUsuario );
        add( labelSenha );
        add( textSenha );
        add( buttonOk );
        add( buttonSair );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible( true );
    }
    
}
