package br.estacio.poo.cfp.frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton - 20/04/2015
 */
public class FrameMenu extends javax.swing.JFrame {

    public FrameMenu() 
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
        
        
        
        
        
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuPagamentos = new javax.swing.JMenuItem();
        mnuRecebimentos = new javax.swing.JMenuItem();
        mnuFornecedores = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenu();
        mnuConsultaPag = new javax.swing.JMenuItem();
        mnuConsultaRec = new javax.swing.JMenuItem();
        mnuSistema = new javax.swing.JMenu();
        mnuAlterarSenha = new javax.swing.JMenuItem();
        mnuLogoff = new javax.swing.JMenuItem();
        mnuFinalizar = new javax.swing.JMenuItem();
        mnuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CFP :: Menu Principal");

        mnuCadastro.setMnemonic('C');
        mnuCadastro.setText("Cadastro");

        mnuPagamentos.setMnemonic('P');
        mnuPagamentos.setText("Pagamentos");
        mnuPagamentos.setName(""); // NOI18N
        mnuCadastro.add(mnuPagamentos);

        mnuRecebimentos.setMnemonic('R');
        mnuRecebimentos.setText("Recebimentos");
        mnuRecebimentos.setName(""); // NOI18N
        mnuCadastro.add(mnuRecebimentos);

        mnuFornecedores.setMnemonic('F');
        mnuFornecedores.setText("Fornecedores");
        mnuCadastro.add(mnuFornecedores);

        mnuClientes.setMnemonic('C');
        mnuClientes.setText("Clientes");
        mnuCadastro.add(mnuClientes);

        barraMenu.add(mnuCadastro);

        mnuConsulta.setMnemonic('n');
        mnuConsulta.setText("Consulta");

        mnuConsultaPag.setText("Pagamentos no Período");
        mnuConsulta.add(mnuConsultaPag);

        mnuConsultaRec.setText("Recebimentos no Período");
        mnuConsulta.add(mnuConsultaRec);

        barraMenu.add(mnuConsulta);

        mnuSistema.setMnemonic('S');
        mnuSistema.setText("Sistema");
        mnuSistema.setName(""); // NOI18N

        mnuAlterarSenha.setMnemonic('A');
        mnuAlterarSenha.setText("Alterar Senha...");
        mnuSistema.add(mnuAlterarSenha);

        mnuLogoff.setMnemonic('L');
        mnuLogoff.setText("Logoff");
        mnuSistema.add(mnuLogoff);

        mnuFinalizar.setMnemonic('F');
        mnuFinalizar.setText("Finalizar");
        mnuFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFinalizarActionPerformed(evt);
            }
        });
        mnuSistema.add(mnuFinalizar);

        barraMenu.add(mnuSistema);

        mnuSobre.setMnemonic('b');
        mnuSobre.setText("Sobre...");
        barraMenu.add(mnuSobre);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFinalizarActionPerformed
        if (JOptionPane.showConfirmDialog(this,
            "Deseja sair do Controle Financeiro Pessoal ?",
            "Confirma Saída...", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE)
            == JOptionPane.YES_OPTION) 
        {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuFinalizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem mnuAlterarSenha;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenu mnuConsulta;
    private javax.swing.JMenuItem mnuConsultaPag;
    private javax.swing.JMenuItem mnuConsultaRec;
    private javax.swing.JMenuItem mnuFinalizar;
    private javax.swing.JMenuItem mnuFornecedores;
    private javax.swing.JMenuItem mnuLogoff;
    private javax.swing.JMenuItem mnuPagamentos;
    private javax.swing.JMenuItem mnuRecebimentos;
    private javax.swing.JMenu mnuSistema;
    private javax.swing.JMenu mnuSobre;
    // End of variables declaration//GEN-END:variables
}
