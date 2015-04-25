package br.com.poo.exercicio_frame_layout.exercicio5;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author fic
 */
public class ConversorDeMedidas extends JFrame {

    private JLabel labelDistancia = new JLabel( "Distância:" );
    private JLabel labelMassa = new JLabel( "Massa:" );
    private JLabel labelVolume = new JLabel( "Volume:" );
    private JLabel labelVelocidade = new JLabel( "Velocidade:" );
    private JLabel labelTemperatura = new JLabel( "Temperatura:" );
    
    private JLabel labelMetros = new JLabel( "metros" );
    private JLabel labelKg = new JLabel( "kilogramas" );
    private JLabel labelLitros = new JLabel( "litros" );
    private JLabel labelKm = new JLabel( "km/h" );
    private JLabel labelCelsius = new JLabel( "ºC" );
    
    private JLabel labelPolegadas = new JLabel( "polegadas" );
    private JLabel labelLibras = new JLabel( "libras" );
    private JLabel labelGaloes = new JLabel( "galões" );
    private JLabel labelMs = new JLabel( "m/s" );
    private JLabel labelF = new JLabel( "F" );
    
    private JTextField textDistancia = new JTextField( 10 );
    private JTextField textMassa = new JTextField( 10 );
    private JTextField textVolume = new JTextField( 10 );
    private JTextField textVelocidade = new JTextField( 10 );
    private JTextField textTemperatura = new JTextField( 10 );
    private JTextField textConverterDistancia = new JTextField( 10 );
    private JTextField textConverterMassa = new JTextField( 10 );
    private JTextField textConverterVolume = new JTextField( 10 );
    private JTextField textConverterVelocidade = new JTextField( 10 );
    private JTextField textConverterTemperatura = new JTextField( 10 );
    
    private JButton btnConverterDistancia = new JButton("Converter");
    private JButton btnConverterMassa = new JButton("Converter");
    private JButton btnConverterVolume = new JButton("Converter");
    private JButton btnConverterVelocidade = new JButton("Converter");
    private JButton btnConverterTemperatura = new JButton("Converter");
    
    public static void main(String args[]){
        new ConversorDeMedidas();
    }
    
    public ConversorDeMedidas(){
        super( "Conversor de Medidas" );
        setSize( 650, 170 );
        setLayout( new GridLayout(5, 6, 5, 5) );
        add( labelDistancia );
        add( textDistancia );
        add( labelMetros );
        add( btnConverterDistancia );
        add( textConverterDistancia );
        add( labelPolegadas );
        
        add( labelMassa );
        add( textMassa );
        add( labelKg );
        add( btnConverterMassa );
        add( textConverterMassa );
        add( labelLibras );
        
        add( labelVolume );
        add( textVolume );
        add( labelLitros );
        add( btnConverterVolume );
        add( textConverterVolume );
        add( labelGaloes );
        
        add( labelVelocidade );
        add( textVelocidade );
        add( labelKm );
        add( btnConverterVelocidade );
        add( textConverterVelocidade );
        add( labelMs );
        
        add( labelTemperatura );
        add( textTemperatura );
        add( labelCelsius );
        add( btnConverterTemperatura );
        add( textConverterTemperatura );
        add( labelF );
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setVisible( true );
    }
    
}
