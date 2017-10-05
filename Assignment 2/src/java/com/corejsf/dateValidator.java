/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.inject.Named;
//import javax.enterprise.context.Dependent;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author 14034305
 */
@FacesValidator("com.corejsf.dateValidator")
@SessionScoped
public class dateValidator implements Validator {

    /**
     * Creates a new instance of dateValidator
     */
    public dateValidator() {
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String date = value.toString();
        
        String year;
        
        int year1;
        
        year = date.substring(date.lastIndexOf("-") + 1);
        year1 = Integer.parseInt(year);
        if(year1 < 1942 ){
            FacesMessage msg = new FacesMessage("You are too old to register!");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
        
        if(year1 > 2017){
        }
    }
    
}
