package tutorial.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Newton
 */
public class DerbyConecta {

    public static void main(String args[]) {
        System.out.println("Testa conexão com o Java DB (Derby)...");
        
        Connection con = null;

        try 
        {
            con = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/derbystandalone","derby","123");
            //"jdbc:derby://localhost:1527/teste1;create=true;user=teste;password=123");
            //create=true - caso não exista será criado
            //se criado no código nao mostra na IDE-Netbeans
        } catch (SQLException e) {
            System.out.println("Erro ao conectar:");
            e.printStackTrace();
        }

        try 
        {
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        System.out.println("Fim teste.");
    }

}
