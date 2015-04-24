package br.estacio.poo.alunos.dao;

import java.util.List;
/**
 *
 * @author Newton
 */
public interface IDAO 
{
   public void createTable();
    
    public void incluir(Object o);
    
    public Object consultar(int id);

    public List getLista();

    public List getListaNome(String nome);

    public boolean alterar(Object o);

    public boolean excluir(int id);
}
