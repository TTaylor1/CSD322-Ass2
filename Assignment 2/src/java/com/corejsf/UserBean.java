/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import java.io.Serializable;
import java.util.Date;
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
    private String address;
    private Date date;
    
    
    public UserBean() {
    }


    public String getName() { return name; }
    public void setName(String newValue) { name = newValue; }

   public String getAddress() { return address; }
   public void setAddress(String newValue) { address = newValue; } 

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

 /**
     * @return the gender
     */
    
    
}
