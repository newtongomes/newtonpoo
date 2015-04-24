package dao;

import bean.StudentBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoStudents {

    private Connection con;
    private PreparedStatement pstmtInsert;
    private PreparedStatement pstmtDelete;
    private PreparedStatement pstmtFind;
    private PreparedStatement pstmtRecords;
    private ResultSet rsRecords;
    private PreparedStatement pstmtUpdate;

    public DaoStudents() {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            String url = "jdbc:derby://localhost:1527/db";
            String user = "root";
            String pass = "root";


            con = DriverManager.getConnection(url, user, pass);

            pstmtInsert = con.prepareStatement("INSERT INTO students VALUES ( ?, ?, ? )");
            pstmtUpdate = con.prepareStatement("UPDATE students SET NAME = ?, " +
                    "LAST_NAME = ? WHERE COD = ?");
            pstmtDelete = con.prepareStatement("DELETE FROM students WHERE cod = ?");
            pstmtFind = con.prepareStatement("SELECT * FROM students WHERE cod = ?");
            pstmtRecords = con.prepareStatement("SELECT * FROM students");

            rsRecords = pstmtRecords.executeQuery();

        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public StudentBean first() {
        try {
            rsRecords.first();

            StudentBean student = new StudentBean();

            student.setCod( rsRecords.getInt("COD") );
            student.setName( rsRecords.getString("NAME") );
            student.setLastName(rsRecords.getString("LAST_NAME" ));

            return student;

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }


    public StudentBean previous() {


         try {
            if ( ! rsRecords.isFirst() ) {
              rsRecords.previous();
            }

            StudentBean student = new StudentBean();

            student.setCod( rsRecords.getInt("COD") );
            student.setName( rsRecords.getString("NAME") );
            student.setLastName(rsRecords.getString("LAST_NAME" ));

            return student;

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    public StudentBean next() {


         try {
            if ( ! rsRecords.isLast() ) {
              rsRecords.next();
            }

            StudentBean student = new StudentBean();

            student.setCod( rsRecords.getInt("COD") );
            student.setName( rsRecords.getString("NAME") );
            student.setLastName(rsRecords.getString("LAST_NAME" ));

            return student;

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public StudentBean last() {
        try {
            rsRecords.last();

            StudentBean student = new StudentBean();

            student.setCod( rsRecords.getInt("COD") );
            student.setName( rsRecords.getString("NAME") );
            student.setLastName(rsRecords.getString("LAST_NAME" ));

            return student;

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public boolean insert( StudentBean student ) {
        try {
            pstmtInsert.setInt(1, student.getCod() );
            pstmtInsert.setString(2, student.getName() );
            pstmtInsert.setString(3, student.getLastName() );

            pstmtInsert.executeUpdate();

            rsRecords = pstmtRecords.executeQuery();

            return true;
        } catch (SQLException e) {
            System.out.println( "Error: " + e.getMessage() );
            return false;
        }

    }

    public boolean update( StudentBean student ) {
        try {
            
            pstmtUpdate.setString(1, student.getName() );
            pstmtUpdate.setString(2, student.getLastName() );
            pstmtUpdate.setInt(3, student.getCod() );

            pstmtUpdate.executeUpdate();

            rsRecords = pstmtRecords.executeQuery();

            return true;
        } catch (SQLException e) {
            System.out.println( "Error: " + e.getMessage() );
            return false;
        }

    }

    public boolean delete( int cod ) {
        try {

            pstmtDelete.setInt(1, cod);

            pstmtDelete.executeUpdate();

            rsRecords = pstmtRecords.executeQuery();

            return true;
        } catch (SQLException e) {
            System.out.println( "Error: " + e.getMessage() );
            return false;
        }

    }

    public StudentBean find( int cod ) {
        try {

            pstmtFind.setInt( 1, cod );

            ResultSet rs = pstmtFind.executeQuery();

            if ( rs.next() ) {
                StudentBean student = new StudentBean();
                student.setCod( rs.getInt("COD"));
                student.setName(rs.getString("NAME"));
                student.setLastName( rs.getString( "LAST_NAME" ) );
                return student;
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println( "Error: " + e.getMessage() );
            return null;
        }

    }

    public ArrayList list() {
        try {
            ArrayList listReturn = new ArrayList();

            
            while (rsRecords.next()) {
                StudentBean student = new StudentBean();
                student.setCod(rsRecords.getInt("COD"));
                student.setName(rsRecords.getString("NAME"));
                student.setLastName(rsRecords.getString("LAST_NAME"));
                listReturn.add(student);
            }
            return listReturn;
        } catch (SQLException ex) {
            Logger.getLogger(DaoStudents.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }


    }



}
