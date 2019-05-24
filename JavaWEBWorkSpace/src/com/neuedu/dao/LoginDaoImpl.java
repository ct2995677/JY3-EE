package com.neuedu.dao;

import com.neuedu.entry.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginDaoImpl implements LoginDao{
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private  static final  String URL = "jdbc:mysql://localhost:3306/lilchettest";
    private  static final  String USERNAME = "root";
    private  static final  String PASSWORD = "38514205";
    @Override
    public List<User> login() {
        List<User> users = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            String sql = "SELECT username,password FROM user";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {

                String username = rs.getString("username");

                String password = rs.getString("password");
                User user = new User(username,password);
                users.add(user);
            }
            return users;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
