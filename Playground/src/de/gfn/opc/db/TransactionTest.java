package de.gfn.opc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tlubowiecki
 */
public class TransactionTest {
    
    public static void main(String[] args) {
        
        Connection dbh = null;
    
        try {
            dbh = connect();
            dbh.setAutoCommit(false);
            
            
        }
        catch(SQLException e1) {
            try {
                dbh.rollback();
            } 
            catch(SQLException e2) {
                
            }
        }
    }
    
    public static final Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:8889/ocp_db_start", "root", "root");
    }
    
    
}
