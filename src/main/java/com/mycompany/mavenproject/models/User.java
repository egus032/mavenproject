/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author eguseynov
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    
    private final Log log = LogFactory.getLog(User.class);
    
    private Integer id;
    
    private String email;
    
    private String lastName;
    
    private String firstName;
    
    private String age;

    public User() {
    }
    
    public User(Integer id, String email, String lastName, String firstName, String age) {
        this.id = id;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Integer getId() {
        return id;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }
    
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }
    
    @Column(name = "age")
    public String getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "User {" 
                + "id=" + id 
                + ", email=" + email
                + ", lastName=" + lastName
                + ", firsName=" + firstName
                + ", age=" + age
                + "}";
    }
    
    
    
    
}
