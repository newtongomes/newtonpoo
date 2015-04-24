package br.estacio.poo.alunos.frames;

import br.estacio.poo.alunos.dao.zzzUsuarioDAO;
import br.estacio.poo.alunos.entidade.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Newton
 */
public class FrameTurma extends javax.swing.JInternalFrame {

    private zzzUsuarioDAO daoUsuario = new zzzUsuarioDAO();

    public FrameTurma() {
        super("Projeto Alunos - Cadastro de Turmas do Sistema",
                false, false, false, true);
        initComponents();
        
        this.setFrameIcon(
             new javax.swing.ImageIcon(getClass().getResource(
                "/br/estacio/poo/alunos/imagens/icon_aluno3.jpg")));

        initComponents();
    }

    public void inicializar()
    {
        habilitarBotoes(false);
        habilitarCampos(false);
        limparCampos();
        textCodigo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnFechar.setEnabled(true);   
        textCodigo.requestFocus();    
    }

    private void habilitarBotoes(boolean habilita)
    {
        btnBuscar.setEnabled(habilita);
        btnNovo.setEnabled(habilita);
        btnPesquisar.setEnabled(habilita);
        btnAlterar.setEnabled(habilita);
        btnExcluir.setEnabled(habilita);
        btnGravar.setEnabled(habilita);
        btnCancelar.setEnabled(habilita);
        btnFechar.setEnabled(habilita);
    }

    private void habilitarCampos(boolean habilita)
    {
        textCodigo.setEnabled(habilita);
        textNome.setEnabled(habilita);
        textLogin.setEnabled(habilita);
    }
    
    private void limparCampos()
    {
        textCodigo.setText("");
        textNome.setText("");
        textLogin.setText("");
    }
    
    private Usuario lerCampos()
    {
        Usuario u = new Usuario();
        if (textCodigo.getText().isEmpty())
            u.setCodigo(0);
        else
            u.setCodigo(Integer.parseInt(textCodigo.getText()));
        u.setNome(textNome.getText());
        u.setLogin(textLogin.getText());
        
        return u;
    }

