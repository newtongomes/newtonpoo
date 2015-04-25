package br.estacio.poo.swing.exercicios;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercicio2b extends JFrame{
    public Exercicio2b(){
        JLabel cabecalho = new JLabel("Cabeçalho");
        JLabel corpo = new JLabel("Corpo");
        JLabel rodape = new JLabel("Rorapé");
        
        setTitle("Documento");
        setLayout(new BorderLayout());
        
        cabecalho.setHorizontalAlignment(JLabel.CENTER);
        corpo.setHorizontalAlignment(JLabel.CENTER);
        rodape.setHorizontalAlignment(JLabel.CENTER);
        
        add(cabecalho, BorderLayout.PAGE_START);
        add(corpo, BorderLayout.CENTER);
        add(rodape, BorderLayout.PAGE_END);
    }
    
    public static void main(String[] args){
        Exercicio2b janela = new Exercicio2b();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setSize(300, 200);
        janela.setVisible(true);
    }    
}
