/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.Entity.KhoaHoc;
import com.edusys.jdbcHepper.JDBCHepper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class KhoaHocDAO extends EdusysDAO<KhoaHoc, Integer> {

    String sqlSelectAll = "select * from khoahoc";
    String sqlInsert = "insert into khoahoc (machuyende,hocphi,thoiluong,ngaykhaigiang,ngayta,manhanvien,ghichu,delete_at)\n"
            + "values (?,?,?,?,?,?,?,?)";
    String sqlUpdate = "update khoahoc\n"
            + "set \n"
            + "machuyende =?,\n"
            + "hocphi =?,\n"
            + "thoiluong = ?,\n"
            + "ngaykhaigiang =?,\n"
            + "ghichu =?\n"
            + "where makhoahoc =?";
    
    String sqlDeleteAt = "update khoahoc\n"
            + "set delete_at =0\n"
            + "where makhoahoc =?";
    String sqlDelete = "";
    String sqlSelectByID = "";

    @Override
    public void insert(KhoaHoc entity) {
        int bolen;
        if (entity.isDeleteAt()) {
            bolen = 1;
        } else {
            bolen = 0;
        }
        try {
            JDBCHepper.update(sqlInsert,
                    entity.getMaChuyenDe(),
                    entity.getHocPhi(),
                    entity.getThoiLuong(),
                    entity.getNgayKhaiGiang(),
                    entity.getNgayTao(),
                    entity.getMaNhanVien(),
                    entity.getGhiChu(),
                    bolen);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi insert khoa hoc");
        }

    }

    public void deleteDAO(KhoaHoc entity) {
        try {
            JDBCHepper.update(sqlDeleteAt, entity.getMaKhoaHoc());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi k delete DAO");
        }

    }

    @Override
    public void deleteAt(Integer keyType1, Integer keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySql(sqlSelectAll);
    }

    @Override
    public KhoaHoc selectById(Integer keyType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHepper.query(sql, args);
            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKhoaHoc(rs.getInt(1));
                kh.setMaChuyenDe(rs.getString(2));
                kh.setHocPhi(rs.getInt(3));
                kh.setThoiLuong(rs.getString(4));
                kh.setNgayKhaiGiang(rs.getDate(5));
                kh.setNgayTao(rs.getDate(6));
                kh.setMaNhanVien(rs.getString(7));
                kh.setGhiChu(rs.getString(8));
                kh.setDeleteAt(rs.getBoolean(9));
                list.add(kh);
            }
        } catch (SQLException ex) {

        }
        return list;
    }

    @Override
    public void delete(KhoaHoc entity, Integer keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(KhoaHoc entity, Integer KeyType) {
        try {
            JDBCHepper.update(sqlUpdate, entity.getMaChuyenDe(),
                                        entity.getHocPhi(),
                                        entity.getThoiLuong(),
                                        entity.getNgayKhaiGiang(),
                                        entity.getGhiChu(),
                                        KeyType);
        } catch (Exception e) {
            System.out.println("loi update khoa hoc DAO");
        }
    }

}
