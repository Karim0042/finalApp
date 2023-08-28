package az.iktlab.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;

public class JDBCConnection {
    private static JDBCConnection instance;
    private Connection connection;

    private JDBCConnection() {
        try {
            String url = "jdbc:postgresql://localhost/finalApp";
            String user = "postgres";
            String pass = "root";
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, pass);

        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }
    }

    public static JDBCConnection getInstance() {
        try {
            if (instance == null || instance.getConnection().isClosed()) {
                instance = new JDBCConnection();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
