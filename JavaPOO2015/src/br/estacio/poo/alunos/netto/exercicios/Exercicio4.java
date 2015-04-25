package br.estacio.poo.swing.exercicios;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio4 extends JFrame{
    public Exercicio4(){
        JLabel tituloLB = new JLabel("Cálculo do IMC");
        JLabel pesoLB = new JLabel("Peso: ");
        JLabel alturaLB = new JLabel("Altura: ");
        JTextField pesoTF = new JTextField(20);
        JTextField alturaTF = new JTextField(20);
        JTextField resultTF = new JTextField(20);
        JButton calcular = new JButton("Calcular");
        
        setTitle(String.valueOf(tituloLB));
        setLayout(new GridBagLayout());
        
        add(tituloLB);
        add(pesoLB);
        add(pesoTF);
        add(alturaLB);
        add(alturaTF);
        add(calcular);
        add(resultTF);
    }
    public static void main(String[] args){
        Exercicio4 janela = new Exercicio4();
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setVisible(true);
    }    
}
