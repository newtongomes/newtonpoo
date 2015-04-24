// BotoesPainel.java
// Definição da classe BotoesPainel
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.ScrollPaneLayout;

public class BotoesPainel extends JPanel {
   private JButton findName, addName,
                   updateName, deleteName, clear, help;
   
   public BotoesPainel( Connection c, RotuloClientes s,
                        JTextArea t )
   {
      setLayout( new GridLayout( 1, 6 ) );

      Icon novo = new ImageIcon( "Imagens/Novo.gif" );
      clear = new JButton( novo );
      clear.addActionListener( new NovoClientes( s ) );
      add( clear );

      Icon gravar = new ImageIcon( "Imagens/Gravar.gif" );
      addName = new JButton( gravar );
      addName.addActionListener( new SalvarClientes( c, s, t ) );
      add( addName );
      
      Icon editar = new ImageIcon( "Imagens/Editar.gif" );
      updateName = new JButton( editar );
      updateName.addActionListener( new EditarClientes( c, s, t ) );
      add( updateName );

      Icon excluir = new ImageIcon( "Imagens/Excluir.gif" );
      deleteName = new JButton( excluir );
      deleteName.addActionListener( new ExcluirClientes( c, s, t ) );
      add( deleteName );

      Icon localizar = new ImageIcon( "Imagens/Localizar.gif" );
      findName = new JButton( localizar );
      findName.addActionListener( new PesquisarClientes( c, s, t ) );
      add( findName );
      
      Icon ajuda = new ImageIcon( "Imagens/Ajuda.gif" );
      help = new JButton( ajuda );
      help.addActionListener( new Ajuda( t ) );
      add( help );
   }
}


