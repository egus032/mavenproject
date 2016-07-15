
package com.mycompany.mavenproject.controllers;


import com.mycompany.mavenproject.dao.UserDaoInterface;
import com.mycompany.mavenproject.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author eguseynov
 */
@Controller
@RequestMapping()
public class IndexController {
    
    private final Log log = LogFactory.getLog(IndexController.class);
    
    @Autowired
    private UserDaoInterface userDaoInterface;
    /*
    этот метод обрабатывает запросы с адреса http://localhost:8081/mavenproject/
    
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
    */

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
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(){
        return "index";
    }
    
    /*
    этот метод принимает на вход данные из angularjs и выводит их в консоль
    как user.toString, но не возвращает новую страницу на стороне клиента
    */
    @RequestMapping(method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public String indexPagePost(@RequestBody User user){
        log.info(user.toString());
        log.info(user.getEmail());
        userDaoInterface.createUser(user);
        return "result";
    }
    
    

    
}
