/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.jdbcHepper.JDBCHepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class thongKeDAO {
    public List<Object[]> seletctDiem(int ma) {
        String sql="{CALL  sp_diem (?)}";
        List<Object[]> list= new ArrayList<>();
        try {
            ResultSet rs = JDBCHepper.query(sql,ma);
            while(rs.next()){
                Object[] obj = new Object[1];
                
                list.add((Object[]) rs.getObject(1));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi query obj");
        }
        return list;
    }
    
    public List<Integer> selectYear() {
        String sql="select distinct YEAR(ngaykhaigiang) from khoahoc order by YEAR(ngaykhaigiang) desc";
        List<Integer> list= new ArrayList<>();
        try {
            ResultSet rs = JDBCHepper.query(sql);
            while(rs.next()){
                list.add(rs.getInt(1));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi query nam");
        }
        return list;
    }
    
}
