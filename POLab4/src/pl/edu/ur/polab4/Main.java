/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1=new Student("Kamil","Haha",24,"ISWD",5);
        Student student2=new Student("Kamil","Haha");
        Student student3=new Student("Kamil","Haha",24);
        Student student4=new Student("Kamil","Haha",24,"ISWD");
        
        System.out.println(student1.pokazeDane());
        System.out.println(student2.pokazeDane());
        System.out.println(student3.pokazeDane());
        System.out.println(student4.pokazeDane());
    }
    
}
