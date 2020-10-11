/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.DAO.ChuyenDeDAO;
import com.edusys.Entity.HocVien;
import com.edusys.DAO.HocVienDAO;
import com.edusys.DAO.KhoaHocDAO;
import com.edusys.Entity.ChuyenDe;
import com.edusys.Entity.KhoaHoc;
import com.edusys.Entity.NguoiHoc;
import com.edusys.DAO.NguoiHocDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QuanLi_HocVienJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HocVienJDialog
     */
    HocVienDAO hvDAO = new HocVienDAO();
    ChuyenDeDAO cdDAO = new ChuyenDeDAO();
    KhoaHocDAO khDAO = new KhoaHocDAO();
    NguoiHocDAO nhDAO = new NguoiHocDAO();
    List<HocVien> listHocVien = hvDAO.selectAll();
    List<ChuyenDe> listChuyenDe = cdDAO.selectAll();
    List<KhoaHoc> listKhoaHoc = khDAO.selectAll();
    List<NguoiHoc> listNguoiHoc = nhDAO.selectAll();
    public static DefaultTableModel modelHocVien;
    public static DefaultTableModel modelNguoiHoc;

    public QuanLi_HocVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        modelHocVien = (DefaultTableModel) tblHocVien.getModel();
        modelNguoiHoc = (DefaultTableModel) tblNguoiHoc.getModel();
        if (!loginJDialog.checkVaiTro) {
            btnXoa.setEnabled(false);
        }
//        fillToTableHocVien();
//        fillToTableNguoiHoc();
        fillCboCHuyenDe();
//        fill();

//        fillCboKhoaHoc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản Lí Học Viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chuyên Đề"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        cboChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });
        jPanel4.add(cboChuyenDe);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Khóa Học"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        cboKhoaHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });
        jPanel5.add(cboKhoaHoc);

        btnXoa.setText("Xóa khỏi khóa học");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật điểm");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Mã học viên", "Mã Người học", "Họ Tên", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHocVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHocVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHocVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHocVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXoa)
                .addGap(26, 26, 26)
                .addComponent(btnCapNhat)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Học Viên", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã người học", "Họ tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiHoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNguoiHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNguoiHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNguoiHoc);

        btnThem.setText("Thêm vào khóa học");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThem)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Người Học", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        EduSysJFrame.lblStatus.setText("Hệ thống quản lí đào tạo EduSys");
    }//GEN-LAST:event_formWindowClosed
    int indexNguoiHoc = -1;
    private void tblNguoiHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiHocMouseClicked
        indexNguoiHoc = tblNguoiHoc.getSelectedRow();

    }//GEN-LAST:event_tblNguoiHocMouseClicked

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        if (cboChuyenDe.getSelectedItem().equals("Tất cả")) {
            cboKhoaHoc.removeAllItems();
//            cboKhoaHoc.addItem("Tất cả");
            modelHocVien.setRowCount(0);
            int countHocVien = 0;
            for (HocVien hv : listHocVien) {
                for (NguoiHoc nh : listNguoiHoc) {
                    if (nh.getMaHocVien().equals(hv.getMaNguoiHoc())) {
                        modelHocVien.addRow(new Object[]{countHocVien, hv.getMaHocVien(), hv.getMaNguoiHoc(), nh.getHotenHocVien(), hv.getDiem()});
                        countHocVien++;
                    }
                }
            }
        } else {
            for (ChuyenDe cd : listChuyenDe) {
                if (cd.getTenChuyenDe().equals(cboChuyenDe.getSelectedItem())) {
                    System.out.println("mã chuyen đề " + cd.getMaChuyenDe());
                    fillCboKhoaHoc(cd.getMaChuyenDe());
                    break;
                }
            }

        }
