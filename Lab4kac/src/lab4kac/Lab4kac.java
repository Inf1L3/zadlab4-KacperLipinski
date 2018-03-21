/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4kac;

/**
 *
 * @author student
 */
public class Lab4kac {

    public static void main(String[] args) {
    Student student = new Student("Jan","Kowaliski",12,"inf",2);
    student.pokazDane();
    Student student1 = new Student("Jan","Kowaliski");
    student1.pokazDane();
    Student student2 = new Student("Jan","Kowaliski",12);
    student2.pokazDane();
    Student student3 = new Student("Jan","Kowaliski","inf",2);
    student3.pokazDane();
    }

}
