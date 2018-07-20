package de.gfn.opc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 *
 * @author tlubowiecki
 */
public class TransactionTest {
    
    public static void main(String[] args) {
        
        Connection dbh = null;
        Statement stmt = null;
        Savepoint s1 = null;
        Savepoint s2 = null;
        Savepoint s3 = null;
                
    
        try {
            dbh = connect();
            dbh.setAutoCommit(false);
            
            stmt = dbh.createStatement();
            
            String sql = "UPDATE test_tbl SET "
                    + "firstname = 'Hans2', "
                    + "lastname='Meiser2' "
                    + "WHERE id = 1";
            
            int count = stmt.executeUpdate(sql);
            
            s1 = dbh.setSavepoint();
            
            sql = "UPDATE test_tbl SET "
                    + "firstname = 'Hans2', "
                    + "lastname='Meiser2' "
                    + "WHERE id = 2";
            
            count = stmt.executeUpdate(sql);
            
            s2 = dbh.setSavepoint();
            
            sql = "UPDATE test_tbl SET "
                    + "fname = 'Hans2', "
                    + "lname='Meiser2' "
                    + "WHERE id = 3";
            
            count = stmt.executeUpdate(sql);
            
            s3 = dbh.setSavepoint();
            
            dbh.commit();
        }
        catch(SQLException e1) {
            try {
                dbh.rollback(s2);
                dbh.commit();
            } 
            catch(SQLException e2) {
                
            }
            System.out.println(e1);
        }
    }
    
    public static final Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:8889/ocp_db_start", "root", "root");
    }
    
    
}
