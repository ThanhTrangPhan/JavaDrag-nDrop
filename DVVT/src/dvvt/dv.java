/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvvt;

import java.io.Serializable;

/**
 *
 * @author Trang
 */
public class dv implements Serializable{
    private int madv;
    private String ten;
    private String gia;
    private String dvi;
    private static int ma =100;
    
    public dv(){
        madv = ma++;
    }

    public int getMadv() {
        return madv;
    }

    public void setMadv(int madv) {
        this.madv = madv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }

    public static int getMa() {
        return ma;
    }

    public static void setMa(int ma) {
        dv.ma = ma;
    }
    public Object[] toOb(){
        return new Object[]{
            madv, ten, gia, dvi
        };
    }
    public boolean giongNhau(dv a){
        if(a.getTen().equalsIgnoreCase(ten)&& a.getGia().equalsIgnoreCase(gia)){
            return true;
        }
        return false;
    }
    
     
}
