/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4kac;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Student student = new Student(s.nextLine(),s.nextLine(),s.nextInt(),s.next(),s.nextInt());
    student.pokazDane();
    }
    
}
