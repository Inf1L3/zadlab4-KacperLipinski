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
public class Student {
String imie;
String nazwisko;
int nr_indeksu;
String nazwaspecjalności;
int rok_studiow;        

public Student(String imie, String nazwisko, int nr_indeksu, String nazwaspecjalności, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwaspecjalności = nazwaspecjalności;
        this.rok_studiow = rok_studiow;        
    }
public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
               
    }
public Student(String imie, String nazwisko, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
              
    }
public Student(String imie, String nazwisko, String nazwaspecjalności, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaspecjalności = nazwaspecjalności;
        this.rok_studiow = rok_studiow;        
    }

public void pokazDane() {
        System.out.println("Student");
        System.out.println("imie"+this.imie);
        System.out.println("nazwisko" +this.imie);
        System.out.println("indeks"+this.nr_indeksu);
        System.out.println("specjalnosc"+this.nazwaspecjalności);
        System.out.println("rok studiow"+this.rok_studiow);
        
    }
}
