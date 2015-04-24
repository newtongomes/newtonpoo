package br.estacio.poo.agenda.frame;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Newton
 */
public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
        try {
           UIManager.setLookAndFeel
              (UIManager.
               getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {  }
        
        setLayout(new BorderLayout());
        add(desktop,BorderLayout.CENTER);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuSalvar = new javax.swing.JMenuItem();
        mnuInfo = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        mnuCadastro = new javax.swing.JMenu();
        mnuContatos = new javax.swing.JMenuItem();
        mnuAgenda = new javax.swing.JMenuItem();
        mnuPesquisa = new javax.swing.JMenu();
        mnuPesqNome = new javax.swing.JMenuItem();
        mnuPesqTelefone = new javax.swing.JMenuItem();
        mnuSistema = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuProtegido = new javax.swing.JCheckBoxMenuItem();
        mnuMaximizado = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:: Agenda Telefônica - 2014 ::.");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        mnuArquivo.setMnemonic('A');
        mnuArquivo.setText("Arquivo");

        mnuSalvar.setMnemonic('S');
        mnuSalvar.setText("Salvar");
        mnuArquivo.add(mnuSalvar);

        mnuInfo.setMnemonic('I');
        mnuInfo.setText("Informações");
        mnuArquivo.add(mnuInfo);

        mnuSair.setMnemonic('r');
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuSair);

        barraMenu.add(mnuArquivo);

        mnuCadastro.setMnemonic('C');
        mnuCadastro.setText("Cadastro");

        mnuContatos.setText("Contatos");
        mnuContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuContatosActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuContatos);

        mnuAgenda.setText("Agenda");
        mnuCadastro.add(mnuAgenda);

        barraMenu.add(mnuCadastro);

        mnuPesquisa.setMnemonic('P');
        mnuPesquisa.setText("Pesquisa");

        mnuPesqNome.setText("Nome do Contato");
        mnuPesquisa.add(mnuPesqNome);

        mnuPesqTelefone.setText("Telefone");
        mnuPesquisa.add(mnuPesqTelefone);

        barraMenu.add(mnuPesquisa);

        mnuSistema.setMnemonic('S');
        mnuSistema.setText("Sistema");

        mnuSobre.setText("Sobre...");
        mnuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSobreActionPerformed(evt);
            }
        });
        mnuSistema.add(mnuSobre);
        mnuSistema.add(jSeparator1);

        mnuProtegido.setSelected(true);
        mnuProtegido.setText("Protegido");
        mnuSistema.add(mnuProtegido);

        mnuMaximizado.setSelected(true);
        mnuMaximizado.setText("Maximizado");
        mnuSistema.add(mnuMaximizado);

        barraMenu.add(mnuSistema);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        if (JOptionPane.showConfirmDialog(
                this, "Deseja Sair da Agenda Telefônica ?",
                "Saida do Programa...",JOptionPane.YES_NO_CANCEL_OPTION)
                == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }

    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuContatosActionPerformed
        
        FrameContato frameContato = new FrameContato();
        desktop.add(frameContato);
        frameContato.setVisible(true);
        
        /*
        if (frameContato == null)
        {
            frameContato = new FrameContato();
            frameContato.setVisible(true);
        }
        else
            frameContato.setVisible(true);
        */
        
        
    }//GEN-LAST:event_mnuContatosActionPerformed

    private void mnuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSobreActionPerformed
        new FrameSobre(this, true);
    }//GEN-LAST:event_mnuSobreActionPerformed

    
    private FrameContato frameContato = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuAgenda;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuContatos;
    private javax.swing.JMenuItem mnuInfo;
    private javax.swing.JCheckBoxMenuItem mnuMaximizado;
    private javax.swing.JMenuItem mnuPesqNome;
    private javax.swing.JMenuItem mnuPesqTelefone;
    private javax.swing.JMenu mnuPesquisa;
    private javax.swing.JCheckBoxMenuItem mnuProtegido;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenuItem mnuSalvar;
    private javax.swing.JMenu mnuSistema;
    private javax.swing.JMenuItem mnuSobre;
    // End of variables declaration//GEN-END:variables
}
