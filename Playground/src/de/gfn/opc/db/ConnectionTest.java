package de.gfn.opc.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        
        //updatePerson(new Person(12, "", ""));
        
        System.out.println("------------");
        
        for(Person p : findAll()) {
            System.out.println(p);
        }
        
//        System.out.println("------------");
//        
//        System.out.println("Es wurden ein Datensatz mit der ID " + create() + " hinzugefügt");
    }
    
    
    private static final List<Person> findAll() {
        
        try(Connection dbh = connect(); Statement stmt = dbh.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM test_tbl");
            
//            DatabaseMetaData meta = dbh.getMetaData();
//            System.out.println(meta.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY));
//            System.out.println(meta.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
//            System.out.println(meta.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
//            
            ResultSetMetaData rmeta = rs.getMetaData();
            System.out.println(rmeta.getColumnCount());
            System.out.println(rmeta.getColumnName(1));
            System.out.println(rmeta.getColumnTypeName(1));
            
//            try {
//                System.out.println("Warten...");
//                Thread.sleep(20000);
//            } 
//            catch (InterruptedException e) {
//                System.out.println(e);
//            }
            
            return createPersonList(rs);
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    private static final int updatePerson(Person p) {
        
        try(Connection dbh = connect(); Statement stmt = dbh.createStatement()) {
            
            stmt.execute("UPDATE test_tbl SET firstname = 'Hans', lastname = 'Wurst' WHERE id = " + p.getId());
            return stmt.getUpdateCount();
                    
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        return -1;
    }
    
    private static final int create() {
        
        try(Connection dbh = connect(); Statement stmt = dbh.createStatement()) {
            // ALTER TABLE `test_tbl` CHANGE `id` `id` INT(11) NOT NULL AUTO_INCREMENT;
            String sql = "INSERT INTO test_tbl (firstname, lastname) VALUES('Peter', 'Lustig')";
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()) {
                return rs.getInt(1);
            }
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        
        return -1;
    }
    
    public static final Connection connect() throws SQLException {
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
    
    private static final List<Person> createPersonList(ResultSet results) throws SQLException {
        
        List<Person> list = new ArrayList<>();
        
//        results.first();
//        results.beforeFirst();
//        
//        results.next();
//        results.previous();
//        
//        results.last();
//        results.afterLast();
//        
//        results.relative(2);
//        results.absolute(2);
        
        results.afterLast();

        while (results.previous()) {
            results.updateString("firstname", results.getString("firstname") + "...");
            results.updateRow();
            list.add(new Person(results.getInt("id"), results.getString("firstname"), results.getString("lastname")));
        }
        
        return list;
    }
}
