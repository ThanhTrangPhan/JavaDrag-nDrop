/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvvt;

import java.util.Comparator;

/**
 *
 * @author Trang
 */
public class sxsl implements Comparator<hd> {

    @Override
    public int compare(hd o1, hd o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double n = o1.getSl();
        double m = o2.getSl();
        if(n==m) return 0;
        if(n>m) return -1;
        return 1;
        
    }
    
}
