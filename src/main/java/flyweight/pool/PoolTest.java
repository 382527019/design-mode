package flyweight.pool;

import java.sql.Connection;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/7
 * Time:21:32
 */
public class PoolTest {

    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection = connectionPool.getConnection();
        connectionPool.release(connection);
        Connection connection1 = connectionPool.getConnection();
        System.out.println(connection1==connection);
    }

}