    private void atualizarCampos(Usuario u)
    {
        textCodigo.setText(u.getCodigo()+"");
        textNome.setText(u.getNome());
        textLogin.setText(u.getLogin());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        textNome = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        textLogin = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        labelCpf = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        labelConfirmaSenha1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(0, 0, 153));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/isimple_system_lnx-Icons-16X16-file_new.png-16x16.png"))); // NOI18N
        btnNovo.setText(" Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/lightning.png"))); // NOI18N
        btnBuscar.setText(" Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGravar.setForeground(new java.awt.Color(0, 0, 153));
        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/disk.png"))); // NOI18N
        btnGravar.setText(" Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(204, 0, 0));
        labelLogin.setText("Professor");

        labelTitulo.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 204));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/icon_turma1.jpg"))); // NOI18N
        labelTitulo.setText("  Cadastro de Turmas");

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 153));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/isimple_system_lnx-Icons-16X16-app_search.png-16x16.png"))); // NOI18N
        btnPesquisar.setText(" Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/cross.png"))); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(204, 0, 0));
        labelCodigo.setText("Código");

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(0, 0, 153));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/door_in.png"))); // NOI18N
        btnFechar.setText(" Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/application_edit.png"))); // NOI18N
        btnAlterar.setText(" Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNome.setForeground(new java.awt.Color(204, 0, 0));
        labelNome.setText("Disciplina");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/delete.png"))); // NOI18N
        btnExcluir.setText(" Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCpf.setForeground(new java.awt.Color(204, 0, 0));
        labelCpf.setText("Curso");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um curso...", "Sistemas de Informação", "Análise de Sistemas", "Redes de Computadores", "Telemática", "Jogos Digitais" }));

        labelConfirmaSenha1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelConfirmaSenha1.setForeground(new java.awt.Color(204, 0, 0));
        labelConfirmaSenha1.setText("Turno");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox7.setText("Manhã");

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox8.setText("Tarde");

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox9.setText("Noite");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox7)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox8)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox9)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/icon_usuario.jpg"))); // NOI18N
        jButton1.setText("Alunos da Turma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelConfirmaSenha1)
                            .addComponent(labelCpf)
                            .addComponent(labelLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textNome)
                                .addComponent(textLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGravar)
                                .addGap(35, 35, 35)
                                .addComponent(btnCancelar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(btnBuscar)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelLogin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCpf)))
                            .addComponent(labelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConfirmaSenha1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravar)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCampos();
        this.habilitarBotoes(false);
        this.habilitarCampos(true);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        textCodigo.setEnabled(false);
        textNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Usuario usuario;
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        String pesquisar = textCodigo.getText();
        this.limparCampos();

        if (pesquisar.isEmpty())
        {
            JOptionPane.showMessageDialog(this,
                "Erro : Preencha o valor do código para buscar...",
                "Erro!",JOptionPane.ERROR_MESSAGE);
            return;
        }

        usuario = daoUsuario.consultar(Integer.parseInt(pesquisar));
        if (usuario == null)
        {
            JOptionPane.showMessageDialog(this,
                "Erro : Código do Usuário Não Localizado.",
                "Erro!",JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.atualizarCampos(usuario);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        textCodigo.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Usuario usuario = this.lerCampos();

        if (textCodigo.getText().isEmpty())   // Inclusão de Cadastro
        {
            if (daoUsuario.incluir(usuario))
            {
                JOptionPane.showMessageDialog(this,
                    "Registro incluido com sucesso.");
                textCodigo.setText(usuario.getCodigo()+"");
            }
            else
            {
                JOptionPane.showMessageDialog(this,
                    "Erro na inclusão do Registro.","Erro!",
                    JOptionPane.ERROR_MESSAGE);
                this.limparCampos();
            }
        }
        else  ///// Alteração de Cadastro
        {
            if (daoUsuario.alterar(usuario))
            {
                JOptionPane.showMessageDialog(this,
                    "Registro alterado com sucesso.");
            }
            else
            {
                JOptionPane.showMessageDialog(this,
                    "Erro na alteração do Registro.","Erro!",
                    JOptionPane.ERROR_MESSAGE);
                this.limparCampos();
            }
        }

        this.habilitarBotoes(false);
        this.habilitarCampos(false);
        textCodigo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnFechar.setEnabled(true);
        textCodigo.requestFocus();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //JDesktopPane desktop = this.getDesktopPane();
        //if (framePesquisa == null)
        //{
            //    framePesquisa = new FramePesquisaUsuarios(this,daoUsuario);
            //    desktop.add(framePesquisa);
            //    ClasseUtil.centralizarInternalFrame(framePesquisa);
            //}
        //framePesquisa.setVisible(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarBotoes(false);
        this.habilitarCampos(false);
        textCodigo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnFechar.setEnabled(true);
        textCodigo.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.setVisible(false);
        //this.getDesktopPane().repaint();
        //try { this.setClosed(true); }
        //catch (Exception e) { }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.habilitarBotoes(false);
        this.habilitarCampos(true);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        textCodigo.setEnabled(false);
        textNome.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(this,"Deseja excluir o Usuario:\n"+
            textCodigo.getText()+"-"+textNome.getText()+" ?","Confirma Exclusão...",
            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) ==
        JOptionPane.YES_OPTION)
        {
            if (daoUsuario.excluir(Integer.parseInt(textCodigo.getText())))
            {
                JOptionPane.showMessageDialog(this,
                    "Registro Excluído com sucesso.");
                this.limparCampos();
                this.habilitarBotoes(false);
                btnBuscar.setEnabled(true);
                btnNovo.setEnabled(true);
                btnPesquisar.setEnabled(true);
                textCodigo.requestFocus();
            }
            else
            {
                JOptionPane.showMessageDialog(this,
                    "Erro na exclusão do Registro.","Erro!",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelConfirmaSenha1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}