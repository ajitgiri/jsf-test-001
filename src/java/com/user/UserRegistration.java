/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user;

import com.user.services.UserActions;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ram
 */
@ManagedBean
@RequestScoped
public class UserRegistration {

    /**
     * Creates a new instance of UserRegistration
     */
    public UserRegistration() {
    }
    private String userName;
    private String userPass;
    private String mailId;
    private String userAdds;

    public String getUserAdds() {
        return userAdds;
    }

    public void setUserAdds(String userAdds) {
        this.userAdds = userAdds;
         
    }
    
    public String insertuserDetails()throws IOException{
        UserActions uAction=new UserActions();
        String strng=uAction.insertUserDetails(userName,userPass,userAdds,mailId);
        return strng;
    //return "sucess";
    }
//    public List retriveUserDetails(){
//    Connection con;
//        Statement st;
//        ResultSet rs = null;
//        //  System.out.println("love ");
//        try {
//            List<UserRegistration> user = new ArrayList<UserRegistration>();
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            con = DriverManager.getConnection("jdbc:odbc:jsfdsn");
//            st = con.createStatement();
//            rs = st.executeQuery("select * from User_Details");
//            while (rs.next()) {
//               
//            }
//        } catch (Exception es) {
//            // System.out.println("Why "+es);
//        }
//     
//    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
