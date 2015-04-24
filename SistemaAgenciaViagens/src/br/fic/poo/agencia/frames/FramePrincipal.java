package br.fic.poo.agencia.frames;

import br.fic.poo.agencia.persistencia.DadosAgencia;
import br.fic.poo.teleentrega.util.ClasseUtil;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Newton Gomes - 25-abr-2013
 */
public class FramePrincipal extends javax.swing.JFrame {

    public static DadosAgencia dadosAgencia;
    
    
    public FramePrincipal() 
    {
        dadosAgencia = new DadosAgencia();
        
        initComponents();
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        { e.printStackTrace(); }
        
        this.setIconImage(
             new javax.swing.ImageIcon(getClass().getResource(
                "/br/fic/poo/agencia/imagens/icone_aviao3.png"))
                .getImage());
        
        
        setLayout(new BorderLayout());
        add(desktop,"Center");
        add(statusLabel,"South");
        
        setExtendedState(MAXIMIZED_BOTH);  
        
        setVisible(false);

        new FrameLogin(this);
        
        
        
        /*
        
        this.add(toolBar,BorderLayout.PAGE_START);
        
        Calendar data = GregorianCalendar.getInstance();
        statusLabel.setText(
                " Sistema de Tele-Entregas : By Newton Gomes 2012  -  " 
                + data.get(Calendar.DATE) + " de " 
                + ClasseUtil.nomeMes(data.get(Calendar.MONTH)+1) + 
                " de " + data.get(Calendar.YEAR));        

/*    
        JOptionPane.showMessageDialog(null,"Carregando Dados, Aguarde...");
        //forma Texto
        Biblioteca.getInstance().lerDados();
        //forma Objeto
        //try {
            //Biblioteca.getInstance().gravarBiblioteca();
        //    Biblioteca.getInstance().lerBiblioteca();
        //    JOptionPane.showMessageDialog(null,"Leitura do Arquivo realizada com sucesso.");
        //} catch(Exception e)
        //{
        //    JOptionPane.showMessageDialog(null,e.getMessage());
        //    e.printStackTrace();
        //}
        //Biblioteca.getInstance().gravarBiblioteca();
*/
        
        
    }
    
    public void sucessoLogin()
    {
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void confirmaSaida()
    {
      if (JOptionPane.showConfirmDialog(this,  
          "Deseja Sair do Sistema ?", 
          "Saída do Sistema...",
          JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION)
        System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        labelSistema1 = new javax.swing.JLabel();
        labelSistema2 = new javax.swing.JLabel();
        labelSistema3 = new javax.swing.JLabel();
        labelImagem = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuCadastroCliente = new javax.swing.JMenuItem();
        menuCadastroUsuario = new javax.swing.JMenuItem();
        menuCadastroCompanhia = new javax.swing.JMenuItem();
        menuCadastroViagem = new javax.swing.JMenuItem();
        menuAtendimento = new javax.swing.JMenu();
        menuReserva = new javax.swing.JMenuItem();
        menuConfirma = new javax.swing.JMenuItem();
        menuCancelamento = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuPainelViagem = new javax.swing.JMenuItem();
        menuViagensPorDia = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estácio-FIC - 2013.1 - Sistema de Agência de Viagens");

        desktop.setBackground(new java.awt.Color(0, 153, 153));

        labelSistema1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        labelSistema1.setForeground(new java.awt.Color(255, 255, 255));
        labelSistema1.setText("Sistema de Agência de Viagens");
        labelSistema1.setBounds(20, 140, 490, 70);
        desktop.add(labelSistema1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labelSistema2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        labelSistema2.setForeground(new java.awt.Color(255, 255, 255));
        labelSistema2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSistema2.setText("Centro Universitário Estácio do Ceará - Estácio | FIC");
        labelSistema2.setBounds(20, 200, 460, 30);
        desktop.add(labelSistema2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labelSistema3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        labelSistema3.setForeground(new java.awt.Color(255, 255, 255));
        labelSistema3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSistema3.setText("Programação Orientada a Objetos - 2013.1");
        labelSistema3.setBounds(40, 230, 460, 30);
        desktop.add(labelSistema3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fic/poo/agencia/imagens/imageaviao6.jpg"))); // NOI18N
        labelImagem.setBounds(60, 20, 390, 130);
        desktop.add(labelImagem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 0, 255));
        statusLabel.setText("Sistema de Agência de Viagens : By Newton Gomes - 2013 - dd de MMM de AAAA");

        menuArquivo.setMnemonic('C');
        menuArquivo.setText("Cadastros");

        menuCadastroCliente.setText("Clientes");
        menuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroClienteActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroCliente);

        menuCadastroUsuario.setText("Usuários");
        menuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroUsuarioActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroUsuario);

        menuCadastroCompanhia.setText("Companhias");
        menuArquivo.add(menuCadastroCompanhia);

        menuCadastroViagem.setText("Viagens (Vôos)");
        menuArquivo.add(menuCadastroViagem);

        barraMenu.add(menuArquivo);

        menuAtendimento.setMnemonic('A');
        menuAtendimento.setText("Atendimento");

        menuReserva.setText("Reservas de Viagens");
        menuAtendimento.add(menuReserva);

        menuConfirma.setText("Confirmação de Viagem");
        menuAtendimento.add(menuConfirma);

        menuCancelamento.setText("Cancelamento");
        menuAtendimento.add(menuCancelamento);

        barraMenu.add(menuAtendimento);

        menuConsultas.setMnemonic('n');
        menuConsultas.setText("Consultas");

        menuPainelViagem.setText("Painel de Viagem");
        menuConsultas.add(menuPainelViagem);

        menuViagensPorDia.setText("Viagens por Dia");
        menuConsultas.add(menuViagensPorDia);

        barraMenu.add(menuConsultas);

        menuSistema.setMnemonic('S');
        menuSistema.setText("Sistema");

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuSistema.add(menuSair);
        menuSistema.add(jSeparator2);

        menuSobre.setText("Sobre...");
        menuSistema.add(menuSobre);

        barraMenu.add(menuSistema);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(statusLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        confirmaSaida();
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroClienteActionPerformed
    
        if (frameClientes != null)
            frameClientes.dispose();
        
        frameClientes = new FrameClientes(true,true,true,true);
        desktop.add(frameClientes);
        ClasseUtil.centralizarInternalFrame(frameClientes);
        frameClientes.setVisible(true);
    }//GEN-LAST:event_menuCadastroClienteActionPerformed

    private void menuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroUsuarioActionPerformed
        //if (frameUsuarios == null)
            //frameUsuarios = new FrameUsuario();
        //desktop.add(frameUsuarios);
    }//GEN-LAST:event_menuCadastroUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelSistema1;
    private javax.swing.JLabel labelSistema2;
    private javax.swing.JLabel labelSistema3;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuAtendimento;
    private javax.swing.JMenuItem menuCadastroCliente;
    private javax.swing.JMenuItem menuCadastroCompanhia;
    private javax.swing.JMenuItem menuCadastroUsuario;
    private javax.swing.JMenuItem menuCadastroViagem;
    private javax.swing.JMenuItem menuCancelamento;
    private javax.swing.JMenuItem menuConfirma;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuPainelViagem;
    private javax.swing.JMenuItem menuReserva;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuViagensPorDia;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

    private FrameClientes frameClientes;
    //private FrameUsuario frameUsuarios;
    
}
