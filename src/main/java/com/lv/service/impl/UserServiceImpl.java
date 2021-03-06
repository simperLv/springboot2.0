package com.lv.service.impl;

import com.lv.dao.UserDao;
import com.lv.model.User;
import com.lv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by simperLv
 * on 2018/08/13 16:46
 *
 * @Description //TODO
 */
@ComponentScan({"com.lv.dao.UserDao"})
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> findUser(User user) {
        return userDao.findUser(user);
    }

    @Override
    public User findOne(User user) {
        return userDao.findOne(user);
    }
}
