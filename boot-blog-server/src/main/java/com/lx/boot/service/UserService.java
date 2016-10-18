package com.lx.boot.service;

import com.lx.boot.dao.UserDao;
import com.lx.boot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shiny
 * @since 2016/10/17 18:10
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean addUser(String username,String password){

        return userDao.insertUser(username, password)>0;

    }

    @Transactional
    public void testTransaction(String username, String password){
        System.out.println(userDao.insertUser(username, password));
        int i=1/0;
        System.out.println(i);
    }
}
