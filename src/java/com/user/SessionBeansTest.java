/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ram
 */
@ManagedBean
@RequestScoped
public class SessionBeansTest {

    /**
     * Creates a new instance of SessionBeansTest
     */
    public SessionBeansTest() {
    }
    
    private String Id;
    private String PassWord;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    
    public String loginChake() {
        try{
        if(Id.equals("ajit") && PassWord.equals("ajit24")){
        FacesContext fcscntxt=FacesContext.getCurrentInstance();
        HttpSession ssn=(HttpSession)fcscntxt.getExternalContext().getSession(true);
        ssn.setAttribute("id",Id);
        ssn.setAttribute("pas", PassWord);
        }
        }catch(Exception es){}
         return "success";
    }
   
}
