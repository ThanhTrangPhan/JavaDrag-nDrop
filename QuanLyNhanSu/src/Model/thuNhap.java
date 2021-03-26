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
public class thuNhap implements Serializable {
    private nhanVien n;
    private double luong;
    
    public thuNhap(nhanVien n, double luong) {
        this.n = n;
        this.luong = luong;
    }

    public nhanVien getN() {
        return n;
    }

    public void setN(nhanVien n) {
        this.n = n;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public Object[] toObject(){
        return new Object[]{
            n.getMaNV(),n.getHoTen(),luong
        };
    }
}
