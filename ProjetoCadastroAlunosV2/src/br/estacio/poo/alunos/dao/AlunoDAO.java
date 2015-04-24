package br.estacio.poo.alunos.dao;

import br.estacio.poo.alunos.entidade.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francisco.newton
 */
public class AlunoDAO extends GenericoDAO
{
    
    public AlunoDAO()
    {
        
    }
    
    public void createTable()
    {
        String sql = "CREATE TABLE alunos ( " +
            "matricula VARCHAR(10) " +
            "CONSTRAINT PK_ALUNOS PRIMARY KEY, " +
            "nome CHAR(40), " +
            "sexo CHAR(1), " +
            "idade INTEGER, " +
            "curso VARCHAR(40), " +
            "turno CHAR(1), " +
            "ingles CHAR(1), " +
            "java CHAR(1), " +
            "php CHAR(1), " +
            "lingc CHAR(1), " +
            "dotnet CHAR(1), " +
            "sql CHAR(1) " +
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
        Aluno aluno = (Aluno) o;
        String sql = "INSERT INTO TESTE (nome) VALUES (?)" ;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, aluno.getNome());
            pstmt.execute();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }

    public Aluno consultar(int codigo)
    {
        String sql = "SELECT * FROM TESTE WHERE ID = ?";
        Aluno aluno = null;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setInt(1, codigo);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return aluno;
    }

    public List<Aluno> getLista() 
    {
        String sql = "SELECT * FROM TESTE";
        List<Aluno> listaAlunos = new ArrayList();
        Aluno aluno;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                listaAlunos.add(aluno);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return listaAlunos;
    }

    public List<Aluno> getListaNome(String nome)
    {
        String sql = "SELECT * FROM TESTE WHERE NOME LIKE ?";
        List<Aluno> listaAlunos = new ArrayList();
        Aluno aluno;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, "%"+nome+"%");
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                listaAlunos.add(aluno);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return listaAlunos;
    }

    public boolean alterar(Object o)
    {
        Aluno aluno = (Aluno) o;
        String sql = "UPDATE TESTE SET nome=? WHERE id=?";
        boolean resultado;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, aluno.getNome());
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
