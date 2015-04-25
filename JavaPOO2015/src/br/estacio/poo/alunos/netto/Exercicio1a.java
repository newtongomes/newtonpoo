package br.estacio.poo.alunos.netto;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Exercicio1a extends JFrame{
    public Exercicio1a(){
        setTitle("Login de Acesso");
        setLayout(new FlowLayout(FlowLayout.CENTER));
//        setLayout(new GridLayout(3, 0));
        JLabel labelNome = new JLabel();
        JLabel labelSenha = new JLabel();
        JTextField usuario = new JTextField(20);
        JPasswordField senha = new JPasswordField(20);
        JButton btnOk = new JButton("Ok");
        JButton btnSair = new JButton("Sair");
        
        labelNome.setText("Usuário: ");
        labelNome.setHorizontalTextPosition((SwingConstants.LEFT));
        labelNome.setVerticalTextPosition( SwingConstants.BOTTOM); 
        labelSenha.setText("Senha:   ");
        labelSenha.setHorizontalTextPosition((SwingConstants.LEFT));
        
        add(labelNome);
        add(usuario);
        add(labelSenha);
        add(senha);
        add(btnOk);
        add(btnSair);
    }
    public static void main( String args[] ) { 
        Exercicio1a labelFrame = new Exercicio1a();
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        labelFrame.setSize( 275, 180 );
        labelFrame.setVisible( true );
    } 
}
