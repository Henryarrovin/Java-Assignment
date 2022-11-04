/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.util.*;
/**
 *
 * @author User
 */
public class Student {
    void get(){
        System.out.println("Enter the details of 100 Students...");
        String Name;
        int RollNo;
        int year;
        char Section;
   
        Scanner s=new Scanner(System.in);
        for(int i=0;i<2;i++){
            System.out.println("Enter Name:");
            Name=s.next();
            System.out.println("Enter Roll No:");
            RollNo=s.nextInt();
            System.out.println("Enter year of education:");
            year=s.nextInt();
            System.out.println("Enter your Section:");
            Section=s.next().charAt(0); 
            
        }
    }
}
