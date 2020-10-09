/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.Entity.ChuyenDe;
import com.edusys.jdbcHepper.JDBCHepper;
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
public class ChuyenDeDAO extends EdusysDAO<ChuyenDe, String> {

    String sqlSelectAll = "select * from chuyende";
    String sqlInsert = "insert into chuyende (machuyende,tenchuyende,hocphi,thoiluong,hinh,mota,delete_at) "
            + "values(?,?,?,?,?,?,?)";
    String sqlUpdate = "update chuyende\n"
            + "set\n"
            + "tenchuyende =?,\n"
            + "hocphi =?,\n"
            + "thoiluong =?,\n"
            + "hinh =?,\n"
            + "delete_at=?,"
            + "mota=?\n"
            + "where machuyende = ?";

    String sqlDelete = "update chuyende"
            + "set delete_at = 0"
            + "where machuyende = ?";
    String sqlDeleteAt = "UPDATE chuyende\n"
                + "set delete_at = 0\n"
                + "where machuyende =?";
    String sqlSelectById = "select * from chuyende where machuyende = ?";

    @Override
    public void insert(ChuyenDe entity) {
        try {
            System.out.println("entitl " + entity);
            JDBCHepper.update(sqlInsert,
                    entity.getMaChuyenDe(),
                    entity.getTenChuyenDe(),
                    entity.getHocPhi(),
                    entity.getThoiLuong(),
                    entity.getHinh(),
                    entity.getMoTa(),
                    entity.isDeleteAt());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChuyenDe entity, String dele) {
        int deleteAt = 1;
        if (entity.isDeleteAt()) {
            deleteAt = 1;
        } else {
            deleteAt = 0;
        }
        try {
            System.out.println("entitl " + entity);
            JDBCHepper.update(sqlUpdate,
                    entity.getTenChuyenDe(),
                    entity.getHocPhi(),
                    entity.getThoiLuong(),
                    entity.getHinh(),
                    deleteAt,
                    entity.getMoTa(),
                    entity.getMaChuyenDe()
            );
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteAtDAO(ChuyenDe entity) {
        try {
            JDBCHepper.update(sqlDeleteAt, entity.getMaChuyenDe());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi deleteAt chuyên đề DAO");
        }
    }

    @Override
    public void deleteAt(String keyType1, String keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySql(sqlSelectAll);
    }

    @Override
    public ChuyenDe selectById(String keyType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> listChuyenDe = new ArrayList<>();
        try {
            ResultSet rs = JDBCHepper.query(sql, args);
            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe();
                cd.setMaChuyenDe(rs.getString(1));
                cd.setTenChuyenDe(rs.getString(2));
                cd.setHocPhi(rs.getInt(3));
                cd.setThoiLuong(rs.getString(4));
                cd.setHinh(rs.getString(5));
                cd.setMoTa(rs.getString(6));
                cd.setDeleteAt(rs.getBoolean(7));
                listChuyenDe.add(cd);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi selectbysql");
        }
        return listChuyenDe;
    }

    @Override
    public void delete(ChuyenDe entity, String keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
