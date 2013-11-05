package br.exemplo.hibernate.dao;

import br.exemplo.hibernate.entidade.Produto;
import br.exemplo.hibernate.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 * @author Rafael 01/11/2013
 * 
 * Classe responsável pela persistencia dos objetos no banco. 
 */
public class ProdutoDao {
    
    private Session session;
    
    /**
     * @author Rafael 01/11/2013
     * 
     * @param produto 
     * 
     * Método que adiciona um produto no banco de dados.
     */
    public void adiciona(Produto produto){
        //Abre a sessão
        session = HibernateUtil.getSession();
        Transaction tx = null;
        try{
            //Abre transação
            tx = session.beginTransaction();
            //Salva produto
            session.save(produto);
            //Sincroniza os dados do banco com a aplicação e fecha a transação
            tx.commit();
        }catch(HibernateException e){
            e.getStackTrace();
        }finally{
            //Fecha a sessão
            session.close();
        }
    }
    
    /**
     * @author Rafael 01/11/2013
     * 
     * @return List<Produto> - Lista de produtos
     * 
     * Método que retorna uma lista de produtos ordenada pelo nome.
     */
    public List<Produto> lista(){
        //Abre a sessão
        session = HibernateUtil.getSession();
        //Cria uma consulta no banco usando Criteria(API do Hibernate)*/
        Criteria c = session.createCriteria(Produto.class).addOrder(Order.asc("nome"));
        //Cria uma lista de produtos e atribui a consulta feita pela Criteria
        List<Produto> produtos = c.list();
        //Fecha a sessão
        session.close(); 
        return produtos;
    }
   
    /**
     * @author Rafael 01/11/2013
     * 
     * @param produto
     * 
     * Método que atualiza um produto armazenado no banco de dados.
     */
    public void atualiza(Produto produto){
        //Abre a sessão
        session = HibernateUtil.getSession();
        Transaction tx = null;
        try{
            //Abre uma transação
            tx = session.beginTransaction();
            //Atualiza produto
            session.update(produto); 
            //Sincroniza os dados do banco com a aplicação e fecha a transação
            tx.commit();
        }catch(HibernateException e){
            e.getStackTrace();
        }finally {
            //Fecha a sessão
            session.close(); 
        }
    }
    /**
     * @author Rafael 01/11/2013
     * 
     * @param produto
     * 
     * Método que remove um produto armazenado no banco de dados.
     */
    public void remove(Produto produto){
        //Abre a sessão
        session = HibernateUtil.getSession();
        Transaction tx = null;
        try{
            //Abre uma transação
            tx = session.beginTransaction();
            //Atualiza o cliente no bando de dados
            session.delete(produto); 
            //Sincroniza os dados do banco com a aplicação e fecha a transação
            tx.commit();
        }catch(HibernateException e){
            e.getStackTrace();
        }finally{
            //Fecha a sessão
            session.close(); 
        }
    }
   
    /**
     * @author Rafael 01/11/2013
     * 
     * @param String - Nome do produto 
     * 
     * @return List<Produto> - Lista de produtos
     * 
     * Método que retorna uma lista de produtos que contem o nome passado por parâmetro
     * e ordenada pelo nome.
     */
    public List<Produto> busca(String nome){
        //Abre a sessão
        session = HibernateUtil.getSession();
        //Cria uma consulta no banco usando Criteria(API do Hibernate)
        Criteria c = session.createCriteria(Produto.class)
            .add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE))
            .addOrder(Order.asc("nome"));
        //Cria uma lista de produtos e atribui a consulta feita pela Criteria
        List<Produto> produtos = c.list();
        //Fecha a sessão
        session.close();
        return produtos;  
    }
    
    public Produto buscaId(Long id){
        //Abre a sessão
        session = HibernateUtil.getSession();
        //Cria uma consulta no banco usando Criteria(API do Hibernate)
        Criteria c = session.createCriteria(Produto.class)
            .add(Restrictions.eq("id", id));
        //Cria um produto e atribui a consulta feita pela Criteria
        Produto produto = (Produto) c.uniqueResult();
        //Fecha a sessão
        session.close();
        return produto;  
    }
    
}
