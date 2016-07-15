/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.controllers;

import com.mycompany.mavenproject.dao.UserDaoInterface;
import com.mycompany.mavenproject.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author eguseynov
 */
@Controller
@RequestMapping
public class RegAndAuthController {
    
    private final Log log = LogFactory.getLog(RegAndAuthController.class);
    
    @Autowired
    private UserDaoInterface userDaoInterface;
    
    @RequestMapping(value="/reg_user", method = RequestMethod.GET)
    public String addNewUserGET(){
        return "reg_user";
    }
    
    @RequestMapping(value="/auth_user", method = RequestMethod.GET)
    public String indentifyUserGET(){
        return "auth_user";
    }
    
    @RequestMapping(value = "/reg_user",
            method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public String addNewUser(@RequestBody User user){
        return "reg_user";
    }
    
}
