/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import java.util.List;
import com.edusys.Entity.NhanVien;
import com.edusys.jdbcHepper.JDBCHepper;
import javax.swing.JOptionPane;
import com.edusys.ui.EduSysJFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class NhanVienDAO extends EdusysDAO<NhanVien, String> {

    String sqlCapNhatMatKhau = "update nhanvien\n"
            + "set \n"
            + "matkhau =?\n"
            + "where manhanvien = ?";
    String sqlSelectAll = "select * from nhanvien";
    String sqlInsert = "insert into nhanvien (manhanvien,hoten,matkhau,vatro,delete_at,firstlogin) "
            + "values (?,?,?,?,?,?)";
    String sqlUpdate = "update nhanvien set hoten = ?, vatro=? where manhanvien = ?";
    String sqlDelete = "update nhanvien\n"
            + "set delete_at = 0\n"
            + "where manhanvien = ?";
    String sqlDeleteAt = "UPDATE nhanvien\n"
            + "set delete_at = 0\n"
            + "where manhanvien =?";
    String sqlSelectById = "select * from nhanvien where manhanvien = ?";

    public void deleteAtDAO(NhanVien entity) {
        try {
            JDBCHepper.update(sqlDeleteAt, entity.getManhanvien());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi deleteAt chuyên đề DAO");
        }
    }

    @Override
    public void insert(NhanVien entity) {
        try {
            JDBCHepper.update(sqlInsert,
                    entity.getManhanvien(),
                    entity.getHoten(),
                    entity.getMatkhau(),
                    entity.isVaitro(),
                    entity.isDeleteAt(),
                    entity.isFirstlogin());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteAt(String keyType1, String keyType2) {
        try {
            JDBCHepper.update(sqlDelete, keyType1, keyType2);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(sqlSelectAll);
    }

    @Override
    public NhanVien selectById(String keyType) {
        List<NhanVien> list = this.selectBySql(sqlSelectById, keyType);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> listNhanVien = new ArrayList<>();
        try {
            ResultSet rs = JDBCHepper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setManhanvien(rs.getString(1));
                nv.setHoten(rs.getString(2));
                nv.setMatkhau(rs.getString(3));
                nv.setVaitro(rs.getBoolean(4));
                nv.setDeleteAt(rs.getBoolean(5));
                nv.setFirstlogin(rs.getBoolean(6));
                listNhanVien.add(nv);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi selectbysql");
        }
        return listNhanVien;
    }

    @Override
    public void delete(NhanVien entity, String keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVien entity, String KeyType) {
//        JOptionPane.showMessageDialog(new EduSysJFrame(), "tam thoi dong chuc nang nay");
        try {
            JDBCHepper.update(sqlUpdate,
                    entity.getHoten(),
                    entity.isVaitro(),
                    entity.getManhanvien());
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("loi k update dc");
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void capNhatMatKhau(NhanVien entity){
        try {
            JDBCHepper.update(sqlCapNhatMatKhau,
                    entity.getMatkhau(),
                    entity.getManhanvien());
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("loi k đổi đc mật khẩu DAO");
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
