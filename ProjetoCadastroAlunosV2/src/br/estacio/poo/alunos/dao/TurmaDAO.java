package br.estacio.poo.alunos.dao;

import br.estacio.poo.alunos.entidade.Turma;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francisco.newton
 */
public class TurmaDAO extends GenericoDAO
{
    
    public TurmaDAO()
    {
        
    }
    
    public void createTable()
    {
        String sql = "CREATE TABLE turmas ( " +
            "codigo INTEGER not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) " +
            "CONSTRAINT PK_USUARIOS PRIMARY KEY, " +
            "disciplina VARCHAR(40), " +
            "professor VARCHAR(40), " +
            "curso VARCHAR(40), " +
            "turno CHAR(1) " +
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
        Turma turma = (Turma) o;
        String sql = "INSERT INTO TESTE (nome) VALUES (?)" ;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, turma.getDisciplina());
            pstmt.execute();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }

    public Turma consultar(int codigo)
    {
        String sql = "SELECT * FROM TESTE WHERE ID = ?";
        Turma turma = null;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setInt(1, codigo);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                turma = new Turma();
                turma.setCodigo(rs.getInt("id"));
                turma.setDisciplina(rs.getString("nome"));
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return turma;
    }

    public List<Turma> getLista() 
    {
        String sql = "SELECT * FROM TESTE";
        List<Turma> listaUsuarios = new ArrayList();
        Turma turma;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                turma = new Turma();
                turma.setCodigo(rs.getInt("id"));
                turma.setDisciplina(rs.getString("nome"));
                listaUsuarios.add(turma);
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

    public List<Turma> getListaNome(String nome)
    {
        String sql = "SELECT * FROM TESTE WHERE NOME LIKE ?";
        List<Turma> listaUsuarios = new ArrayList();
        Turma turma;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, "%"+nome+"%");
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                turma = new Turma();
                turma.setCodigo(rs.getInt("id"));
                turma.setDisciplina(rs.getString("nome"));
                listaUsuarios.add(turma);
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
        Turma turma = (Turma) o;
        String sql = "UPDATE TESTE SET nome=? WHERE id=?";
        boolean resultado;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, turma.getDisciplina());
            pstmt.setInt(2, turma.getCodigo());
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
