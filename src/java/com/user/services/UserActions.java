/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.services;

import com.user.UserRegistration;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ram
 */
public class UserActions {

    public String insertUserDetails(String uName, String uPass, String uAdds, String uMail) throws IOException {
        String strr = "'" + uName + "','" + uPass + "','" + uAdds + "','" + uMail + "'";
        System.out.println("Insert Data Details------ >>>>>>>" + strr);
        int rows;
        String flg = "fail";
        Connection con;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:jsfdsn");
            st = con.createStatement();
            rows = st.executeUpdate("insert into User_Details values(" + strr + ")");
            if (rows > 0) {
                flg = "success";
            }
        } catch (Exception es) {
        }
        return flg;
    }

//    public List retriveUserDetails() {
//        Connection con;
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
//            }
//        } catch (Exception es) {
//            // System.out.println("Why "+es);
//        }
//        return "hello";
//    }
}
