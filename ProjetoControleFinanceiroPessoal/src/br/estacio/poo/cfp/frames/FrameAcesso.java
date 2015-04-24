package br.estacio.poo.cfp.frames;

import java.awt.*;
import javax.swing.*;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton Gomes - 13/04/2015
 */
public class FrameAcesso extends javax.swing.JFrame {

    public FrameAcesso() 
    {
        //javax.swing.plaf.nimbus.NimbusLookAndFeel
        //javax.swing.plaf.metal.MetalLookAndFeel
        //com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        //com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel
        //com.sun.java.swing.plaf.motif.MotifLookAndFeel
        try 
        {
           //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception e)
        { e.printStackTrace(); }

        initComponents();

        this.setIconImage(
             new ImageIcon(getClass().getResource(
                 "/br/estacio/poo/cfp/imagens/money.png"))
                 .getImage());

        /*
        
        setLayout(new BorderLayout());
        desktop.setBackground(Color.GRAY);
        add(desktop,"Center");
        add(lblStatus,"South");

        try 
        {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        { e.printStackTrace(); }
        
        this.setIconImage(
             new javax.swing.ImageIcon(getClass().getResource(
                "/br/estacio/poo/alunos/imagens/icon_aluno12.jpg"))
                .getImage());

        Calendar data = GregorianCalendar.getInstance();
        lblStatus.setText(
                " Projeto para Cadastro de Alunos : By Newton Gomes 2014.2  -  " 
                + data.get(Calendar.DATE) + " de " 
                + nomeMes[data.get(Calendar.MONTH)] + 
                " de " + data.get(Calendar.YEAR));
        
        setExtendedState(MAXIMIZED_BOTH);  
        setVisible(false);
        
        // Testando conexão com Banco de Dados
        java.sql.Connection conn =
        new br.estacio.poo.alunos.persistencia.ConnectionFactory().getDerbyConnection();
        JOptionPane.showMessageDialog(null, "Conexão com Banco de Dados criada.");
        // Criando DAOs
        daoUsuario = new UsuarioDAO();
        
        // Criando tabelas no Banco de Dados
        daoUsuario.createTable();

        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            JOptionPane.showMessageDialog(null, info.getClassName());
        }
        JOptionPane.showMessageDialog(null, "System: "+UIManager.getSystemLookAndFeelClassName());
        //javax.swing.plaf.nimbus.NimbusLookAndFeel
        //javax.swing.plaf.metal.MetalLookAndFeel
        //com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        //com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel
        //com.sun.java.swing.plaf.motif.MotifLookAndFeel
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        
        
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
*/        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFrame = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblRodape2 = new javax.swing.JLabel();
        lblRodape3 = new javax.swing.JLabel();
        lblRodape4 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblCadSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Acesso...");
        setResizable(false);

        pnlFrame.setBackground(new java.awt.Color(0, 102, 102));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/cfp/imagens/login2.jpg"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 255, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("C. F. P.");

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 0));
        lblSenha.setText("Senha de Acesso:");

        btnAcessar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAcessar.setForeground(new java.awt.Color(0, 0, 102));
        btnAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/cfp/imagens/accept.png"))); // NOI18N
        btnAcessar.setMnemonic('A');
        btnAcessar.setText("  Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/cfp/imagens/cancel.png"))); // NOI18N
        btnCancelar.setMnemonic('C');
        btnCancelar.setLabel("  Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 51, 204));
        txtSenha.setText("jPasswordField1");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51)));
        txtSenha.setEchoChar('*');

        lblRodape2.setBackground(new java.awt.Color(204, 204, 204));
        lblRodape2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblRodape2.setForeground(new java.awt.Color(204, 204, 204));
        lblRodape2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRodape2.setText("Estácio | FIC - 2015.1");

        lblRodape3.setBackground(new java.awt.Color(204, 204, 204));
        lblRodape3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblRodape3.setForeground(new java.awt.Color(204, 204, 204));
        lblRodape3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRodape3.setText("Programação Orientada a Objetos");

        lblRodape4.setBackground(new java.awt.Color(204, 204, 204));
        lblRodape4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblRodape4.setForeground(new java.awt.Color(204, 204, 204));
        lblRodape4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRodape4.setText("Desenvolvido por Newton Gomes");

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 255, 102));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Controle Financeiro Pessoal");

        lblCadSenha.setDisplayedMnemonic('S');
        lblCadSenha.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblCadSenha.setForeground(new java.awt.Color(204, 204, 0));
        lblCadSenha.setText("<html><u>Cadastrar Senha...</u></html>");
        lblCadSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlFrameLayout = new javax.swing.GroupLayout(pnlFrame);
        pnlFrame.setLayout(pnlFrameLayout);
        pnlFrameLayout.setHorizontalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblImagem)
                .addGap(18, 18, 18)
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRodape2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRodape3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(lblRodape4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAcessar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lblCadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFrameLayout.setVerticalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFrameLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitulo1))
                    .addComponent(lblImagem))
                .addGap(13, 30, Short.MAX_VALUE)
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrameLayout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrameLayout.createSequentialGroup()
                        .addComponent(btnAcessar)
                        .addGap(32, 32, 32)))
                .addComponent(lblCadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnCancelar)
                .addGap(3, 3, 3)
                .addComponent(lblRodape2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRodape3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRodape4)
                .addContainerGap())
        );

        lblImagem.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        new FrameMenu();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAcessarActionPerformed


    public static void main(String args[]) {
        
        new FrameAcesso().setVisible(true);      
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblCadSenha;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblRodape2;
    private javax.swing.JLabel lblRodape3;
    private javax.swing.JLabel lblRodape4;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnlFrame;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
