package br.estacio.poo.alunos.util;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Newton
 */
public class ClasseUtil 
{
    
    public static String nomeMes(int m)
    {
        switch(m)
        {
            case 1 : return "Janeiro";
            case 2 : return "Fevereiro";
            case 3 : return "Março";
            case 4 : return "Abril";
            case 5 : return "Maio";
            case 6 : return "Junho";
            case 7 : return "Julho";
            case 8 : return "Agosto";
            case 9 : return "Setembro";
            case 10 : return "Outubro";
            case 11 : return "Novembro";
            case 12 : return "Dezembro";
        }
        return "erro";
        
    }

    public static void centralizarInternalFrame(JInternalFrame frame)
    {
        Dimension dim1 = frame.getDesktopPane().getSize();
        Dimension dim2 = frame.getSize();
        if (dim1.width > dim2.width && dim1.height > dim2.height)
        {
            dim1.width = (dim1.width-dim2.width)/2;
            dim1.height = (dim1.height-dim2.height)/2;
            frame.setLocation(dim1.width, dim1.height);
        }     
        
    }

    
}
