package de.gfn.opc.db;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author tlubowiecki
 */
public class RowSetTest {
    
    public static void main(String[] args) {
    
        try {
            JdbcRowSet rs = new JdbcRowSetImpl();
            rs.setUsername("root");
            rs.setPassword("root");
            rs.setUrl("jdbc:mysql://localhost:8889/ocp_db_start");
            rs.setCommand("SELECT * FROM test_tbl");
            rs.execute();
            
            while (rs.next()) {
                System.out.printf("%s %s%n", rs.getString("firstname"), rs.getString("lastname"));
                
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        try(Connection dbh = ConnectionTest.connect(); Statement stmt = dbh.createStatement()) {
         
            ResultSet rs = stmt.executeQuery("SELECT * FROM test_tbl");
            JdbcRowSet rowset = new JdbcRowSetImpl(rs);
            
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
        
        try(Connection dbh = ConnectionTest.connect()) {
         
            JdbcRowSet rowset = new JdbcRowSetImpl(dbh);
            rowset.setCommand("SELECT * FROM test_tbl");
            rowset.execute();
            
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
        
        try {
            RowSetFactory factory = RowSetProvider.newFactory();
            RowSet rowset = factory.createJdbcRowSet();
            rowset.setUsername("root");
            rowset.setPassword("root");
            rowset.setUrl("jdbc:mysql://localhost:8889/ocp_db_start");
            rowset.setCommand("SELECT * FROM test_tbl");
            rowset.execute();
        } 
        catch (Exception e) {
        }
    }
        
}
