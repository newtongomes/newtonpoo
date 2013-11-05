package br.exemplo.hibernate.controller;

import br.exemplo.hibernate.dao.ProdutoDao;
import br.exemplo.hibernate.entidade.Produto;
import br.exemplo.hibernate.view.CadastroProduto;
import br.exemplo.hibernate.view.ConsultaProduto;
import br.exemplo.hibernate.view.tabela.TabelaProduto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael 01/11/2013
 * 
 * Classe responsável pela comunicação do DAO com a VIEW do produto.
 */
public class ProdutoController {
    
    private CadastroProduto cadastro;
    private ConsultaProduto consulta;
    private ProdutoDao dao;
    private TabelaProduto tabela;
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Construtor para a tela de cadastro de produtos.
     */
    public ProdutoController(CadastroProduto cadastro){
        this.cadastro = cadastro;
        this.dao = new ProdutoDao();
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Construtor para a tela de consulta de produtos.
     */
    public ProdutoController(ConsultaProduto consulta){
        this.consulta = consulta;
        this.dao = new ProdutoDao();
        carregarTabela(this.dao.lista());
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Método que cria e preenche o produto com os valores do frame e salva no banco de dados.
     */
    public void salvar(){
        Produto produto = new Produto();
        try{
            produto.setNome(this.cadastro.getTxtNome().getText().trim());
            produto.setPreco(Double.parseDouble(this.cadastro.getTxtPreco().getText().trim()));
            produto.setDescricao(this.cadastro.getTxtDescricao().getText().trim());
            this.dao.adiciona(produto);
            limparCamposCadastro();
            JOptionPane.showMessageDialog(this.cadastro, "Cadastrado com sucesso !");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Preço: Valor inválido ! Ex: 100.00");
        }
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Método que busca pelo id e preenche o produto com os valores do frame e atualiza no banco de dados.
     */
    public void alterar(){
        if(!this.consulta.getLblId().getText().equals("")){
            Produto produto = this.dao.buscaId(Long.parseLong(this.consulta.getLblId().getText()));
            try{
                produto.setNome(this.consulta.getTxtNome().getText().trim());
                produto.setDescricao(this.consulta.getTxtDescricao().getText().trim());
                produto.setPreco(Double.parseDouble(this.consulta.getTxtPreco().getText().trim()));
                this.dao.atualiza(produto);
                limparCamposConsulta();
                carregarTabela(this.dao.lista());
                JOptionPane.showMessageDialog(this.cadastro, "Alterado com sucesso !");
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Preço: Valor inválido ! Ex: 100.00");
            }
        }else{
            JOptionPane.showMessageDialog(consulta, "Selecione um produto antes de alterar.");
        }
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     *  @param List<Produtos> - Lista de produtos a serem inseridos na tabela.
     * 
     * Método que popula a tabela de produtos.
     */
    private void carregarTabela(List<Produto> produtos){
        this.tabela = new TabelaProduto(produtos);
        this.consulta.getTbProduto().setModel(this.tabela);
    }
    
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Método que preenche os campos do frame.
     */
    public void preencherCampos(){
        Produto produto = this.tabela.getProdutos().get(this.consulta.getTbProduto().getSelectedRow());
        this.consulta.getLblId().setText(String.valueOf(produto.getId()));
        this.consulta.getTxtNome().setText(produto.getNome());
        this.consulta.getTxtDescricao().setText(produto.getDescricao());
        this.consulta.getTxtPreco().setText(String.valueOf(produto.getPreco()));
        this.consulta.getTbProduto().getSelectionModel().clearSelection();
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Método que pesquisa o produto pelo nome.
     */
    public void pesquisar(){
        String nome = this.consulta.getTxtPesquisar().getText().trim();
        List<Produto> produtos = this.dao.busca(nome);
        if(!produtos.isEmpty())
            carregarTabela(produtos);
        else
            JOptionPane.showMessageDialog(consulta, "Não há registro com o nome: " + nome);
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Método que busca pelo id e exclui um produto selecionado.
     */
    public void excluir(){
        if(!this.consulta.getLblId().getText().equals("")){
            Produto produto = this.dao.buscaId(Long.parseLong(this.consulta.getLblId().getText()));
            this.dao.remove(produto);
            limparCamposConsulta();
            carregarTabela(this.dao.lista());
            JOptionPane.showMessageDialog(consulta, "Excluído com sucesso!");
        }else{
            JOptionPane.showMessageDialog(consulta, "Selecione um produto antes de excluir.");
        }
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Método que limpa os campos do formulario de cadastro.
     */
    public void limparCamposCadastro(){
        this.cadastro.getTxtNome().setText("");
        this.cadastro.getTxtDescricao().setText("");
        this.cadastro.getTxtPreco().setText("");
    }
    
    /**
     *  @author Rafael 01/11/2013
     * 
     * Método que limpa os campos do formulario de consulta.
     */
    public void limparCamposConsulta(){
        this.consulta.getLblId().setText("");
        this.consulta.getTxtNome().setText("");
        this.consulta.getTxtDescricao().setText("");
        this.consulta.getTxtPreco().setText("");
    }
    
}
