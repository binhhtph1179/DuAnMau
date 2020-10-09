/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Entity;

import com.edusys.model.*;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class KhoaHoc {
    private  String maChuyenDe,thoiLuong,maNhanVien,GhiChu;
    private  int hocPhi,maKhoaHoc;
    private Date ngayKhaiGiang,ngayTao;
    private boolean deleteAt;
    public KhoaHoc() {
    }

    public KhoaHoc(String maChuyenDe, String thoiLuong, String maNhanVien, String GhiChu, int hocPhi, int maKhoaHoc, Date ngayKhaiGiang, Date ngayTao, boolean deleteAt) {
        this.maChuyenDe = maChuyenDe;
        this.thoiLuong = thoiLuong;
        this.maNhanVien = maNhanVien;
        this.GhiChu = GhiChu;
        this.hocPhi = hocPhi;
        this.maKhoaHoc = maKhoaHoc;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.ngayTao = ngayTao;
        this.deleteAt = deleteAt;
    }

    public KhoaHoc(String maChuyenDe, String thoiLuong, String maNhanVien, String GhiChu, int hocPhi, Date ngayKhaiGiang, Date ngayTao, boolean deleteAt) {
        this.maChuyenDe = maChuyenDe;
        this.thoiLuong = thoiLuong;
        this.maNhanVien = maNhanVien;
        this.GhiChu = GhiChu;
        this.hocPhi = hocPhi;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.ngayTao = ngayTao;
        this.deleteAt = deleteAt;
    }
    

    public boolean isDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(boolean deleteAt) {
        this.deleteAt = deleteAt;
    }

    

    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    

    public String getMaChuyenDe() {
        return maChuyenDe;
    }

    public void setMaChuyenDe(String maChuyenDe) {
        this.maChuyenDe = maChuyenDe;
    }

    public String getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(String thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    public Date getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(Date ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "KhoaHoc{" + "maKhoaHoc=" + maKhoaHoc + ", maChuyenDe=" + maChuyenDe + ", thoiLuong=" + thoiLuong + ", maNhanVien=" + maNhanVien + ", GhiChu=" + GhiChu + ", hocPhi=" + hocPhi + ", ngayKhaiGiang=" + ngayKhaiGiang + ", ngayTao=" + ngayTao + '}';
    }
    
   
    
}
