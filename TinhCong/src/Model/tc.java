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
public class tc implements Serializable {
    private cn c;
    private sp s;
    private int sl;
    
    public tc(){
        
    }

    public tc(cn c, sp s, int sl) {
        this.c = c;
        this.s = s;
        this.sl = sl;
    }

    public cn getC() {
        return c;
    }

    public void setC(cn c) {
        this.c = c;
    }

    public sp getS() {
        return s;
    }

    public void setS(sp s) {
        this.s = s;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public Object[] toOb(){
        return new Object[]{
            c.getTen(), s.getTen(),sl
        };
    }
    
    public boolean giongNhau(tc a){
        if(a.getC().giongNhau(c) && a.getS().giongNhau(s)){
            return true;
        } 
        return false;
    }
    
}
