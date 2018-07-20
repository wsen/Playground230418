package de.gfn.opc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class PreparedStatementTest {
    
    public static void main(String[] args) {
        
        String sql = "INSERT INTO test_tbl (firstname, lastname) VALUES(?, ?)";
        
        Scanner scanner = new Scanner(System.in);
        
        try(Connection dbh = connect(); PreparedStatement stmt = dbh.prepareStatement(sql)) {
            
            while(true) {
                System.out.print("\nVorname: ");
                stmt.setString(1, scanner.next());
                System.out.print("\nVorname: ");
                stmt.setString(2, scanner.next());
                stmt.executeUpdate();
                System.out.println("gespeichert");
            }
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    public static final Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:8889/ocp_db_start", "root", "root");
    }
    
}
