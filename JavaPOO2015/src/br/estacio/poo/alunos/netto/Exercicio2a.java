package br.estacio.poo.alunos.netto;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercicio2a extends JFrame{
    public Exercicio2a(){
        JButton norte = new JButton("Norte");
        JButton sul = new JButton("Sul");
        JButton leste = new JButton("Leste");
        JButton oeste = new JButton("Oeste");
        
        setTitle("Bussola");
        setLayout(new BorderLayout());
        
        add(norte, BorderLayout.NORTH);
        add(oeste, BorderLayout.LINE_START);
        add(leste, BorderLayout.LINE_END);
        add(sul, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args){
        Exercicio2a janela = new Exercicio2a();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setSize(300, 200);
        janela.setVisible(true);
    }
}
