package br.estacio.poo.alunos.netto;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercicio3 extends JFrame{
    public Exercicio3(){
        JButton um = new JButton("1");
        JButton dois = new JButton("2");
        JButton tres = new JButton("3");
        JButton quatro = new JButton("4");
        JButton cinco = new JButton("5");
        JButton seis = new JButton("6");
        JButton sete = new JButton("7");
        JButton oito = new JButton("8");
        JButton nove = new JButton("9");
        JButton asterisco = new JButton("*");
        JButton zero = new JButton("0");
        JButton sharp = new JButton("#");
        
        setTitle("Teclado");
        setLayout(new GridLayout(4, 3));
        
        add(um);
        add(dois);
        add(tres);
        add(quatro);
        add(cinco);
        add(seis);
        add(sete);
        add(oito);
        add(nove);
        add(asterisco);
        add(zero);
        add(sharp);
        
    }
    
    public static void main(String[] args){
        Exercicio3 janela = new Exercicio3();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setSize(300, 200);
        janela.setVisible(true);
    }    
}
