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
public class ChuyenDe {
    private String maChuyenDe,tenChuyenDe,thoiLuong,Hinh,moTa;
    private int hocPhi;
    private boolean deleteAt;

    public ChuyenDe() {
    }

    public ChuyenDe(String maChuyenDe, String tenChuyenDe, String thoiLuong, String Hinh, String moTa, int hocPhi, boolean deleteAt) {
        this.maChuyenDe = maChuyenDe;
        this.tenChuyenDe = tenChuyenDe;
        this.thoiLuong = thoiLuong;
        this.Hinh = Hinh;
        this.moTa = moTa;
        this.hocPhi = hocPhi;
        this.deleteAt = deleteAt;
    }

    public String getMaChuyenDe() {
        return maChuyenDe;
    }

    public void setMaChuyenDe(String maChuyenDe) {
        this.maChuyenDe = maChuyenDe;
    }

    public String getTenChuyenDe() {
        return tenChuyenDe;
    }

    public void setTenChuyenDe(String tenChuyenDe) {
        this.tenChuyenDe = tenChuyenDe;
    }

    public String getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(String thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    public boolean isDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(boolean deleteAt) {
        this.deleteAt = deleteAt;
    }

    @Override
    public String toString() {
        return "ChuyenDe{" + "maChuyenDe=" + maChuyenDe + ", tenChuyenDe=" + tenChuyenDe + ", thoiLuong=" + thoiLuong + ", Hinh=" + Hinh + ", moTa=" + moTa + ", hocPhi=" + hocPhi + ", deleteAt=" + deleteAt + '}';
    }

    
    
}
