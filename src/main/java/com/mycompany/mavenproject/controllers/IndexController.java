
package com.mycompany.mavenproject.controllers;

import com.mycompany.mavenproject.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author eguseynov
 */
@Controller
@RequestMapping("/")
public class IndexController {
    
    private final Log log = LogFactory.getLog(IndexController.class);
    
    /*
    этот метод обрабатывает запросы с адреса http://localhost:8081/mavenproject/
    */
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }

    /*
    этот метод обрабатывает запросы с адреса http://localhost:8081/mavenproject/helloagain
    при этом возвращает страницу welcome, а меняется только значение объекта
    "greeting" на указанное в методе.
    */
    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Again hello world, from Spring 4 MVC");
        return "welcome";
    }
    
    @RequestMapping(value = "/new_user", method = RequestMethod.GET)
    public String addNewUser(ModelMap model){
        model.addAttribute(model);
        return "welcome";
    }
    

    
}
