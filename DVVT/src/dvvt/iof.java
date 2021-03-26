/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvvt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trang
 */
public class iof {
    public static <t> List<t> read(String f){
        List<t> l = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(f));
            l = (List<t>) o.readObject();
            o.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(iof.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            //Logger.getLogger(iof.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(iof.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return l;
    }
    
    public static <t> void write(String f, List<t> l){
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f));
            o.writeObject(l);
            o.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(iof.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            //Logger.getLogger(iof.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
}
