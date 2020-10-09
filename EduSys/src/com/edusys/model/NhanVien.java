/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.model;

import sun.security.util.Password;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String hoten,manhanvien,matkhau;
    boolean vaitro,firstlogin,deleteAt;
    Password pw;
    public NhanVien() {
    }

    public NhanVien(String hoten, String manhanvien, String matkhau, boolean vaitro, boolean firstlogin, boolean deleteAt) {
        this.hoten = hoten;
        this.manhanvien = manhanvien;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
        this.firstlogin = firstlogin;
        this.deleteAt = deleteAt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public boolean isVaitro() {
        return vaitro;
    }

    public void setVaitro(boolean vaitro) {
        this.vaitro = vaitro;
    }

    public boolean isFirstlogin() {
        return firstlogin;
    }

    public void setFirstlogin(boolean firstlogin) {
        this.firstlogin = firstlogin;
    }

    public boolean isDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(boolean deleteAt) {
        this.deleteAt = deleteAt;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoten=" + hoten + ", manhanvien=" + manhanvien + ", matkhau=" + matkhau + ", vaitro=" + vaitro + ", firstlogin=" + firstlogin + ", deleteAt=" + deleteAt + '}';
    }

    
    
    
}
