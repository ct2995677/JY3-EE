package com.neuedu.apache;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/20190517","root","123456");
            QueryRunner queryRunner = new QueryRunner();
            //增加
//            String sql = "INSERT INTO user(username,password) VALUES(?,?)";
//            int i = queryRunner.update(connection, sql, "张三", "5201314");
            //修改
//            String sql = "UPDATE user SET password = ? WHERE id = ?";
//            int i = queryRunner.update(connection, sql, "7754521", "11");
            //删除
//            String sql = "DELETE FROM user WHERE id = ?";
//            int i = queryRunner.update(connection, sql, 11);
            //查找全部
//            String sql = "SELECT * FROM user";
//            List<User> list = queryRunner.query(connection, sql, new BeanListHandler<>(User.class));
            //按条件查找
//            String sql = "SELECT * FROM user WHERE id = ?";
//            User user = queryRunner.query(connection, sql, new BeanHandler<>(User.class), "5");
            //统计用户数量
            String sql = "SELECT count(*) FROM user";
            long result = queryRunner.query(connection, sql, new ScalarHandler<>());
            System.out.println(result);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
