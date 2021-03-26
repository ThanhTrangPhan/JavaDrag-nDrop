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
public class hd implements Serializable {
    private kh k;
    private dv d;
    private double sl;
    
    public hd(){
        
    }

    public kh getK() {
        return k;
    }

    public void setK(kh k) {
        this.k = k;
    }

    public dv getD() {
        return d;
    }

    public void setD(dv d) {
        this.d = d;
    }

    public double getSl() {
        return sl;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }
    public Object[] toOb(){
        return new Object[]{
            k.getMakh(),k.getTen(),d.getTen(),sl
        };
    }
    public boolean giongNhau(hd a){
        if(a.getK().giongNhau(k)&& a.getD().giongNhau(d)){
            return true;
        }
        return false;
    }
}
