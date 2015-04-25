package br.estacio.poo.swing.exercicios;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio5 extends JFrame{
    public Exercicio5(){
        JTextField metro = new JTextField(10);
        JTextField kilometro = new JTextField(10);
        JTextField litro = new JTextField(10);
        JTextField kmh = new JTextField(10);
        JTextField c = new JTextField(10);
        JTextField polegada = new JTextField(10);
        JTextField libra = new JTextField(10);
        JTextField galao = new JTextField(10);
        JTextField ms = new JTextField(10);
        JTextField f = new JTextField(10);
        JButton mTOp = new JButton("Converter");
        JButton kTOl = new JButton("Converter");
        JButton lTOg = new JButton("Converter");
        JButton kTOm = new JButton("Converter");
        JButton cTOf = new JButton("Converter");
        
        setTitle("Conversor de Medidas");
        setLayout(new GridLayout(5, 6));
        
        add(addJLabel("Distancia: "));
        add(metro);
        add(addJLabel("metros"));
        add(mTOp);
        add(polegada);
        add(addJLabel("polegadas"));
        add(addJLabel("Massa: "));
        add(kilometro);
        add(addJLabel("Kilometros"));
        add(kTOl);
        add(libra);
        add(addJLabel("livras"));
        add(addJLabel("Volume: "));
        add(litro);
        add(addJLabel("litros"));
        add(lTOg);
        add(galao);
        add(addJLabel("galões"));
        add(addJLabel("Velocidade: "));
        add(kmh);
        add(addJLabel("Km/h"));
        add(kTOm);
        add(ms);
        add(addJLabel("m/s"));
        add(addJLabel("Temperatura: "));
        add(c);
        add(addJLabel("C"));
        add(cTOf);
        add(f);
        add(addJLabel("F"));
    }
    
    public JLabel addJLabel(String t){
        JLabel nova = new JLabel(t);
        return nova;
    }
    
    public static void main(String[] args){
        Exercicio5 janela = new Exercicio5();
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setVisible(true);
    }    
}
