/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.Connect.Connect;
import static com.edusys.Connect.Connect.cnt;
//import com.edusys.model.ChuyenDe;
//import com.edusys.model.chuyenDeDAO;
import com.edusys.Entity.ChuyenDe;
import com.edusys.DAO.ChuyenDeDAO;
import com.edusys.Entity.NhanVien;
import com.edusys.untils.Ximg;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QuanLy_ChuyenDe extends javax.swing.JDialog {

    /**
     * Creates new form QuanLy_ChuyenDe
     */
    public QuanLy_ChuyenDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        innit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaChuyenDe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenChuyenDe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản Lý Chuyên Đề");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Chuyên Đề");

        txtMaChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên Chuyên đề");

        txtTenChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Thời Lượng (giờ)");
        jLabel4.setToolTipText("");

        txtThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Học Phí");

        txtHocPhi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mô tả chuyên đề");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLast.setText(">|");

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText(">>");

        btnPrev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrev.setText("<<");

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFirst.setText("|<");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setText("Ảnh (4x6)");
        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });
        jPanel4.add(lblAnh);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLamMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtTenChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHocPhi, txtMaChuyenDe, txtTenChuyenDe, txtThoiLuong});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnLamMoi)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHocPhi, txtMaChuyenDe, txtTenChuyenDe, txtThoiLuong});

        jTabbedPane1.addTab("Cập Nhật", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel3.add(txtTimKiem);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chuyên đề", "Tên chuyên đề", "Học phí", "Thời lượng", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(24);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sách", jPanel2);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
        try {
            JFileChooser jfc = new JFileChooser("H:\\Java 3\\ASM_java3_2\\src\\img");
            // click 1 lần
            jfc.showOpenDialog(this);
            //add link vào file
            File file = jfc.getSelectedFile();
            Ximg.save(file);
            //tạo img
            if (file != null) {
                Image img = ImageIO.read(file);
                // gán hình bừng file
                hinh = file.getName();
                // lấy ra size của label
                int width = lblAnh.getWidth();
                int height = lblAnh.getHeight();
                //set icon
                lblAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
                lblAnh.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_lblAnhMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        EduSysJFrame.lblStatus.setText("Hệ thống quản lí đào tạo EduSys");
    }//GEN-LAST:event_formWindowClosed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        if (validateForm()) {
//            try {
//                cdDAO.insertChuyenDe(getChuyenDe());
//                btnThem.setEnabled(false);
//                JOptionPane.showMessageDialog(this, "thêm thành công");
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.out.println("loi insert chuyen de");
//            }
//        }
        if (validateForm()) {
            try {
                InsertByDAO(getChuyenDeFromForm());
                btnThem.setEnabled(false);
                System.out.println("ĐÃ bấm");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("loi insert chuyen de");
            }
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
//        try {
//            cdDAO.updateChuyenDe(getChuyenDe());
//            JOptionPane.showMessageDialog(this, "sửa thông tin chuyên đề thành công");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("lỗi sửa chuyên đề");
//        }

        if (validateForm()) {
            updateByDAO(getChuyenDeFromForm());
            JOptionPane.showMessageDialog(this, "Sửa thành công");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
//        try {
//            int bolem = JOptionPane.showConfirmDialog(this, "bạn có muốn xóa chuyên đề này không");
//            if (bolem == JOptionPane.YES_OPTION) {
//                cdDAO.deleteChuyenDeByDeleteAt(getChuyenDe());
//                model.removeRow(indexModel);
//                JOptionPane.showMessageDialog(this, "xóa thành công");
//                clearForm();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("lỗi xóa chuyên đề");
//        }
        try {
            int bolem = JOptionPane.showConfirmDialog(this, "bạn có muốn xóa chuyên đề này không");
            if (bolem == JOptionPane.YES_OPTION) {
                deleteChuyenDeDAOByDeleteAt(getChuyenDeFromForm());
                JOptionPane.showMessageDialog(this, "xóa thành công");
                clearForm();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi xóa chuyên đề");
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
        btnThem.setEnabled(true);
        txtMaChuyenDe.setEnabled(true);
    }//GEN-LAST:event_btnLamMoiActionPerformed
    int indexModel;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        indexModel = jTable1.getSelectedRow();
        String maModel = jTable1.getValueAt(indexModel, 0) + "";
        showFormByDAO(maModel);
        txtMaChuyenDe.setEnabled(false);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        timKiemChuyenDE(txtTimKiem.getText());
    }//GEN-LAST:event_txtTimKiemKeyReleased

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
            java.util.logging.Logger.getLogger(QuanLy_ChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy_ChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy_ChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy_ChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLy_ChuyenDe dialog = new QuanLy_ChuyenDe(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaChuyenDe;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenChuyenDe;
    private javax.swing.JTextField txtThoiLuong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    String hinh;
    public static DefaultTableModel model;
//    chuyenDeDAO cdDAO = new chuyenDeDAO();
    ChuyenDeDAO cdDAO = new ChuyenDeDAO();
    List<ChuyenDe> list = cdDAO.selectAll();

    private void innit() {
        model = (DefaultTableModel) jTable1.getModel();
        btnThem.setEnabled(false);
//        cdDAO.insertListChuyenDe();
//        fillToTable();
        fillToTableByDAO();
        btnXoa.setEnabled(false);
        if (loginJDialog.checkVaiTro) {
            btnXoa.setEnabled(true);
        }

    }

    private void fillToTableByDAO() {
        model.setRowCount(0);
        try {

            for (ChuyenDe cd : list) {
                if (cd.isDeleteAt() == true) {
                    model.addRow(new Object[]{cd.getMaChuyenDe(),
                        cd.getTenChuyenDe(),
                        cd.getHocPhi(),
                        cd.getThoiLuong(),
                        cd.getHinh()});
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi fill by DAO");
        }
    }

    private void showFormByDAO(String ma) {
        String url = "";
        for (ChuyenDe cd : list) {
            if (cd.getMaChuyenDe().equals(ma)) {
                txtMaChuyenDe.setText(cd.getMaChuyenDe());
                txtTenChuyenDe.setText(cd.getTenChuyenDe());
                txtThoiLuong.setText(cd.getThoiLuong());
                txtHocPhi.setText(cd.getHocPhi() + "");
                txtMoTa.setText(cd.getMoTa());
                url = cd.getHinh();
                break;
            }
        }
        try {
            File file = new File("logo", url);
//            ImageIcon imgicon = new ImageIcon(getClass().getResource("logo" + url));
            ImageIcon imgicon = new ImageIcon(file.getAbsolutePath());
            Image img = imgicon.getImage();
            int width = this.lblAnh.getWidth();
            int height = this.lblAnh.getHeight();
            lblAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
            lblAnh.setText("");
        } catch (Exception e) {
            lblAnh.setText("Không có ảnh");
            lblAnh.setIcon(null);
        }
    }

    protected ChuyenDe getChuyenDeFromForm() {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaChuyenDe(txtMaChuyenDe.getText());
        cd.setTenChuyenDe(txtTenChuyenDe.getText());
        if (txtHocPhi.getText() == null) {
            cd.setHocPhi(0);
        } else {
            cd.setHocPhi(Integer.parseInt(txtHocPhi.getText()));
        }
        cd.setThoiLuong(txtThoiLuong.getText());
        cd.setHinh(hinh);
        cd.setMoTa(txtMoTa.getText());
        return cd;
    }

    private void InsertByDAO(ChuyenDe getCD) {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaChuyenDe(getCD.getMaChuyenDe());
        cd.setTenChuyenDe(getCD.getTenChuyenDe());
        cd.setHocPhi(getCD.getHocPhi());
        cd.setThoiLuong(getCD.getThoiLuong());
        cd.setHinh(getCD.getHinh());
        cd.setMoTa(getCD.getMoTa());
        cd.setDeleteAt(true);

        try {
            cdDAO.insert(cd);
            list.add(cd);
            model.addRow(new Object[]{getCD.getMaChuyenDe(),
                getCD.getTenChuyenDe(),
                getCD.getHocPhi(),
                getCD.getThoiLuong(),
                getCD.getHinh()});
            System.out.println("Hàm");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi inert chuyen de DAO");
        }
    }

    private void updateByDAO(ChuyenDe getCD) {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaChuyenDe(getCD.getMaChuyenDe());
        cd.setTenChuyenDe(getCD.getTenChuyenDe());
        cd.setHocPhi(getCD.getHocPhi());
        cd.setThoiLuong(getCD.getThoiLuong());
        cd.setHinh(getCD.getHinh());
        cd.setMoTa(getCD.getMoTa());
        cd.setDeleteAt(true);

        try {
            cdDAO.update(cd, "key");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getMaChuyenDe().equals(cd.getMaChuyenDe())){
                    list.set(i, cd);
                    break;
                }
            }
//            System.out.println(list);
            model.setValueAt(cd.getMaChuyenDe(), indexModel, 0);
            model.setValueAt(cd.getTenChuyenDe(), indexModel, 1);
            model.setValueAt(cd.getHocPhi(), indexModel, 2);
            model.setValueAt(cd.getThoiLuong(), indexModel, 3);
            model.setValueAt(cd.getHinh(), indexModel, 4);
            System.out.println("Hàm");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi inert chuyen de DAO");
        }
    }

    private void deleteChuyenDeDAOByDeleteAt(ChuyenDe getCD) {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaChuyenDe(getCD.getMaChuyenDe());
        cd.setTenChuyenDe(getCD.getTenChuyenDe());
        cd.setHocPhi(getCD.getHocPhi());
        cd.setThoiLuong(getCD.getThoiLuong());
        cd.setHinh(getCD.getHinh());
        cd.setMoTa(getCD.getMoTa());
        cd.setDeleteAt(false);
        try {
            cdDAO.deleteAtDAO(getCD);
            model.removeRow(indexModel);
            list.remove(cd);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi inert chuyen de DAO");
        }
    }

    private void timKiemChuyenDE(String ma) {
        model.setRowCount(0);
        for (ChuyenDe cd : list) {
            if (cd.isDeleteAt() == true) {
//                if(cd.getMaChuyenDe().matches(ma))
                if (cd.getMaChuyenDe().contains(ma)) {
                    model.addRow(new Object[]{cd.getMaChuyenDe(),
                        cd.getTenChuyenDe(),
                        cd.getHocPhi(),
                        cd.getThoiLuong(),
                        cd.getHinh()});
                    if (model.getRowCount() == 1) {
                        showFormByDAO(cd.getMaChuyenDe());
                    }
                }
            }
        }
        if (txtTimKiem.getText().isEmpty()) {
            fillToTableByDAO();
        }
    }

//    private void showForm(int indexModel, String ma) {
//        String url="";
//        for (ChuyenDe cd : cdDAO.listChuyenDeDAO) {
//            if (cd.getMaChuyenDe().equals(ma)) {
//                txtMaChuyenDe.setText(cd.getMaChuyenDe());
//                txtTenChuyenDe.setText(cd.getTenChuyenDe());
//                txtThoiLuong.setText(cd.getThoiLuong());
//                txtHocPhi.setText(cd.getHocPhi()+"");
//                txtMoTa.setText(cd.getMoTa());
//                url= cd.getHinh();
//                break;
//            }
//        }
//        try {
//            ImageIcon imgicon = new ImageIcon(getClass().getResource("/com/edusys/img/" + url));
//            Image img = imgicon.getImage();
//            int width = this.lblAnh.getWidth();
//            int height = this.lblAnh.getHeight();
//            lblAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
//            lblAnh.setText("");
//        } catch (Exception e) {
//            lblAnh.setText("Không có ảnh");
//            lblAnh.setIcon(null);
//        }
//    }
//
//    private void fillToTable() {
//        for (ChuyenDe cd : cdDAO.listChuyenDeDAO) {
//            if (cd.isDeleteAt() == true) {
//                model.addRow(new Object[]{cd.getMaChuyenDe(),
//                    cd.getTenChuyenDe(),
//                    cd.getHocPhi(),
//                    cd.getThoiLuong(),
//                    cd.getHinh()});
//            }
//        }
//    }
//
//    protected ChuyenDe getChuyenDe() {
//        ChuyenDe cd = new ChuyenDe();
//        cd.setMaChuyenDe(txtMaChuyenDe.getText());
//        cd.setTenChuyenDe(txtTenChuyenDe.getText());
//        if (txtHocPhi.getText() == null) {
//            cd.setHocPhi(0);
//        } else {
//            cd.setHocPhi(Integer.parseInt(txtHocPhi.getText()));
//        }
//
//        cd.setThoiLuong(txtThoiLuong.getText());
//        cd.setHinh(hinh);
//        cd.setMoTa(txtMoTa.getText());
//        return cd;
//    }
//
    private void clearForm() {
        txtMaChuyenDe.setText("");
        txtTenChuyenDe.setText("");
        txtHocPhi.setText("");
        txtMoTa.setText("");
        txtThoiLuong.setText("");
        lblAnh.setText("Ảnh (4x6)");
        lblAnh.setIcon(null);
        indexModel = -1;
    }

    private boolean validateForm() {
        boolean retun = true;
        if (txtMaChuyenDe.getText().isEmpty()) {
            txtMaChuyenDe.requestFocus();
            JOptionPane.showMessageDialog(this, "Không đc để trống Mã Chuyên Đề");
            retun = true;
        }

        if (txtTenChuyenDe.getText().isEmpty()) {
            txtTenChuyenDe.requestFocus();
            JOptionPane.showMessageDialog(this, "Không đc để trống Tên Chuyên Đề");
            retun = true;
        }

        if (txtThoiLuong.getText().isEmpty()) {
            txtThoiLuong.requestFocus();
            JOptionPane.showMessageDialog(this, "Không đc để trống Thời Lượng Chuyên Đề");
            retun = true;
        }

        if (txtHocPhi.getText().isEmpty()) {
            txtHocPhi.requestFocus();
            JOptionPane.showMessageDialog(this, "Không đc để trống Học phí Chuyên Đề");
            retun = true;
        }
        return retun;
    }

}
