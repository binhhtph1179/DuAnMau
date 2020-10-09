/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.model;

import java.util.ArrayList;
import com.edusys.Connect.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class nguoihocDAO {

    public static ArrayList<NguoiHoc> listNguoiHoc = new ArrayList<>();

    public void querryNguoiHoc() {
        String sql = "select * from nguoihoc";
        try {
            Statement stt = Connect.cnt.createStatement();
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                String maNguoiHoc = rs.getString(1);
                String tenNguoiHoc = rs.getString(2);
                Date ngaySinh = rs.getDate(3);
                String gioiTinh = " ";
                if (rs.getBoolean(4) == true) {
                    gioiTinh = "Nam";
                }
                if (rs.getBoolean(4) == false) {
                    gioiTinh = "Nữ";
                }
                String dienThoai = rs.getString(5);
                String Email = rs.getString(6);
                String ghiChu = rs.getString(7);
                String maNhanVien = rs.getString(8);
                boolean deleteAt = rs.getBoolean(9);
                listNguoiHoc.add(new NguoiHoc(tenNguoiHoc,
                        maNguoiHoc,
                        dienThoai,
                        Email,
                        gioiTinh,
                        ghiChu,
                        maNhanVien,
                        ngaySinh,
                        ngaySinh,
                        deleteAt));

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi k querry dc nguoi hoc");
        }
    }

    public  void insertNguoiHoc(NguoiHoc nh) {
        String sql = "insert into nguoihoc (manguoihoc,hoten,ngaysinh,gioitinh,dienthoai,Email,ghichu,manhanvien,delete_at)\n"
                + "values (?,?,?,?,?,?,?,?,?)";
        boolean bl = true;
        try {
            
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, nh.getMaHocVien());
            pst.setString(2, nh.getHotenHocVien());
            
            pst.setDate(3, new java.sql.Date(nh.getNgaySinh().getTime()));// tý hỏi thầy 
            
            if (nh.getGiuoiTinh() == "Nữ") {
                bl = false;
            }
            
            pst.setBoolean(4, bl);
            pst.setString(5, nh.getDienThoai());
            pst.setString(6, nh.getEmail());
            pst.setString(7, nh.getGhiChu());
            pst.setString(8, nh.getMaNhanVien());
            pst.setBoolean(9, true);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi insert nguoi hoc");
        }
    }
}
