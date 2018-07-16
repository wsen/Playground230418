package de.gfn.opc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author tlubowiecki
 */
public class ConnectionTest {
    
    static final String DB_DSN = "jdbc:mysql://localhost";
    static final int DB_PORT = 8889;
    static final String DB_NAME = "ocp_db_start";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "root";
    
    public static void main(String[] args) {
        
        try(Connection dbh = connect(); Statement stmt = dbh.createStatement()) {
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM test_tbl");
            while (rs.next()) {
                System.out.printf("#%d: %s %s%n", rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"));
            }
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        
        
    }
    
    private static final Connection connect() throws SQLException {
        // Ab JDBC4 nicht mehr nötig
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } 
//        catch (ClassNotFoundException e) {
//            System.out.println(e);
//        }
        

//        Properties prop = new Properties();
//        prop.put("user", "root");
//        prop.put("password", "root");
//        return DriverManager.getConnection(DB_DSN + ":" + DB_PORT + "/" + DB_NAME, prop);

        return DriverManager.getConnection(DB_DSN + ":" + DB_PORT + "/" + DB_NAME, DB_USER, DB_PASSWORD);
    }
}
