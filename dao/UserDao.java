package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface UserDao {
    //查询
    List<User> getAllUser();
    //修改
    void alterUser(User user);
    //删除
    void deleteUser(int userId);
    //添加
    void insertUser(User user);
}
