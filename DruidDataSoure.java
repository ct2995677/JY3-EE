package com.neuedu.dataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * 配置连接池
 */
public class DruidDataSoure {

    private static Properties prop = new Properties();

    private static DruidDataSoure ds = null;
    private DruidDataSoure()
    {

    }
        public static DruidDataSoure getDataSource()
        {
            if (null == ds)
            {
                ds = new DruidDataSoure();
            }
            return ds;
        }
        public Connection getConnection()
        {
            try {
                prop.load(DruidDataSource.class.getResourceAsStream("/mysql.properties"));
                DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
                Connection connection = dataSource.getConnection();
                return connection;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;

        }
}

