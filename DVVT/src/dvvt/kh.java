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
public class kh implements Serializable{
    private int makh;
    private String ten;
    private String dc;
    private String loai;
    private static int ma =10000;
    
    public kh(){
        makh=ma++;
    }

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getMa() {
        return ma;
    }

    public static void setMa(int ma) {
        kh.ma = ma;
    }
    
    public Object[] toOb(){
        return new Object[]{
            makh, ten, dc, loai
        };
    }
    public boolean giongNhau(kh a){
        if(a.getTen().equalsIgnoreCase(ten)&& a.getDc().equalsIgnoreCase(dc)){
            return true;
        }
        return false;
    }
}
