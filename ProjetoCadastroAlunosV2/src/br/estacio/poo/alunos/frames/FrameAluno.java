package br.estacio.poo.alunos.frames;

import br.estacio.poo.alunos.dao.zzzUsuarioDAO;
import br.estacio.poo.alunos.entidade.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Newton
 */
public class FrameAluno extends javax.swing.JInternalFrame {

    private zzzUsuarioDAO daoUsuario = new zzzUsuarioDAO();

    public FrameAluno() {
        super("Projeto Alunos - Cadastro de Alunos no Sistema",
                false, false, false, true);
        initComponents();
        
        this.setFrameIcon(
             new javax.swing.ImageIcon(getClass().getResource(
                "/br/estacio/poo/alunos/imagens/icon_aluno7.jpg")));

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnFechar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        labelConfirmaSenha = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        textLogin = new javax.swing.JTextField();
        textNome = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        labelSenha3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(0, 0, 153));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/door_in.png"))); // NOI18N
        btnFechar.setText(" Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(0, 0, 153));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/isimple_system_lnx-Icons-16X16-file_new.png-16x16.png"))); // NOI18N
        btnNovo.setText(" Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        labelConfirmaSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelConfirmaSenha.setForeground(new java.awt.Color(204, 0, 0));
        labelConfirmaSenha.setText("Turno");

        labelTitulo.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 204));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/icon_aluno10.jpg"))); // NOI18N
        labelTitulo.setText(" Cadastro de Alunos");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/lightning.png"))); // NOI18N
        btnBuscar.setText(" Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(204, 0, 0));
        labelCodigo.setText("Matrícula");

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(204, 0, 0));
        labelTelefone.setText("Sexo");

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNome.setForeground(new java.awt.Color(204, 0, 0));
        labelNome.setText("Nome");

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCpf.setForeground(new java.awt.Color(204, 0, 0));
        labelCpf.setText("Curso");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 153));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/delete.png"))); // NOI18N
        btnExcluir.setText(" Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 0, 153));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/application_edit.png"))); // NOI18N
        btnAlterar.setText(" Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
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

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 153));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/isimple_system_lnx-Icons-16X16-app_search.png-16x16.png"))); // NOI18N
        btnPesquisar.setText(" Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(204, 0, 0));
        labelLogin.setText("Anos");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton1.setText("Masculino");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton2.setText("Feminino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton1)
                .addComponent(jRadioButton2))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Conhecimentos do Aluno ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 0, 0))); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox1.setText("Inglês");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox2.setText("Java");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox3.setText("Linguagem C");

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox4.setText("PHP");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox5.setText(".NET");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox6.setText("SQL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox2))))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addContainerGap())
        );

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um curso...", "Sistemas de Informação", "Análise de Sistemas", "Redes de Computadores", "Telemática", "Jogos Digitais" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/poo/alunos/imagens/icon_calc3.jpg"))); // NOI18N
        jButton1.setText("Calcular...");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup2.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox7.setText("Manhã");

        buttonGroup2.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox8.setText("Tarde");

        buttonGroup2.add(jCheckBox9);
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
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jCheckBox7)
                .addComponent(jCheckBox8)
                .addComponent(jCheckBox9))
        );

        labelSenha3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelSenha3.setForeground(new java.awt.Color(204, 0, 0));
        labelSenha3.setText("Idade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(labelSenha3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelLogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(labelTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelConfirmaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnGravar)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelar)
                        .addGap(29, 29, 29)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPesquisar))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLogin)
                            .addComponent(labelSenha3)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCpf))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelConfirmaSenha))
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGravar)
                            .addComponent(btnCancelar)
                            .addComponent(btnFechar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addGap(13, 13, 13)
                        .addComponent(btnExcluir)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.setVisible(false);
        //this.getDesktopPane().repaint();
        //try { this.setClosed(true); }
        //catch (Exception e) { }
    }//GEN-LAST:event_btnFecharActionPerformed

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

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.habilitarBotoes(false);
        this.habilitarCampos(true);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        textCodigo.setEnabled(false);
        textNome.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

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

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelConfirmaSenha;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha3;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}