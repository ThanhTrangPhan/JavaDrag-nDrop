/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvvt;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Trang
 */
public class tinh {
    private kh k;
    private BigDecimal sum;

    public tinh(kh k, BigDecimal sum) {
        this.k = k;
        this.sum = sum;
    }

    
    public kh getK() {
        return k;
    }

    public void setK(kh k) {
        this.k = k;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
    
    public Object[] toOb(){
        return new Object[]{
            k.getMakh(),k.getTen(),sum
        };
    }
    public boolean giongNhau(tinh a){
        if(a.getK().giongNhau(k)){
            return true;
        }
        return false;
    }
}
