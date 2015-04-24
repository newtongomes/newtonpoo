package br.estacio.poo.cfp.frames;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton Gomes - 13/04/2015
 */
public class FrameCadastro extends javax.swing.JInternalFrame {

    public FrameCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlRodape = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblImgCadastro = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("CFP :: Cadastro de XXXYYYZZZ");

        pnlTitulo.setBackground(new java.awt.Color(0, 0, 102));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 204));
        lblTitulo.setText("Controle Financeiro Pessoal - CFP");
        pnlTitulo.add(lblTitulo);

        pnlRodape.setBackground(new java.awt.Color(0, 102, 102));

        lblSistema.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblSistema.setText("lblSistema");
        pnlRodape.add(lblSistema);

        lblAutor.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAutor.setText("lblAutor");
        pnlRodape.add(lblAutor);

        lblData.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("lblData");
        pnlRodape.add(lblData);

        pnlBotoes.setBackground(new java.awt.Color(255, 255, 255));

        btnExcluir.setText("Excluir");

        btnPesquisar.setText("Pesquisar");

        btnSalvar.setText("Salvar");

        btnCancelar.setText("Cancelar");

        btnEditar.setText("Editar");

        btnBuscar.setText("Buscar");

        btnNovo.setText("Novo");

        btnSair.setText("Sair");

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(40, 40, 40)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addGap(41, 41, 41)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(35, 35, 35)
                .addComponent(btnPesquisar)
                .addGap(43, 43, 43)
                .addComponent(btnSair)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnBuscar)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblImgCadastro.setText("lblImgCadastro");

        lblCadastro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(0, 0, 102));
        lblCadastro.setText("Cadastro de XXXYYYZZZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblImgCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(lblCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pnlRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImgCadastro)
                    .addComponent(lblCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
                .addComponent(pnlRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblImgCadastro;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlRodape;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
