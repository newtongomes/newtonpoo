package br.estacio.poo.swing.exercicios;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exercicio1b extends JFrame{
    public Exercicio1b(){
        JLabel labelNome = new JLabel();
        JLabel labelSenha = new JLabel();
        JTextField usuario = new JTextField(20);
        JPasswordField senha = new JPasswordField(20);
        JButton btnOk = new JButton("Ok");
        JButton btnSair = new JButton("Sair");
        
        setTitle("Login de Acesso");
        setLayout(new GridLayout(3, 2,WIDTH, WIDTH));
        
        labelNome.setText("Usuário: ");
        labelSenha.setText("Senha:   ");
        
        add(labelNome);
        add(usuario);
        add(labelSenha);
        add(senha);
        add(btnOk);
        add(btnSair);
    }
    public static void main( String args[] ) { 
        Exercicio1b labelFrame = new Exercicio1b();
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        labelFrame.setSize( 275, 180 );
        labelFrame.setVisible( true );
    }
}
