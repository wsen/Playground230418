package de.gfn.opc.db;

import static de.gfn.opc.db.PreparedStatementTest.connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tlubowiecki
 */
public class CallableStatementTest {
    
    public static void main(String[] args) {
        
        try(Connection dbh = connect()) {
            
            String sql = "{call getAllData(?, ?) }";
            CallableStatement stmt = dbh.prepareCall(sql);
            stmt.setString(1, "Bruce");
            stmt.setString(2, "Wayne");
            stmt.execute();
            
            ResultSet rs = stmt.getResultSet();
            while(rs.next()) {
                System.out.println(rs.getString("firstname") + " " + rs.getString("lastname"));
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
