/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
//import javax.inject.Named;
//import javax.enterprise.context.Dependent;
//import javax.enterprise.context.SessionScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 14034305
 */
@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {
    private String name;
    private String password;
    private String gender;
   
    public UserBean() {
    }


    public String getName() { return name; }
    public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; } 

 /**
     * @return the gender
     */
    public String getGender() {                
        return gender;
    }

   
    public void setGender(String newValue) {
        if (gender.equals("male")){
            newValue = "Mr.";
        }
        else if(gender.equals("female")) {
            newValue = "Mrs.";
        }
        this.gender = newValue;
    }
    
}
