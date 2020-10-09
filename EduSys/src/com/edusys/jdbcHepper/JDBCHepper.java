/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.jdbcHepper;

import com.edusys.ui.EduSysJFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.edusys.Connect.Connect;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class JDBCHepper {

    public static PreparedStatement getPreparedStatement(String sql, Object... args) throws SQLException {
        PreparedStatement pst;
        if (sql.trim().startsWith("{")) {
            pst = Connect.cnt.prepareCall(sql); // tao cho thu tuc PROC
        } else {
            pst = Connect.cnt.prepareStatement(sql); // tao cho thu tuc binh thuong
        }
        for (int i = 0; i < args.length; i++) {
            pst.setObject(i + 1, args[i]);
            System.out.println(i);
        }
        
        return pst;
    }
    // dành cho update, exit , insert
    public static int update(String sql, Object... args) throws SQLException {
        
        try {
            System.out.println("args "+args);
            System.out.println("args "+args.length);
            PreparedStatement pst =getPreparedStatement(sql, args);
            
            try {
                System.out.println("hepper");
                return pst.executeUpdate();       
            } finally{
                pst.close();
            }
          
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sai hepper");
        }
        return 0;
    }
    public static int deleteAt(String sql, Object... args){
        try {
            PreparedStatement pst = getPreparedStatement(sql, args);
            pst.execute();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi deleteAt");
        }
        return 0;
    }
    // dành cho select trả về một RéultSet
    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement pst = getPreparedStatement(sql, args);
        return pst.executeQuery();
    }

    public static Object values(String sql, Object... args) throws SQLException {       
            ResultSet rs = query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }  
            rs.getStatement().close();
        return null; 
    }
}
