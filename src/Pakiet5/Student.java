/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pakiet5;

import java.util.Scanner;

/**
 *
 * @author Kacper2
 */
public class Student {
    Scanner pobierz = new Scanner(System.in);
    String imie;
    String nazwizko;
    int nr_indeksu;
    String nazwa_specjalnosci;
    int rok_studiow;
    public Student (String imie,String nazwisko, String nazwa_specjalnosci, int rok_studiow,int nr_indeksu){
        this.imie=imie;
        this.nazwizko=nazwisko;
        this.nazwa_specjalnosci=nazwa_specjalnosci;
        this.nr_indeksu=nr_indeksu;
        this.rok_studiow=rok_studiow;
    }
    
    public Student( String imie, String nazwisko){
        this.imie=imie;
        this.nazwizko=nazwisko;
        this.nazwa_specjalnosci="nazwa specjalnisci";
        this.nr_indeksu=4564;
        this.rok_studiow=1;
        
        
    }
    
    public Student( int nr_indesku){
        this.imie="imie";
        this.nazwizko="nazwisko";
        this.nazwa_specjalnosci="nazwa_specjalnosci";
        this.nr_indeksu=nr_indeksu;
        this.rok_studiow=4;
        
        
    }
 
    public Student(String nazwa_specjalnosci){
        this.imie="imie";
        this.nazwizko="nazwisko";
        this.nazwa_specjalnosci=nazwa_specjalnosci;
        this.nr_indeksu=4564;
        this.rok_studiow=1;
        
        
    }
    public void pokazDane() {
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nr_indeksu);
        System.out.println("nr indeksu: " + this.nr_indeksu);
        System.out.println("nazwa specjalnosci: " + this.nazwa_specjalnosci);
        System.out.println("rok: " + this.rok_studiow);
    }
    public void pobierzDane() {
        imie = pobierz.nextLine();
        System.out.print("Nazwisko: ");
        nazwizko = pobierz.nextLine();
        System.out.print("Nazwa specjalnosci: ");
        nazwa_specjalnosci = pobierz.nextLine();
        System.out.print("Numer indeksu: ");
        nr_indeksu = pobierz.nextInt();
        System.out.print("Rok studiow: ");
        rok_studiow = pobierz.nextInt();

    }

    @Override
    public String toString() {
        return "imie=" + imie + ", nazwizko=" + nazwizko + ", nr_indeksu=" + nr_indeksu + ", nazwa_specjalnosci=" + nazwa_specjalnosci + ", rok_studiow=" + rok_studiow ;
    }
}    

