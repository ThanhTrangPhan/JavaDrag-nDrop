/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.tc;
import java.util.Comparator;

/**
 *
 * @author Trang
 */
public class sxten implements Comparator<tc>{

    @Override
    public int compare(tc o1, tc o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String[] t1 = o1.getC().getTen().split(" ");
        int n = t1.length;
        String[] t2 = o2.getC().getTen().split(" ");
        int m = t2.length;
        for(int i=0;i<n;++i){
            if(m-i-1>=0 && t1[n-i-1].compareToIgnoreCase(t2[m-i-1])!=0){
                return t1[n-i-1].compareToIgnoreCase(t2[m-i-1]);
            }
        }
        return 0;
    }
    
}
