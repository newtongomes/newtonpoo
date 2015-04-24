package br.estacio.poo.alunos.frames;

import br.estacio.poo.alunos.dao.zzzUsuarioDAO;
import br.estacio.poo.alunos.entidade.Usuario;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Newton
 */
public class FrameUsuario extends javax.swing.JInternalFrame {

    private zzzUsuarioDAO daoUsuario = new zzzUsuarioDAO();

    public FrameUsuario() {
        //super(title, resizable, closable, maximizable, iconable)
        super("Projeto Alunos - Cadastro de Usuários do Sistema",
                false, false, false, true);
        initComponents();
        
        this.setFrameIcon(
             new javax.swing.ImageIcon(getClass().getResource(
                "/br/estacio/poo/alunos/imagens/icon_usuario.jpg")));
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
        textCpf.setEnabled(habilita);
        textTelefone.setEnabled(habilita);
        textLogin.setEnabled(habilita);
        textSenha.setEnabled(habilita);
        textConfirmaSenha.setEnabled(habilita);
    }
    
    private void limparCampos()
    {
        textCodigo.setText("");
        textNome.setText("");
        textCpf.setText("");
        textTelefone.setText("");
        textLogin.setText("");
        textSenha.setText("");
        textConfirmaSenha.setText("");
    }
    
    private Usuario lerCampos()
    {
        Usuario u = new Usuario();
        if (textCodigo.getText().isEmpty())
            u.setCodigo(0);
        else
            u.setCodigo(Integer.parseInt(textCodigo.getText()));
        u.setNome(textNome.getText());
        u.setTelefone(textTelefone.getText());
        u.setCpf(textCpf.getText());
        u.setLogin(textLogin.getText());
        u.setSenha(new String(textSenha.getPassword()));
        
        return u;
    }

    private void atualizarCampos(Usuario u)
    {
        textCodigo.setText(u.getCodigo()+"");
        textNome.setText(u.getNome());
        textTelefone.setText(u.getTelefone());
        textCpf.setText(u.getCpf());
        textLogin.setText(u.getLogin());
        textSenha.setText(u.getSenha());
        textConfirmaSenha.setText(u.getSenha());   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        textNome = new javax.swing.JTextField();
        textCodigo = new javax.swing.JTextField();
        textCpf = new javax.swing.JFormattedTextField();
        textTelefone = new javax.swing.JFormattedTextField();
        btnNovo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        labelTelefone = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        textLogin = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        textConfirmaSenha = new javax.swing.JPasswordField();
        btnFechar = new javax.swing.JButton();
        labelConfirmaSenha = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        labelTitulo.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 204));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/48px-Crystal_Clear_app_Login_Manager.png"))); // NOI18N
        labelTitulo.setText("  Cadastro de Usuários do Sistema");

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(204, 0, 0));
        labelCodigo.setText("Código");

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNome.setForeground(new java.awt.Color(204, 0, 0));
        labelNome.setText("Nome");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/delete.png"))); // NOI18N
        btnExcluir.setText(" Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 153));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/isimple_system_lnx-Icons-16X16-app_search.png-16x16.png"))); // NOI18N
        btnPesquisar.setText(" Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        try {
            textCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(204, 0, 0));
        labelTelefone.setText("Telefone");

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCpf.setForeground(new java.awt.Color(204, 0, 0));
        labelCpf.setText("CPF");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/cross.png"))); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
        labelLogin.setText("Login de Acesso");

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(0, 0, 153));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/door_in.png"))); // NOI18N
        btnFechar.setText(" Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        labelConfirmaSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelConfirmaSenha.setForeground(new java.awt.Color(204, 0, 0));
        labelConfirmaSenha.setText("Confirmação de Senha");

        labelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(204, 0, 0));
        labelSenha.setText("Senha de Acesso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelConfirmaSenha)
                                        .addComponent(labelSenha)
                                        .addComponent(labelLogin)
                                        .addComponent(btnGravar))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnCancelar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnFechar))
                                        .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPesquisar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNome)
                                            .addComponent(labelCpf))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNovo)
                                                .addGap(22, 22, 22)
                                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(10, 10, 10)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(btnBuscar)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefone)
                            .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin)
                    .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConfirmaSenha)
                    .addComponent(textConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGravar)
                    .addComponent(btnFechar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.habilitarBotoes(false);
        this.habilitarCampos(true);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        textCodigo.setEnabled(false);
        textNome.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

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

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Usuario usuario = this.lerCampos();

        if (! usuario.getSenha().equals(new String(textConfirmaSenha.getPassword())))
        {
            JOptionPane.showMessageDialog(this,
                "Erro : Senha/Confirmação não confere.",
                "Erro!",JOptionPane.ERROR_MESSAGE);
            return;
        }

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

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.setVisible(false);
        //this.getDesktopPane().repaint();
        //try { this.setClosed(true); }
        //catch (Exception e) { }
    }//GEN-LAST:event_btnFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelConfirmaSenha;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JPasswordField textConfirmaSenha;
    private javax.swing.JFormattedTextField textCpf;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
