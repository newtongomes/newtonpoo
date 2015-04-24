// Ajuda.java
// Definição da classe Ajuda
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ScrollPaneLayout;

public class Ajuda implements ActionListener {
   private JTextArea output;

   public Ajuda( JTextArea o )
   {
      output = o;
   }

   public void actionPerformed( ActionEvent e )
   {
      JOptionPane.showMessageDialog(
      null, "\nClic Pesquisar para localizar um registro.\n" +
                     "Clic Adicionar para inserir um novo registro.\n" +
                     "Clic Alterar para alterar " +
                     "a informação em um registro.\n" +
                     "Clic Limpar para esvaziar" +
                     " os campos de registros.\n", "Aviso",
      JOptionPane.PLAIN_MESSAGE );
   }
}


