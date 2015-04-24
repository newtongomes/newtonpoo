package tutorial.persistencia; 
 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
 
/**
 *
 * @author Newton
 */
public class ConnectionDataBase { 
 
    private static final String URL = 
    "jdbc:derby://localhost:1527/derbystandalone;create=true;user=derby;password=123"; 
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver"; 
 
    public static Connection getConnection() { 
        System.out.println("Conectando ao Banco de Dados"); 
        try { 
            //Class.forName(DRIVER); - Opcional nas versões novas do Java
            return DriverManager.getConnection(URL); 
        //} catch (ClassNotFoundException e) { 
        //    e.printStackTrace(); 
        } catch (SQLException e) { 
            throw new RuntimeException(e); 
        } 
        //return null; 
    } 
}

