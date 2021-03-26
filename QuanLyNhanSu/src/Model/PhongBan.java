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
public class PhongBan implements Serializable{
    private int maPhong;
    private String tenPhong;
    private String moTa;
    private double heSoCongViec;
    private static int ma = 100;
    
    public PhongBan(){
        maPhong = ma++;
    }
    public PhongBan(int maPhong, String tenPhong, String moTa, double heSoCongViec) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.moTa = moTa;
        this.heSoCongViec = heSoCongViec;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getHeSoCongViec() {
        return heSoCongViec;
    }

    public void setHeSoCongViec(double heSoCongViec) {
        this.heSoCongViec = heSoCongViec;
    }

    public static int getMa() {
        return ma;
    }

    public static void setMa(int ma) {
        PhongBan.ma = ma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            maPhong, tenPhong, moTa, heSoCongViec
        };
    }

    public boolean giongNhau(PhongBan n) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(n.getTenPhong().equalsIgnoreCase(tenPhong) && n.getMoTa().equalsIgnoreCase(moTa)
                && n.getHeSoCongViec() == heSoCongViec){
            return true;
        }
        return false;
    }
    
}
