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
public class SuccessSessionCheckBean {
    
    
    private String UId;
    private String UPass;

    public String getUId() {
        return UId;
    }

    public void setUId(String UId) {
        this.UId = UId;
    }

    public String getUPass() {
        return UPass;
    }

    public void setUPass(String UPass) {
        this.UPass = UPass;
    }

    /**
     * Creates a new instance of SuccessSessionCheckBean
     */
    public SuccessSessionCheckBean() {
        FacesContext fcscntxt=FacesContext.getCurrentInstance();
        HttpSession ssn1=(HttpSession)fcscntxt.getExternalContext().getSession(true);
        this.UId=(String)ssn1.getAttribute("id");
        this.UPass=(String)ssn1.getAttribute("pas");
    }
    
}
