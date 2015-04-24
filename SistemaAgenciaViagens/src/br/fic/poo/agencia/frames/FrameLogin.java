package br.fic.poo.agencia.frames;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Newton Gomes - 22-abr-2013
 */
public class FrameLogin extends javax.swing.JFrame 
{

    private JFrame framePrincipal;
    /**
     * Creates new form FrameLogin
     */
    public FrameLogin(JFrame f) 
    {
        javax.swing.JPanel painel = new javax.swing.JPanel();
        painel.setBackground(Color.YELLOW);
        setContentPane(painel);
        
        framePrincipal = f;
        
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelRodape1 = new javax.swing.JLabel();
        labelRodape2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agência de Viagens - 2013-1");
        setResizable(false);

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNome.setForeground(new java.awt.Color(153, 0, 0));
        labelNome.setText("Nome");

        labelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(153, 0, 0));
        labelSenha.setText("Senha");

        btnOk.setForeground(new java.awt.Color(0, 0, 153));
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fic/poo/agencia/imagens/accept.png"))); // NOI18N
        btnOk.setText(" Acessar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(0, 0, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fic/poo/agencia/imagens/cancel.png"))); // NOI18N
        btnCancelar.setText(" Finalizar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 255));
        labelTitulo.setText("Sistema de Agência de Viagens");

        labelRodape1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        labelRodape1.setForeground(new java.awt.Color(0, 0, 204));
        labelRodape1.setText("Estácio-FIC Programação Orientada a Objetos");

        labelRodape2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        labelRodape2.setForeground(new java.awt.Color(0, 0, 204));
        labelRodape2.setText("Autor: Newton Gomes - 2013.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelSenha)
                                    .addComponent(labelNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textNome, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(textSenha)))))
                    .addComponent(labelTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelRodape1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(labelRodape2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addGap(28, 28, 28)
                .addComponent(labelRodape1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRodape2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
        ((FramePrincipal)framePrincipal).sucessoLogin();
        this.dispose();
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ((FramePrincipal)framePrincipal).confirmaSaida();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRodape1;
    private javax.swing.JLabel labelRodape2;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
