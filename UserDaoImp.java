package com.neuedu.dao;

import com.neuedu.dataSource.DruidDataSoure;
import com.neuedu.pojo.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImp implements UserDao{
    private QueryRunner qr = null;
    private DruidDataSoure dds = DruidDataSoure.getDataSource();

    public UserDaoImp(){
        qr = new QueryRunner();
    }


    public List<User>getAllUser(){
        String sql = "SELECT * FROM user";
        List<User> users = null;
        Connection connection = dds.getConnection();
        try {
            users = qr.query(connection,sql,new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

}
