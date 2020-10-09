/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.model;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.edusys.Connect.Connect;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class nhanVienDAO {

    public ArrayList<NhanVien> listNhanVienDAO = new ArrayList<>();

    public void queryListNhanVien() {
        String sql = "select * from nhanvien";
        try {
            Statement pst = Connect.cnt.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                String manhanvien = rs.getString(1);
                String hoten = rs.getString(2);
                String matkhau = rs.getString(3);
                boolean vaitro = rs.getBoolean(4);
                boolean deleteAt = rs.getBoolean(5);
                boolean firstLog = rs.getBoolean(6);

                listNhanVienDAO.add(new NhanVien(hoten,
                        manhanvien,
                        matkhau,
                        vaitro,
                        firstLog,
                        deleteAt));

            }

        } catch (Exception e) {
            System.out.println("loi querry list nhan vien");
            e.printStackTrace();
        }
    }

    public void insertNhanVien(NhanVien nv) {
        String sql = "insert into nhanvien (manhanvien,hoten,matkhau,vatro,delete_at,firstlogin) "
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, nv.getManhanvien());
            pst.setString(2, nv.getHoten());
            pst.setString(3, nv.getMatkhau());
            pst.setBoolean(4, nv.isVaitro());
            pst.setBoolean(5, nv.isDeleteAt());
            pst.setBoolean(6, nv.isFirstlogin());

            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi insert nhan vien");
        }
    }

    public void updateNhanVien(NhanVien nv, String manv, NhanVien nv2) {
        String ma = manv;
        String sql = "update nhanvien set manhanvien ='" + manv + "', hoten = ?, vatro=? where manhanvien = ?";
        try {
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, nv2.getHoten());
            pst.setBoolean(2, nv2.isVaitro());
            pst.setString(3, nv.getManhanvien());
            pst.execute();
            pst.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi update nhan vien");
        }

    }

    public void deleteNhanVien(NhanVien nv) {
        String sql = "update nhanvien\n"
                + "set delete_at = 0\n"
                + "where manhanvien = ?";
        try {
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, nv.getManhanvien());
            pst.execute();
            System.out.println("xóa thành công");
        } catch (Exception e) {
            System.out.println("loi delete nhan vien");
            e.printStackTrace();
        }
    }
}
