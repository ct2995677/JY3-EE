package com.neuedu.dao;

import com.neuedu.dataSource.DruidDataSou;
import com.neuedu.pojo.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private QueryRunner qr = null;
    private DruidDataSou dds = DruidDataSou.getDataSource();
    public UserDaoImpl(){
        qr = new QueryRunner();
    }
    @Override
    public List<User> getAllUser() {
        List<User> users = null;
        Connection connection = dds.getConnection();
        String sql = "SELECT * FROM user";
        try {
            users = qr.query(connection, sql, new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

    @Override
    public void alterUser(User user) {
        String sql = "UPDATE user SET username = ?,password = ? WHERE id = ?";
        Connection connection = dds.getConnection();
        try {
            qr.update(connection, sql,user.getUsername(),user.getPassword(),user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteUser(int userId) {
        String sql = "DELETE FROM user WHERE id = ?";
        Connection connection = dds.getConnection();
        try {
            qr.update(connection,sql,userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO user(username,password) VALUES(?,?)";
        Connection connection = dds.getConnection();
        try {
            qr.update(connection,sql,user.getUsername(),user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
