/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.Entity.HocVien;
import com.edusys.jdbcHepper.JDBCHepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class HocVienDAO extends EdusysDAO<HocVien, Object> {

    public static int id;
    String sqlSelectAll = "select * from hocvien";
    String sqlInsert = "insert hocvien (makhoahoc,diem,manguoihoc) values (?,?,?)";
    String sqlUpdate = "update hocvien\n"
            + "set diem =?\n"
            + "where mahocvien =?";

    String sqlDelete = "delete hocvien where mahocvien =?";
    String sqlDeleteAt = "UPDATE chuyende\n"
            + "set delete_at = 0\n"
            + "where machuyende =?";
    String sqlSelectById = "select * from chuyende where machuyende = ?";

    @Override
    public void insert(HocVien entity) {
        try {
            JDBCHepper.update(sqlInsert, entity.getMaKhoaHoc(), entity.getDiem(), entity.getMaHocVien());
        } catch (Exception e) {
        }
    }

    @Override
    public void update(HocVien entity, Object KeyType) {
        try {
            System.out.println(entity.getDiem());
            System.out.println(entity.getMaHocVien());
            JDBCHepper.update(sqlUpdate,entity.getDiem(),entity.getMaHocVien());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi update DAO");
        }
    }

    @Override
    public void deleteAt(Object keyType1, Object keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(sqlSelectAll);
    }

    @Override
    public HocVien selectById(Object keyType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHepper.query(sql, args);
            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHocVien(rs.getInt(1));
                hv.setMaKhoaHoc(rs.getInt(2));
                hv.setDiem(rs.getInt(3));
                hv.setMaNguoiHoc(rs.getString(4));
                list.add(hv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi k selectALL DAO");
        }
        return list;
    }

    @Override
    public void delete(HocVien entity, Object keyType2) {
        try {
            JDBCHepper.update(sqlDelete, entity.getMaHocVien());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi k delete DAO");
        }
    }

}
