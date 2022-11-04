/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileOutputStream;
import java.io.FileInputStream;
/**
 *
 * @author User
 */
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
         try{    
             Student s=new Student();
             s.get();
             fin=new FileInputStream("student.txt");   
             fout=new FileOutputStream("student.txt");
             fout.write(5);    
             fout.close();    
             fin.close();
             System.out.println("success...");    
            }
         catch(Exception e){
                System.out.println(e);
            }   
    }
    
}
