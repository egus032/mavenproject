/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.dao;

import com.mycompany.mavenproject.models.User;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author eguseynov
 */
public interface UserDaoInterface {
    
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(User user);
    public User findUserById(Integer id);
    public List<User> findAllUsers();
    
}
