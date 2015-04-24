package br.estacio.poo.alunos.dao;

import br.estacio.poo.alunos.entidade.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francisco.newton
 */
public class UsuarioDAO extends GenericoDAO
{
    
    public UsuarioDAO()
    {
        
    }
    
    public void createTable()
    {
        String sql = "CREATE TABLE usuarios ( " +
            "codigo INTEGER not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) " +
            "CONSTRAINT PK_USUARIOS PRIMARY KEY, " +
            "nome VARCHAR(40), " +
            "cpf VARCHAR(14), " +
            "telefone VARCHAR(15), " +
            "login VARCHAR(30), " +
            "senha VARCHAR(20) " +
            ")";
        try 
        {
            this.pstmt = this.getConnection().prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
            System.out.println( "Criada tabela no banco de dados!" );
        }
        catch (SQLException e) 
        {
                e.printStackTrace();
        }
    }
    
    public void incluir(Object o)
    {
        Usuario usuario = (Usuario) o;
        String sql = "INSERT INTO TESTE (nome) VALUES (?)" ;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.execute();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }

    public Usuario consultar(int codigo)
    {
        String sql = "SELECT * FROM TESTE WHERE ID = ?";
        Usuario usuario = null;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setInt(1, codigo);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    public List<Usuario> getLista() 
    {
        String sql = "SELECT * FROM TESTE";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                listaUsuarios.add(usuario);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return listaUsuarios;
    }

    public List<Usuario> getListaNome(String nome)
    {
        String sql = "SELECT * FROM TESTE WHERE NOME LIKE ?";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, "%"+nome+"%");
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                listaUsuarios.add(usuario);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return listaUsuarios;
    }

    public boolean alterar(Object o)
    {
        Usuario usuario = (Usuario) o;
        String sql = "UPDATE TESTE SET nome=? WHERE id=?";
        boolean resultado;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setInt(2, usuario.getCodigo());
            resultado = (pstmt.executeUpdate() > 0);
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public boolean excluir(int codigo)
    {
        String sql = "DELETE FROM TESTE WHERE id=?";
        boolean resultado;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setInt(1, codigo);
            resultado = (pstmt.executeUpdate() > 0);
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return resultado;
    }
    
}
