/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvvt;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Trang
 */
public class bangtt extends javax.swing.JPanel {
    private DefaultTableModel md;
    
    /**
     * Creates new form bangtt
     */
    public bangtt(List<hd> ds) {
        initComponents();
        String[] col={"Ma khach hang","Ten khach hang","Tong tien"};
        md = new DefaultTableModel (col,0);
        b.setModel(md);
        List<kh> ds1 = iof.read("KH.txt");
        ds.sort(new sxten());
        int i=0;
        while(i<ds.size())
        {
            BigDecimal sum = BigDecimal.valueOf(0);
            double sub = Integer.parseInt(ds.get(i).getD().getGia()) * ds.get(i).getSl();
            BigDecimal s = BigDecimal.valueOf(sub);
            sum.add(s);
            int ma = ds.get(i).getK().getMakh();
            ++i;
            while(i<ds.size()){
                if(ds.get(i).getK().getMakh() == ma ){
                    sub = Integer.parseInt(ds.get(i).getD().getGia()) * ds.get(i).getSl();
                    s = BigDecimal.valueOf(sub);
                    sum.add(s);
                    ++i;
                } else{
                    
                    --i;
                    break;
                }
            }
            md.addRow(new tinh(ds.get(i).getK(),sum).toOb());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        b = new javax.swing.JTable();

        b.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(b);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable b;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
