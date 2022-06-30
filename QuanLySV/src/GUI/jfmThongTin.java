/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.*;
import javax.swing.*;
import BLL.*;
import DAL.ConnectDAL;

public class jfmThongTin extends javax.swing.JFrame {

    public static String sql ="Select * From THONGTINSV";
    public static Connection conn = ConnectDAL.getConnect();
    public static String tt;
    public static String dv;
    public jfmThongTin() {
        initComponents();
        // nhóm các rad vào 1 Group
        btgDoanVien.add(radCo);
        btgDoanVien.add(radKhong);
        // Gọi hàm đổ dl từ BLL lên bảng jtbThongTin
        loadTable.loadData(sql, jtbThongTin);
        loadcbMaSV();
        loadThongTin();
    }
    // hàm load lại sau khi cập nhật dữ liệu
    public void loadThongTin()
    {
        loadTable.loadData(sql, jtbThongTin);
        this.lblTongTTSV.setText("Tổng số sinh viên: "+this.jtbThongTin.getRowCount());
    }
    // Hàm load dữ liệu lên combobox MaSV
    public void loadcbMaSV()
    {
        String sql="select * from SINHVIEN";
        try
        {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                this.cbMaSV.addItem(rs.getString("MaSV"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Thông Báo Lỗi",1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDoanVien = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMaSV = new javax.swing.JComboBox<>();
        txtDiaChi = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        txtDanToc = new javax.swing.JTextField();
        txtFacebook = new javax.swing.JTextField();
        radCo = new javax.swing.JRadioButton();
        radKhong = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbThongTin = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblTongTTSV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Thông Tin Sinh Viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Mã SV:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Địa Chỉ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Số ĐT:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Email:");

        cbMaSV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        txtSoDT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Đoàn viên:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("CMND:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Dân tộc:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Facebook:");

        txtCMND.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDActionPerformed(evt);
            }
        });

        txtDanToc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtFacebook.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        radCo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radCo.setSelected(true);
        radCo.setText("Có");
        radCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCoActionPerformed(evt);
            }
        });

        radKhong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radKhong.setText("Không");
        radKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radKhongActionPerformed(evt);
            }
        });

        jtbThongTin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtbThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbThongTin.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtbThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbThongTin);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblTongTTSV.setText("Tổng số:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTongTTSV)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(radCo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radKhong))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txtFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThoat)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnThem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnXoa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnThoat))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(radCo)
                                        .addComponent(radKhong))
                                    .addGap(42, 42, 42))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)))
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblTongTTSV))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCoActionPerformed

    private void radKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radKhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radKhongActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDActionPerformed
    //sk click chuột load dữ liệu từ jtable lên textfield
    private void jtbThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbThongTinMouseClicked
        try
        {
            int row = this.jtbThongTin.getSelectedRow(); // lấy dòng tại con trỏ chuột
            String IDrow = (this.jtbThongTin.getModel().getValueAt(row, 0)).toString(); // Lấy giá trị tại con trỏ chuột theo kiểu string
             String doanVien = (this.jtbThongTin.getModel().getValueAt(row,5)).toString();// Lấy giá trị Giới Tính theo kiểu string
            String sql1 = "select * from THONGTINSV where MaSV='"+IDrow+"'";
            ResultSet rs = loadTable.showTextField(sql1);
            // đọc dữ liệu tại dòng "IDrow"
            if(rs.next()) // nếu có dữ liệu
            {
                tt= rs.getString("MaSV");
                this.cbMaSV.setSelectedItem(rs.getString("MaSV"));
                this.txtDiaChi.setText(rs.getString("DiaChi"));
                this.txtSoDT.setText(rs.getString("SoDT"));
                this.txtEmail.setText(rs.getString("Email"));
                this.txtFacebook.setText(rs.getString("Facebook"));
                this.txtCMND.setText(rs.getString("SoCMND"));
                this.txtDanToc.setText(rs.getString("DanToc"));
                if("true".equals(doanVien)) // nếu là đoàn viên
                {
                     radCo.setSelected(Boolean.TRUE);
                }
                else // nếu không là đoàn viên
                {
                     radKhong.setSelected(Boolean.TRUE);
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtbThongTinMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        jfmMain main = new jfmMain();
        this.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(radCo.isSelected())
            {
                dv="true";
            }
            else
            {
                dv="false";
            }
            if( this.txtDiaChi.getText().length()==0 || this.txtSoDT.getText().length()==0 || this.txtEmail.getText().length()==0 || this.txtFacebook.getText().length()==0 || this.txtCMND.getText().length()==0 || this.txtDanToc.getText().length()==0)
           JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin","Thông Báo",1);
        else
            thongTin.themThongTinSV(this.cbMaSV.getSelectedItem().toString(), this.txtDiaChi.getText(),this.txtSoDT.getText(), this.txtEmail.getText(), this.txtFacebook.getText(), dv,this.txtCMND.getText(),this.txtDanToc.getText());
             loadThongTin();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
         if( this.txtDiaChi.getText().length()==0 || this.txtSoDT.getText().length()==0 || this.txtEmail.getText().length()==0 || this.txtFacebook.getText().length()==0 || this.txtCMND.getText().length()==0 || this.txtDanToc.getText().length()==0)
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin","Thông Báo",1);
        else
       {
           if(radCo.isSelected())
            {
                dv="true";
            }
            else
            {
                dv="false";
            }
            thongTin.suaThongTinSV(tt,this.cbMaSV.getSelectedItem().toString(), this.txtDiaChi.getText(),this.txtSoDT.getText(), this.txtEmail.getText(), this.txtFacebook.getText(), dv,this.txtCMND.getText(),this.txtDanToc.getText());
             loadThongTin();
       }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

            if(JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa thông tin sinh viên có mã "+tt+" không?","Thông Báo",2)==0)
            {
                thongTin.xoaThongTinSV(tt);
            }
            loadThongTin();
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(jfmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfmThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDoanVien;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbMaSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbThongTin;
    private javax.swing.JLabel lblTongTTSV;
    private javax.swing.JRadioButton radCo;
    private javax.swing.JRadioButton radKhong;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFacebook;
    private javax.swing.JTextField txtSoDT;
    // End of variables declaration//GEN-END:variables
}