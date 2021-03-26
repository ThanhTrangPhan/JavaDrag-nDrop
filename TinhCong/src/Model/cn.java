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
public class cn implements Serializable{
    private int macn;
    private String ten;
    private String dc;
    private String ca;
    private static int ma = 10000;
    
    public cn(){
        macn = ma++;
    }

    public cn(int macn, String ten, String dc, String ca) {
        this.macn = macn;
        this.ten = ten;
        this.dc = dc;
        this.ca = ca;
    }

    public int getMacn() {
        return macn;
    }

    public void setMacn(int macn) {
        this.macn = macn;
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

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public static int getMa() {
        return ma;
    }

    public static void setMa(int ma) {
        cn.ma = ma;
    }
    
    public Object[] toOb(){
        return new Object[]{
            macn,ten,dc,ca
        };
    }
    
    public boolean giongNhau(cn b){
        if(b.getTen().equalsIgnoreCase(ten) && b.getDc().equalsIgnoreCase(dc)){
            return true;
        }
        return false;
    }
}
