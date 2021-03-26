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
public class sp implements Serializable{
    private int masp;
    private String ten;
    private int gia;
    private static int ma = 10000;
    
    public sp(){
        masp = ma++;
    }

    public sp(int masp, String ten, int gia) {
        this.masp = masp;
        this.ten = ten;
        this.gia = gia;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public static int getMa() {
        return ma;
    }

    public static void setMa(int ma) {
        sp.ma = ma;
    }
    
    public Object[] toOb(){
        return new Object[]{
            masp,ten,gia
        };
    }
    
    public boolean giongNhau(sp b){
        if(b.getTen().equalsIgnoreCase(ten)&& b.getGia() == gia){
            return true;
        }
        return false;
    }
}
