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
public class NguoiHoc {
    private String hotenHocVien,maHocVien,dienThoai,Email,giuoiTinh,ghiChu,maNhanVien;
    private Date ngaySinh,ngayDK;
    private boolean deleteAt;

    public NguoiHoc() {
    }

    public NguoiHoc(String hotenHocVien, String maHocVien, String dienThoai, String Email, String giuoiTinh, String ghiChu, String maNhanVien, Date ngaySinh, Date ngayDK, boolean deleteAt) {
        this.hotenHocVien = hotenHocVien;
        this.maHocVien = maHocVien;
        this.dienThoai = dienThoai;
        this.Email = Email;
        this.giuoiTinh = giuoiTinh;
        this.ghiChu = ghiChu;
        this.maNhanVien = maNhanVien;
        this.ngaySinh = ngaySinh;
        this.ngayDK = ngayDK;
        this.deleteAt = deleteAt;
    }

    public String getHotenHocVien() {
        return hotenHocVien;
    }

    public void setHotenHocVien(String hotenHocVien) {
        this.hotenHocVien = hotenHocVien;
    }

    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGiuoiTinh() {
        return giuoiTinh;
    }

    public void setGiuoiTinh(String giuoiTinh) {
        this.giuoiTinh = giuoiTinh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public boolean isDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(boolean deleteAt) {
        this.deleteAt = deleteAt;
    }

    @Override
    public String toString() {
        return "NguoiHoc{" + "hotenHocVien=" + hotenHocVien + ", maHocVien=" + maHocVien + ", dienThoai=" + dienThoai + ", Email=" + Email + ", giuoiTinh=" + giuoiTinh + ", ghiChu=" + ghiChu + ", maNhanVien=" + maNhanVien + ", ngaySinh=" + ngaySinh + ", ngayDK=" + ngayDK + ", deleteAt=" + deleteAt + '}';
    }
    
    
}
