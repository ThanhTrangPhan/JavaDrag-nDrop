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
public class nhanVien implements Serializable{
    private int maNV;
    private String hoTen;
    private String diaChi;
    private String soDT;
    private int bacLuong;
    private static int ma = 1000;
    
    public nhanVien(){
        maNV = ma++;
    }
    
    public nhanVien(int maNV, String hoTen, String diaChi, String soDT, int bacLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.bacLuong = bacLuong;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    public static int getMa() {
        return ma;
    }

    public static void setMa(int ma) {
        nhanVien.ma = ma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            maNV,hoTen, diaChi, soDT, bacLuong
        };
    }
    
    public boolean giongNhau(nhanVien v){
        if(v.getHoTen().equalsIgnoreCase(hoTen) && v.getDiaChi().equalsIgnoreCase(diaChi) &&
                v.getSoDT().equals(soDT)){
            return true;
        }
        return false;
    }
}
