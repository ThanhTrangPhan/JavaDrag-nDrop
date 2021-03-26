/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
import javax.swing.JOptionPane;

/**
 *
 * @author Trang
 */
public class IOFile {
    public static <T> List<T> readFile(String f){
        List<T> l = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(f));
            l = (List<T>) o.readObject();
            o.close();
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Khong tim thay file!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return l;
    }
    
    public static <T> void writeFile(String f, List<T> l){
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f));
            o.writeObject(l);
            o.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            //Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
    }
}
