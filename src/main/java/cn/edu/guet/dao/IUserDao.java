package cn.edu.guet.dao;

import cn.edu.guet.bean.User;

import java.util.List;

/**
 * 只规定能做什么，具体如何去做，不清楚
 */
public interface IUserDao {
    List<User> viewUser();
    void deleteUser(int id);
    void updataUser(User user);
    void addUser(User user);
    List<User> selectUser(String select);
}
