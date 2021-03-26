/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Trang
 */
public class bangChamCong implements Serializable {
    private nhanVien n;
    private PhongBan b;
    private int soNgay;

    public bangChamCong(nhanVien n, PhongBan b, int soNgay) {
        this.n = n;
        this.b = b;
        this.soNgay = soNgay;
    }

    public bangChamCong() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public nhanVien getN() {
        return n;
    }

    public void setN(nhanVien n) {
        this.n = n;
    }

    public PhongBan getB() {
        return b;
    }

    public void setB(PhongBan b) {
        this.b = b;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    public Object[] toObject(){
        return new Object[]{
            n.getHoTen(),b.getTenPhong(),soNgay
        };
    }

   
}
