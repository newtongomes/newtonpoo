package br.exemplo.hibernate.view.tabela;

import br.exemplo.hibernate.entidade.Produto;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael 01/11/2013
 * 
 * Classe que representa a tabela de produtos.
 */
public class TabelaProduto extends AbstractTableModel {

    private List<Produto> produtos;
    private List<String> colunas;
    
    public TabelaProduto(List<Produto> produtos){
        this.produtos = produtos;
        this.colunas = Arrays.asList("Nome","Descrição","Preço");
    }
    
    @Override
    public String getColumnName(int column){
        return this.colunas.get(column);
    }
    
    @Override
    public int getRowCount() {
        return this.produtos.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.size();
    }

    /**
     *
     * @author Rafael 01/11/2013
     * 
     * Método que popula a tabela de produtos.
     */ 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Produto produto = this.produtos.get(rowIndex);
         switch(columnIndex){
             case 0: return produto.getNome();
             case 1: return produto.getDescricao();
             case 2: return produto.getPreco();
         }
         return null;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
}
