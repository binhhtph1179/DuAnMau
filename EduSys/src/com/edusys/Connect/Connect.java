/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class Connect {
    public static Connection cnt;
    private String hosting="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=EduSys";
    private String userNameSql="sa";
    private String passWordsql="123456";
    
    public void getConect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnt = DriverManager.getConnection(hosting, userNameSql, passWordsql);
            System.out.println("conect thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi connect");
        }
    }
}
