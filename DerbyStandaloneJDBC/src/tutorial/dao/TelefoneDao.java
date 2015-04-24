package tutorial.dao; 
 
import tutorial.dao.GenericDao;
import tutorial.entidade.Telefone; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
 
/**
 *
 * @author Newton
 */
public class TelefoneDao extends GenericDao { 
    public void save(Telefone telefone) { 
        String sql = "insert into TELEFONES(numero, tipo, pessoa) values (?,?,?)";
        save(sql, telefone.getNumero(),                        
      telefone.getTipo(),telefone.getIdPessoa()); 
    } 
 
    public void update(Telefone telefone) { 
    String sql = "UPDATE TELEFONES " 
        + "SET numero = ?, tipo = ?, pessoa = ? " 
        + "where id_fone = ?"; 
        update(sql, telefone.getNumero(), telefone.getTipo(),  
      telefone.getIdPessoa(), telefone.getId()); 
    }     
 
    public void delete(Telefone telefone) { 
        String sql = "DELETE FROM TELEFONES WHERE id_fone = ? "; 
        delete(sql, telefone.getId()); 
    }       
 
    public List<Telefone> findTelefones() { 
        List<Telefone> telefones = new ArrayList<Telefone>(); 
        String sql = "SELECT * FROM TELEFONES"; 
        try { 
            PreparedStatement stmt = getConnection().prepareStatement(sql); 
            ResultSet rs = stmt.executeQuery(); 
 
            while (rs.next()) { 
                Telefone fone = new Telefone(); 
                fone.setId(rs.getInt("id_fone")); 
                fone.setNumero(rs.getString("numero")); 
                fone.setTipo(rs.getString("tipo")); 
                fone.setIdPessoa(rs.getInt("pessoa")); 
                telefones.add(fone); 
            } 
            rs.close(); 
            stmt.close(); 
            return telefones; 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
        return null; 
    } 
 
    public List<Telefone> findByNomePessoa(String nome) { 
        List<Telefone> telefones = new ArrayList<Telefone>(); 
        String sql = "SELECT * FROM TELEFONES T, PESSOAS P " + 
                "WHERE T.pessoa = P.id_pessoa AND " + 
                "P.nome like ?"; 
        try { 
            PreparedStatement stmt = getConnection().prepareStatement(sql); 
            stmt.setString(1, nome); 
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) { 
                Telefone fone = new Telefone(); 
                fone.setId(rs.getInt("id_fone")); 
                fone.setNumero(rs.getString("numero")); 
                fone.setTipo(rs.getString("tipo")); 
                fone.setIdPessoa(rs.getInt("pessoa")); 
                telefones.add(fone); 
            } 
            rs.close(); 
            stmt.close(); 
            return telefones; 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
        return null; 
    } 
}
