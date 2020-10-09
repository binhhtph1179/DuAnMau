/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Entity;

import com.edusys.model.*;

/**
 *
 * @author DELL
 */
public class HocVien {
    private String maNguoiHoc;
    private int maHocVien,diem,maKhoaHoc;

    public HocVien() {
    }

    public HocVien(String maNhienVien, int maHocVien, int diem, int maKhoaHoc) {
        this.maNguoiHoc = maNhienVien;
        this.maHocVien = maHocVien;
        this.diem = diem;
        this.maKhoaHoc = maKhoaHoc;
    }

    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }
    

    public String getMaNguoiHoc() {
        return maNguoiHoc;
    }

    public void setMaNguoiHoc(String maNguoiHoc) {
        this.maNguoiHoc = maNguoiHoc;
    }

    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "HocVien{" + "maHocVien=" + maHocVien + ", maNhienVien=" + maNguoiHoc + ", maKhoaHoc=" + maKhoaHoc + ", diem=" + diem + '}';
    }
    
}
