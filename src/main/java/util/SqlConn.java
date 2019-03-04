package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConn {
    Connection conn;
    public static final String URLCONN= "jdbc:mariadb://localhost:3307/myfirstjavaconn?user=root";

    public SqlConn() throws SQLException {
        createNewConnection();
    }

    private void createNewConnection()throws SQLException{
        this.conn = DriverManager.getConnection(URLCONN);
    }

    public Connection getConn() {
        return this.conn;
    }
}
