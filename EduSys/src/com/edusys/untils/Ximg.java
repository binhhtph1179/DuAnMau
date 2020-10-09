/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.untils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class Ximg {
    public  static  Image getAppicon(){
        URL url = Ximg.class.getResource("/com/edusys/icon/logo.png");
        return new ImageIcon(url).getImage();
    }
    public static void save(File src){
        File dst = new File("logo",src.getName());
        if(!dst.getParentFile().exists()){// kiểm tra xem thư mục này đã tồn tại chưa
            dst.getParentFile().mkdirs();// tạo ra file logo nếu chưa có mkdirs là tạo thư mục
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);// thêm vào thư mục logo
        } catch (Exception e) {
            
        
        }
    }
}
