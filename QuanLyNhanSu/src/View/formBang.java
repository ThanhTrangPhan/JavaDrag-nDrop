/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.IOFile;
import Controller.SXBan;
import Controller.SXTen;
import Model.PhongBan;
import Model.bangChamCong;
import Model.nhanVien;
import Model.thuNhap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Trang
 */
public class formBang extends javax.swing.JPanel {
    private DefaultTableModel md;
    private String f;
    private List<bangChamCong> ds;
    private nhanVien n;
    private PhongBan b;
    private List<thuNhap> tn;
    /**
     * Creates new form formBang
     */
    public formBang() {
        initComponents();
        prepare();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ma = new javax.swing.JTextField();
        maPhong = new javax.swing.JTextField();
        ngay = new javax.swing.JTextField();
        nhap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        sxBan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Mã nhân viên:");

        jLabel2.setText("Mã phòng ban:");

        jLabel3.setText("Số ngày làm việc: ");

        ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maActionPerformed(evt);
            }
        });

        maPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maPhongActionPerformed(evt);
            }
        });

        nhap.setText("Nhập");
        nhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Sắp xếp theo tên nhân viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sxBan.setText("Sắp xếp theo tên phòng ban ");
        sxBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxBanActionPerformed(evt);
            }
        });

        jButton2.setText("Bảng thu nhập");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(33, 33, 33)
                            .addComponent(maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nhap)
                                .addComponent(ngay))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sxBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(nhap)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(sxBan))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maPhongActionPerformed

    private void maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maActionPerformed

    private void nhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapActionPerformed

        // TODO add your handling code here:
        if(check()){
            bangChamCong cc = new bangChamCong(n,b,Integer.parseInt(ngay.getText()));
            md.addRow(cc.toObject());
            ds.add(cc);
            double luong = (1450000*(2+n.getBacLuong()/3)*b.getHeSoCongViec()*(Integer.parseInt(ngay.getText())/22));
            tn.add(new thuNhap(n,luong));
            IOFile.writeFile(f, ds);
            IOFile.writeFile("TN.txt", tn);
            
        }
    }//GEN-LAST:event_nhapActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        md.setRowCount(0);
        ds.sort(new SXTen());
        for(bangChamCong i : ds){
            md.addRow(i.toObject());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sxBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxBanActionPerformed
        // TODO add your handling code here:
        md.setRowCount(0);
        ds.sort(new SXBan());
        for(bangChamCong i : ds){
            md.addRow(i.toObject());
        }
    }//GEN-LAST:event_sxBanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        thunhap tn = new thunhap();
        tn.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField ma;
    private javax.swing.JTextField maPhong;
    private javax.swing.JTextField ngay;
    private javax.swing.JButton nhap;
    private javax.swing.JButton sxBan;
    // End of variables declaration//GEN-END:variables

    private void prepare() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String[] cols = {"Tên nhân viên","Tên phòng ban","Số ngày làm việc"};
        md = new DefaultTableModel(cols, 0);
        jTable1.setModel(md);
        f= "QLNS.txt";
        ds = IOFile.readFile(f);
        tn = IOFile.readFile("TN.txt");
        for(bangChamCong i : ds){
            md.addRow(i.toObject());
        }
    }

    private boolean check() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<nhanVien> dsnv = IOFile.readFile("NV.txt");
        List<PhongBan> dspb = IOFile.readFile("PB.txt");
        boolean ok = false;
        if(ma.getText().isBlank() || maPhong.getText().isBlank()|| ngay.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin!");
            return false;
        }
        for(nhanVien i : dsnv){
            if(Integer.parseInt(ma.getText()) == i.getMaNV()){
                ok = true;
                if(!ds.isEmpty()){
                    for(bangChamCong j : ds){
                        if(j.getN().getMaNV() == Integer.parseInt(ma.getText())){
                            JOptionPane.showMessageDialog(this, "Trùng thông tin nhân viên!");
                            return false;
                        }
                    }
                }
                n = i;
                break;
            }
        }
        if(!ok){
            JOptionPane.showMessageDialog(this, "Sai mã nhân viên!");
            return false;
        } else{
            ok = false;
            for(PhongBan k:dspb){
                if(Integer.parseInt(maPhong.getText()) == k.getMaPhong()){
                    ok = true;
                    b = k;
                    return true;
                }
            }
            JOptionPane.showMessageDialog(this, "Sai mã phòng ban!");
            return false;
        }
    }

    
}
