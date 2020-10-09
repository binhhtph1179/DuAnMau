/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.Entity.NguoiHoc;
import com.edusys.jdbcHepper.JDBCHepper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NguoiHocDAO extends EdusysDAO<NguoiHoc, String> {

    String sqlSelectAll = "select * from nguoihoc";
    String sqlInsert = "insert into nguoihoc (manguoihoc,hoten,ngaysinh,ngayDK,gioitinh,dienthoai,Email,ghichu,manhanvien,delete_at)\n"
            + "values (?,?,?,?,?,?,?,?,?,?)";
    String sqlUpdate = "update nguoihoc\n"
            + "set\n"
            + "hoten =?,\n"
            + "ngaysinh =?,\n"
            + "gioitinh=?,\n"
            + "dienthoai=?,\n"
            + "Email =?,\n"
            + "ghichu =?\n"
            + "where manguoihoc =?";
    String sqlDelete = "";
    String sqlDeleteAt = "UPDATE nguoihoc\n"
            + "set delete_at = 0\n"
            + "where manguoihoc =?";
    String sqlSelectById = "";

    @Override
    public void insert(NguoiHoc entity) {
        boolean GiuoiTinh = true;
        if (entity.getGiuoiTinh().equals("Nam")) {
            GiuoiTinh = true;
        } else {
            GiuoiTinh = false;
        }
        try {
            JDBCHepper.update(sqlInsert, entity.getMaHocVien(),
                    entity.getHotenHocVien(),
                    entity.getNgaySinh(),
                    entity.getNgayDK(),
                    GiuoiTinh,
                    entity.getDienThoai(),
                    entity.getEmail(),
                    entity.getGhiChu(),
                    entity.getMaNhanVien(),
                    entity.isDeleteAt());
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi k insert dc nguoi hoc");
        }

    }

    public void deleteAtDAO(NguoiHoc entity) {
        try {
            JDBCHepper.update(sqlDeleteAt, entity.getMaHocVien());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi deleteAt nguoi hoc DAO");
        }
    }

    @Override
    public void deleteAt(String keyType1, String keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySql(sqlSelectAll);
    }

    @Override
    public NguoiHoc selectById(String keyType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> ListNguoiHoc = new ArrayList<>();
        try {
            ResultSet rs = JDBCHepper.query(sql, args);
            while (rs.next()) {
                NguoiHoc cd = new NguoiHoc();
                cd.setMaHocVien(rs.getString(1));
                cd.setHotenHocVien(rs.getString(2));
                cd.setNgaySinh(rs.getDate(3));
                cd.setNgayDK(rs.getDate(4));
                String gioiTinh = " ";
                if (rs.getBoolean(5) == true) {
                    gioiTinh = "Nam";
                }
                if (rs.getBoolean(5) == false) {
                    gioiTinh = "Nữ";
                }
                cd.setGiuoiTinh(gioiTinh);
                cd.setDienThoai(rs.getString(6));
                cd.setEmail(rs.getString(7));
                cd.setGhiChu(rs.getString(8));
                cd.setMaNhanVien(rs.getString(9));
                cd.setDeleteAt(rs.getBoolean(10));

                ListNguoiHoc.add(cd);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi selectbysql");
        }
        return ListNguoiHoc;
    }

    @Override
    public void delete(NguoiHoc entity, String keyType2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NguoiHoc entity, String KeyType) {
        boolean GiuoiTinh = true;
        if (entity.getGiuoiTinh().equals("Nam")) {
            GiuoiTinh = true;
        } else {
            GiuoiTinh = false;
        }
        System.out.println("chua lam xong nha");
        try {
            JDBCHepper.update(sqlUpdate,entity.getHotenHocVien(),
                                        entity.getNgaySinh(),
                                        GiuoiTinh,
                                        entity.getDienThoai(),
                                        entity.getEmail(),
                                        entity.getGhiChu(),
                                        entity.getMaHocVien());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi k the update nguoi hoc DAO");
        }
    }

}
