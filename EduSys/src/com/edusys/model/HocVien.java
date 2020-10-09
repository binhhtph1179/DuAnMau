/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.model;

/**
 *
 * @author DELL
 */
public class HocVien {
    private String maHocVien,maNhienVien,maKhoaHoc;
    private int diem;

    public HocVien() {
    }

    public HocVien(String maHocVien, String maNhienVien, String maKhoaHoc, int diem) {
        this.maHocVien = maHocVien;
        this.maNhienVien = maNhienVien;
        this.maKhoaHoc = maKhoaHoc;
        this.diem = diem;
    }

    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getMaNhienVien() {
        return maNhienVien;
    }

    public void setMaNhienVien(String maNhienVien) {
        this.maNhienVien = maNhienVien;
    }

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
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
        return "HocVien{" + "maHocVien=" + maHocVien + ", maNhienVien=" + maNhienVien + ", maKhoaHoc=" + maKhoaHoc + ", diem=" + diem + '}';
    }
    
}
