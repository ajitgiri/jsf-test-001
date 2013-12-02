/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user;

import java.sql.*;
import java.util.*;

public class Users {

    private List<UserRegistration> users = new ArrayList<UserRegistration>();
//public Users(){}
    private Map values = new HashMap();
    private String s;

    public Map getValues() {
        return values;
    }

    public void setValues(Map values) {
        this.values = values;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Map addValues() {
        values.put("A", "AAA");
        values.put("B", "BBB");
        values.put("C", "CCC");
        return values;
    }

    public List<UserRegistration> getUsers() {

        return users;
    }

    public void setUsers(List<UserRegistration> users) {
        this.users = users;
    }

    public List<UserRegistration> retrive() {
        Connection con;
        Statement st;
        ResultSet rs = null;
        //  System.out.println("love ");
        List<UserRegistration> userss = new ArrayList<UserRegistration>();
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:jsfdsn");
            st = con.createStatement();
            rs = st.executeQuery("select * from User_Details");
            while (rs.next()) {
                UserRegistration user = new UserRegistration();
                user.setUserName(rs.getString("usr_name"));
                user.setUserPass(rs.getString("password"));
                user.setUserAdds(rs.getString("address"));
                user.setMailId(rs.getString("mailid"));
                userss.add(user);
                // System.out.println("lo "+this.users);
            }
        } catch (Exception es) {   // System.out.println("Why "+es);     
        }
        System.out.println("Ajit Final Result-----------" + users.toString().trim());
        return userss;

    }
}
