/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import static java.time.Clock.system;
import java.util.Scanner;

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
        student1.rok_studiow=1000;
        System.out.println(student3.pokazeDane());
        System.out.println(student4.pokazeDane());
    
    Scanner scanner = new Scanner(System.in);
    Student student = new Student();
    
    System.out.println("Podaj imie studenta:");
    Student.imie.scanner.next();
    System.out.println("Podaj naziwsko studenta:"):
    Student.nazwisko=scanner.next();
    System.out.println("Podaj numer indeksu:");
    student.nr_indeksu=scanner.nextInt();
    System.out.println("Podaj nazwe specjalnosci:");
    Student.nazwa_specjalnosci=scanner.next();
    System.out.println("Podaj rok studiow:");
    student.rok_studiow=scanner.nextInt();
    
    
    
    }
    
    Scanner scanner = new Scanner(System.in);
    Student student = new Student();
    
   
}
