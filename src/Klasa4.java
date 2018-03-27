/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kacper2
 */
public class Klasa4 {
String nazwa;
double pole;
double obwod;
double objetosc;

public Klasa4(String nazwa,double obwod,double pole){
this.nazwa=nazwa;
this.obwod=obwod;
this.pole=pole;

}

public Klasa4(String nazwa,double objetosc){
this.nazwa=nazwa;
this.objetosc=objetosc;
}

public void pokazDane() {
 System.out.println(this.nazwa);
 System.out.println("Obwod to "+this.obwod);
 System.out.println("Pole to "+this.pole);
 System.out.println("Objetosc to "+this.objetosc);
}    
}
