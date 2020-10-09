/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.model;

import com.edusys.Connect.Connect;
import com.edusys.ui.QuanLy_ChuyenDe;
import static com.edusys.ui.QuanLy_ChuyenDe.model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class chuyenDeDAO {

    public ArrayList<ChuyenDe> listChuyenDeDAO = new ArrayList<>();

    public void insertListChuyenDe() {
        String sql = "select * from chuyende";
        try {
            Statement smt = Connect.cnt.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                String maChuyenDe = rs.getString(1);
                String tenChuyenDe = rs.getString(2);
                int hocphi = rs.getInt(3);
                String thoiLuong = rs.getString(4);
                String hinh = rs.getString(5);
                String mota = rs.getString(6);
                boolean deleteAt = rs.getBoolean(7);
                ChuyenDe cdInsert = new ChuyenDe(maChuyenDe, tenChuyenDe, thoiLuong, hinh, mota, hocphi, deleteAt);
                listChuyenDeDAO.add(cdInsert);
            }
//            System.out.println("abc");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi Quety chuyen de");
        }

    }

    public void insertChuyenDe(ChuyenDe cd) {
        String sql = "insert into chuyende (machuyende,tenchuyende,hocphi,thoiluong,hinh,mota,delete_at) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, cd.getMaChuyenDe());
            pst.setString(2, cd.getTenChuyenDe());
            pst.setInt(3, cd.getHocPhi());
            pst.setString(4, cd.getThoiLuong());
            pst.setString(5, cd.getHinh());
            pst.setString(6, cd.getMoTa());
            pst.setInt(7, 1);
            pst.execute();
            pst.close();

            listChuyenDeDAO.add(new ChuyenDe(cd.getMaChuyenDe(),
                    cd.getTenChuyenDe(),
                    cd.getThoiLuong(),
                    cd.getHinh(), cd.getMoTa(),
                    cd.getHocPhi(),
                    cd.isDeleteAt()));

            QuanLy_ChuyenDe.model.addRow(new Object[]{cd.getMaChuyenDe(),
                cd.getTenChuyenDe(),
                cd.getHocPhi(),
                cd.getThoiLuong(),
                cd.getHinh()});

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi add chuyên đề");
        }
    }

    public void deleteChuyenDe(ChuyenDe cd) {
        String sql = "delete from chuyende\n"
                + "where machuyende = ?";
        try {
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, cd.getMaChuyenDe());
            pst.execute();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi delete chuyên đề");
        }
    }

    public void deleteChuyenDeByDeleteAt(ChuyenDe cd) {
        String sql = "UPDATE chuyende\n"
                + "set delete_at = 0\n"
                + "where machuyende =?";
        try {
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, cd.getMaChuyenDe());
            pst.execute();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi delete chuyên đề");
        }
        for(ChuyenDe cdLst:listChuyenDeDAO){
            if(cdLst.getMaChuyenDe().equals(cd.getMaChuyenDe())){
                listChuyenDeDAO.remove(cdLst);
                break;
            }
        }
        
    }

    public void updateChuyenDe(ChuyenDe cd) {
        String sql = "update chuyende\n"
                + "set\n"
                + "tenchuyende =?,\n"
                + "hocphi =?,\n"
                + "thoiluong =?,\n"
                + "hinh =?,\n" 
                + "mota=?\n"
                + "where machuyende = ?";
        try {
            PreparedStatement pst = Connect.cnt.prepareStatement(sql);
            pst.setString(1, cd.getTenChuyenDe());
            pst.setInt(2, cd.getHocPhi());
            pst.setString(3, cd.getThoiLuong());
            pst.setString(4, cd.getHinh());
            pst.setString(5, cd.getMoTa());
            pst.setString(6, cd.getMaChuyenDe());
            pst.execute();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi update Chuyên Đề");
        }
    }
}
