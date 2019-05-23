package com.neuedu.dataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DruidDataSou {
    //初始化对象
    private static DruidDataSou ds = null;
    private static Properties prop = new Properties();
    //初始化构造器
    private DruidDataSou(){

    }
    //获得连接池对象
    public static DruidDataSou getDataSource(){
        if (null == ds){
            ds = new DruidDataSou();
        }
        return  ds;
    }

    //获得连接
    public Connection getConnection(){
        try {
            prop.load(DruidDataSou.class.getResourceAsStream("/mysql.properties"));
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
