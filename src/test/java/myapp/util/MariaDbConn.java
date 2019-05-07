package myapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConn {

    protected static Connection conn;

    public MariaDbConn() {
        if (conn == null) createNewDBConnection();
    }

    public void createNewDBConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword");
        } catch (SQLException exc) {
            System.out.println("There was a problem establishing connection with DB");
        }
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException exc) {
            System.out.println("There was a problem closing connection with DB");
        }
        conn=null;
    }

    public Connection getConn(){
        return conn;
    }
}
