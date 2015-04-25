package br.estacio.poo.alunos.roberto;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Roberto
 */
public class LabelFrame extends JFrame
{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame()
    {
        super("Testing JLabel");
        setLayout( new FlowLayout() );
        
        label1 = new JLabel( "Label com texto" );
        label1.setToolTipText( "Este é o label1" );
        add( label1 );
        
        Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) );
        label2 = new JLabel( "Label com texto e ícone", bug, SwingConstants.LEFT );
        label2.setToolTipText( "Este é o label2" );
        add( label2 );
        
        label3 = new JLabel();
        label3.setText( "Label com ícone e texto at botton" );
        label3.setIcon(bug);
        label3.setHorizontalTextPosition( SwingConstants.CENTER );
        label3.setVerticalTextPosition( SwingConstants.BOTTOM );
        label3.setToolTipText( "Este é o label3" );
        add( label3 );
    }
    
}
