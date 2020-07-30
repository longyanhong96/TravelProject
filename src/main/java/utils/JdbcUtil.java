package utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Description : XXX
 *
 * @author lyh
 * @date 2020-07-31
 */
public class JdbcUtil {

    private static Properties props;
    private static DataSource source;

    static {
        props = PropertyRead.getProperties("connect-mysql.properties");
        try {
            source = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection =  source.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static DataSource getDatasource(){
        return source;
    }
}
