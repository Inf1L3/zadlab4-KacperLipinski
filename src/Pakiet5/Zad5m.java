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
public class Zad5m {

    public static void main(String[] args) {
        Scanner pobierz = new Scanner(System.in);
        Student[] std = new Student[100];

        for (int i = 0; i < 100; i++) {
            std[i] = new Student("", "", "", 0, 0);
        }
        boolean czy = true;
        int indeks;
        do {                                                        //zad5

            System.out.println("Wybierz co zrobic:");
            System.out.println("1- wprowadz i edytuj");
            System.out.println("2- usun dane");
            System.out.println("3- wybierz studenta");
            System.out.println("4- wszyscy studenci");
            System.out.println("5- wybierz zakres");
            System.out.println("0- wyjdz");
            int wybor = pobierz.nextInt();
            if (wybor == 0) {
                break;
            }
            switch (wybor) {
                case 1:
                    System.out.println("Wprowadz lub nadpisz dane studenta. Wybierz indeks: ");
                    indeks = pobierz.nextInt();
                    System.out.print("Imie: ");
                    std[indeks].pobierzDane();
                    break;
                case 2:
                    System.out.println("Usun dane studenta. Wybierz indeks: ");
                    indeks = pobierz.nextInt();
                    std[indeks] = new Student("", "", "", 0, 0);
                    break;
                case 3:
                    System.out.println("Wypisz dane studenta o indeksie: ");
                    indeks = pobierz.nextInt();
                    std[indeks].pokazDane();
                    break;
                case 4:
                    System.out.println("Wysietlanie wszystkich obiektow");
                    for (int i = 0; i < 100; i++) {
                        System.out.print(i + ": ");
                        std[i].pokazDane();
                    }
                    break;
                case 5:
                    System.out.println("Podaj zakres: ");
                    System.out.println("Zakres dolny: ");
                    int zak_dol = pobierz.nextInt();
                    System.out.println("Zakres gorny: ");
                    int zak_gor = pobierz.nextInt();
                    for (int i = zak_dol; i < zak_gor; i++) {
                        System.out.print(i + ": ");
                        std[i].pokazDane();
                    }

                    for (int i = zak_dol; i <= zak_gor; i++) {
                        System.out.print(i + ": ");
                        std[i].pokazDane();
                    }

                    break;
                default:
                    System.out.println("Wcisnij 0 aby zakonczyc.");

            }
        } while (czy = true);

    }
}
