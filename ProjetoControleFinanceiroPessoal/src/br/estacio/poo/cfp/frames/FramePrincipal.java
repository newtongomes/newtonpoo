package br.estacio.poo.cfp.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton Gomes - 13/04/2015
 */
public class FramePrincipal extends JFrame implements ActionListener
{
    private String titulo = "Controle Financeiro Pessoal v.0.1";
    private JButton btnPagamentos;
    private JButton btnRecebimentos;
    private JButton btnFornecedores;
    private JButton btnClientes;
    private JButton btnSenha;
    private JButton btnSair;
    private JPanel pnlBotoes;
    private JLabel lblTitulo;
    private JLabel lblRodape;
    private JPanel pnlTitulo, pnlRodape, pnlBtnPag, pnlBtnRec, 
            pnlBtnForn, pnlBtnCli, pnlBtnSenha, pnlBtnSair;
    
    public FramePrincipal()
    {
        setTitle("CFP :: "+titulo);
        setSize(400,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnPagamentos = new JButton("Pagamentos");
        pnlBtnPag = new JPanel(); pnlBtnPag.add(btnPagamentos);
        btnRecebimentos = new JButton("Recebimentos");
        pnlBtnRec = new JPanel(); pnlBtnRec.add(btnRecebimentos);
        btnFornecedores = new JButton("Fornecedores");
        pnlBtnForn = new JPanel(); pnlBtnForn.add(btnFornecedores);
        btnClientes = new JButton("Clientes");
        pnlBtnCli = new JPanel(); pnlBtnCli.add(btnClientes);
        btnSenha = new JButton("Definir Senha");
        pnlBtnSenha = new JPanel(); pnlBtnSenha.add(btnSenha);
        btnSair = new JButton("Sair");
        pnlBtnSair = new JPanel(); pnlBtnSair.add(btnSair);
        btnSair.addActionListener(this);

        pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new GridLayout(8,1));
        pnlBotoes.add(new JLabel(""));
        pnlBotoes.add(pnlBtnPag);
        pnlBotoes.add(pnlBtnRec);
        pnlBotoes.add(pnlBtnForn);
        pnlBotoes.add(pnlBtnCli);
        pnlBotoes.add(pnlBtnSenha);
        pnlBotoes.add(pnlBtnSair);
        pnlBotoes.setBackground(Color.YELLOW);

        lblTitulo = new JLabel(titulo);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Verdana",Font.BOLD,16));
        pnlTitulo = new JPanel(); pnlTitulo.add(lblTitulo);
        pnlTitulo.setBackground(Color.DARK_GRAY);

        lblRodape = new JLabel("Desenvolvido por Newton Gomes");
        lblRodape.setForeground(Color.WHITE);
        lblRodape.setFont(new Font("Verdana",Font.BOLD,11));
        pnlRodape = new JPanel(); pnlRodape.add(lblRodape);
        pnlRodape.setBackground(Color.BLUE);

        setLayout(new BorderLayout());
        add(pnlTitulo,"North");
        add(pnlBotoes,"Center");
        add(pnlRodape,"South");
        
        setVisible(true);       
    }
    

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnSair)
        {
            if (JOptionPane.showConfirmDialog(this,
                    "Deseja sair do Controle Financeiro Pessoal ?",
                    "Confirma Saída...", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION)
            {
               System.exit(0);
            }
        }
    }
    
    public static void main(String args[])
    {
        new FramePrincipal();
    }
    
}