//System.out.println("ok");
        
        
        
        if (cboKhoaHoc.getSelectedItem() != null) {
            int ma = Integer.parseInt(cboKhoaHoc.getSelectedItem().toString());
            String maChuyenDe = cboChuyenDe.getSelectedItem().toString();
            System.out.println("tham số truyền vào " + ma + " - " + maChuyenDe);
            hvDAO.getModelHocVien(ma, maChuyenDe);

        } else {
            modelHocVien.setRowCount(0);
        }
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
//        modelHocVien.setRowCount(0);
//        int countHocVien = 0;
//        System.out.println("cboKhoaHoc " + cboKhoaHoc.getSelectedItem());
//
//        for (HocVien hv : listHocVien) {
//            if (cboKhoaHoc.getSelectedItem() != null) {
//                if (!cboKhoaHoc.getSelectedItem().equals("Tất cả")) {
//                    fillToTableHocVien(Integer.parseInt(cboKhoaHoc.getSelectedItem() + ""));
////                if (cboKhoaHoc.getSelectedItem().equals(hv.getMaKhoaHoc())) {
////                    modelHocVien.addRow(new Object[]{countHocVien, hv.getMaHocVien(), hv.getMaKhoaHoc(), hv.getDiem(), hv.getMaNhienVien()});
////                    countHocVien++;
////                }
//                }
//            }
//
//        }
        if (cboKhoaHoc.getSelectedItem() != null) {
            int ma = Integer.parseInt(cboKhoaHoc.getSelectedItem().toString());
            String maChuyenDe = cboChuyenDe.getSelectedItem().toString();
            System.out.println("tham số truyền vào " + ma + " - " + maChuyenDe);
            hvDAO.getModelHocVien(ma, maChuyenDe);
            hvDAO.getModel(ma);

        } else {
            modelNguoiHoc.setRowCount(0);
        }


    }//GEN-LAST:event_cboKhoaHocActionPerformed
    int indexHocVien = -1;
    private void tblHocVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHocVienMouseClicked
        indexHocVien = tblHocVien.getSelectedRow();
        int ma = (int) tblHocVien.getValueAt(indexHocVien, 1);
        System.out.println(indexHocVien);
        for (HocVien hv : listHocVien) {
            if (ma == hv.getMaHocVien()) {
                cboKhoaHoc.setSelectedItem(hv.getMaKhoaHoc());
                break;
            }
            System.out.println(hv.getMaHocVien());

//            cboKhoaHoc.setSelectedIndex(5);
        }
    }//GEN-LAST:event_tblHocVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (validateForm()) {
            themHocVien();
            indexNguoiHoc = -1;
        } else {
            JOptionPane.showMessageDialog(this, "Học viên này đã tham gia khóa học này");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (indexHocVien == -1) {
            JOptionPane.showMessageDialog(this, "chưa chọn học viên");
        } else {
            HocVien kh = new HocVien();
            kh.setMaHocVien(Integer.parseInt(modelHocVien.getValueAt(indexHocVien, 1) + ""));
            kh.setDiem(Integer.parseInt(modelHocVien.getValueAt(indexHocVien, 4) + ""));
            kh.setMaKhoaHoc(Integer.parseInt(cboKhoaHoc.getSelectedItem() + ""));
            kh.setMaNguoiHoc(modelHocVien.getValueAt(indexHocVien, 2) + "");
            System.out.println(kh);
            int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa học viên này không");
            if (i == JOptionPane.YES_OPTION) {
                deleteHocVien(kh);
            }
            indexHocVien = -1;
        }


    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (indexHocVien == -1) {
            JOptionPane.showMessageDialog(this, "chưa chọn học viên");
        } else {
            if (cboKhoaHoc.getSelectedItem() == null || cboKhoaHoc.getSelectedItem().equals("Tất cả")) {
                JOptionPane.showMessageDialog(this, "Chưa chọn khóa học");
            } else {
                HocVien kh = new HocVien();
                kh.setMaHocVien(Integer.parseInt(modelHocVien.getValueAt(indexHocVien, 1) + ""));
                kh.setDiem(Integer.parseInt(modelHocVien.getValueAt(indexHocVien, 4) + ""));
                kh.setMaKhoaHoc(Integer.parseInt(cboKhoaHoc.getSelectedItem() + ""));
                kh.setMaNguoiHoc(modelHocVien.getValueAt(indexHocVien, 2) + "");
                updateHocVien(kh);
                System.out.println(kh);
                indexHocVien = -1;
            }

        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLi_HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLi_HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLi_HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLi_HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLi_HocVienJDialog dialog = new QuanLi_HocVienJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    // End of variables declaration//GEN-END:variables
    int countHocVien = 0;

    private void fillToTableHocVien(int ma) {
        modelHocVien.setRowCount(0);
        int countHocVien = 0;
        for (HocVien hv : listHocVien) {
            if (hv.getMaKhoaHoc() == ma) {
                for (NguoiHoc nh : listNguoiHoc) {
                    if (nh.getMaHocVien().equals(hv.getMaNguoiHoc())) {
                        modelHocVien.addRow(new Object[]{countHocVien, hv.getMaHocVien(), hv.getMaNguoiHoc(), nh.getHotenHocVien(), hv.getDiem()});
                        countHocVien++;
                    }
                }

            }
        }
    }

    private void fill() {
        int countHocVien = 0;
        for (HocVien hv : listHocVien) {
            for (NguoiHoc nh : listNguoiHoc) {
                if (nh.getMaHocVien().equals(hv.getMaNguoiHoc())) {
                    modelHocVien.addRow(new Object[]{countHocVien, hv.getMaHocVien(), hv.getMaNguoiHoc(), nh.getHotenHocVien(), hv.getDiem()});
                    countHocVien++;
                }
            }
        }
    }

    private void fillToTableNguoiHoc() {
        modelNguoiHoc.setRowCount(0);
        int countHocVien = 0;
        for (NguoiHoc nh : listNguoiHoc) {
            modelNguoiHoc.addRow(new Object[]{nh.getMaHocVien(),
                nh.getHotenHocVien(),
                nh.getGiuoiTinh(),
                nh.getNgaySinh(),
                nh.getDienThoai(),
                nh.getEmail()});
        }
    }

    private void fillCboCHuyenDe() {
        for (ChuyenDe cd : listChuyenDe) {
            cboChuyenDe.addItem(cd.getTenChuyenDe());
//            fillCboKhoaHoc(cd.getMaChuyenDe());
        }
    }

    private void fillCboKhoaHoc(String maCD) {
        System.out.println("fill khóa học");
        cboKhoaHoc.removeAllItems();
        for (KhoaHoc kh : listKhoaHoc) {
            if (kh.getMaChuyenDe().equals(maCD)) {
                cboKhoaHoc.addItem(kh.getMaKhoaHoc() + "");
//                fillToTableHocVien(Integer.parseInt(cboKhoaHoc.getSelectedItem() + ""));
            }

        }
    }

    private void themHocVien() {
        HocVien hv = new HocVien();
        hv.setMaHocVien(listHocVien.get(listHocVien.size() - 1).getMaHocVien() + 1);
        hv.setMaKhoaHoc(Integer.parseInt(cboKhoaHoc.getSelectedItem() + ""));
        hv.setDiem(0);
        hv.setMaNguoiHoc(tblNguoiHoc.getValueAt(indexNguoiHoc, 0) + "");
        System.out.println(hv);
        try {
            
            hvDAO.insert(hv);
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            listHocVien.add(hv);
            fillToTableHocVien(Integer.parseInt(cboKhoaHoc.getSelectedItem() + ""));
            jTabbedPane1.setSelectedIndex(0);
            tblHocVien.setRowSelectionInterval(modelHocVien.getRowCount() - 1, modelHocVien.getRowCount() - 1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi add hoc vien");
        }
    }

    private boolean validateForm() {
        boolean rt = true;
        if (cboChuyenDe.getSelectedItem().equals("Tất cả")) {
            JOptionPane.showMessageDialog(this, "Chưa chọn chuyên đề");
            rt = false;
        }
        if (cboKhoaHoc.getSelectedItem() != null) {
            if (cboKhoaHoc.getSelectedItem().equals("Tất cả")) {
                JOptionPane.showMessageDialog(this, "Chưa chọn khóa học");
                rt = false;
            }
        }

        boolean checkHocVien = false;
        boolean checkKhoaHoc = false;
//        for (HocVien hv : listHocVien) {
//            // check xem là học viên chưa
//            if (hv.getMaNguoiHoc().equals(tblNguoiHoc.getValueAt(indexNguoiHoc, 0) + "")) {
//                // check xem học viên này là hv của khóa học nào
//                System.out.println("đã là học viên rồi ");
//                checkHocVien = true;
//                if (cboKhoaHoc.getSelectedItem().equals(hv.getMaKhoaHoc())) {
//                    checkKhoaHoc = true;
//                    break;
//                }
////                for (KhoaHoc kh : listKhoaHoc) {
////                    
////                }
//
//            }
//
//        }
//        if (checkHocVien && checkKhoaHoc) {
//            JOptionPane.showMessageDialog(this, "khóa học này đã có học viên này rồi");
//            rt= false;
//        }
////        if (kh.getMaKhoaHoc() == hv.getMaKhoaHoc()) {
////                        if(kh.getMaKhoaHoc() == Integer.parseInt(cboKhoaHoc.getSelectedItem()+"")){
////                           JOptionPane.showMessageDialog(this, "khóa học này đã có học viên này rồi");
////                        return false; 
////                        }
////                        
////                    }
        for (KhoaHoc kh : listKhoaHoc) {
            if (kh.getMaKhoaHoc() == Integer.parseInt(cboKhoaHoc.getSelectedItem() + "")) {
                for (HocVien hv : listHocVien) {
                    if (hv.getMaKhoaHoc() == kh.getMaKhoaHoc()
                            && hv.getMaNguoiHoc().equals(tblNguoiHoc.getValueAt(indexNguoiHoc, 0) + "")) {
                        rt = false;
                        break;
                    }
                }
                break;
            }
        }
        return rt;
    }

    private void deleteHocVien(HocVien getKH) {
        hvDAO.delete(getKH, "ád");
        JOptionPane.showMessageDialog(this, "xóa thành công");
        listHocVien.remove(getKH);
        modelHocVien.removeRow(indexHocVien);
    }

    private void updateHocVien(HocVien kh) {
        try {
            hvDAO.update(kh, "áda");
            JOptionPane.showMessageDialog(this, "sửa thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi update");
        }

    }
}
