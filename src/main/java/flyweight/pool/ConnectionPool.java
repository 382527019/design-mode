package flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 *
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.cj.jdbc.Driver";
    private int size=10;

    public ConnectionPool() {
        try {
            Class.forName(driverClassName);
            for (int i = 0; i < size; i++) {
                Connection connection = DriverManager.getConnection(url, username, password);
                pool.add(connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        synchronized (this) {
            if (pool.size() > 0) {
                Connection connection = pool.get(0);
                pool.remove(connection);
                return connection;
            }
            return null;
        }
    }

    public void release(Connection connection) {
        synchronized (this) {
            pool.add(connection);
        }
    }


}
