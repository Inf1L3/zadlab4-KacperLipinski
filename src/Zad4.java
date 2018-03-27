
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kacper2
 */
public class Zad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner wej = new Scanner(System.in);
    int m,a,r,h;
    
     do{
 System.out.println("1.Koło\n"+"2.Kwadrat\n"+"3.Prostokąt\n"+"4.Szescian\n"+"5.Prostopadloscian\n"+"6.Kula\n"+"7.Stożek\n"+"8.Wyjście z programu"); 
  m= wej.nextInt();
switch(m)
{
case 1:
System.out.println("Podaj r");
r= wej.nextInt();
Klasa4 kolo=new Klasa4("Kolo",2*Math.PI*r,Math.pow((Math.PI*r),2));
kolo.pokazDane();
break; 
case 2:
System.out.println("Podaj a");
a= wej.nextInt();
Klasa4 kwadrat=new Klasa4("Kwadrat",4*a,Math.pow(a,2));
kwadrat.pokazDane();
break; 
case 3:
System.out.println("Podaj a");
a= wej.nextInt();
System.out.println("Podaj b");
r= wej.nextInt();
Klasa4 prostokat=new Klasa4("Prostokat",2*a+2*r,a*r);
prostokat.pokazDane();
break; 
case 4:
System.out.println("Podaj a");
a= wej.nextInt();
Klasa4 szescian=new Klasa4("Szescian",a*Math.sqrt(3));
szescian.pokazDane();
break; 
case 5:
System.out.println("Podaj a");
a= wej.nextInt();
System.out.println("Podaj b");
r= wej.nextInt();
System.out.println("Podaj h");
h= wej.nextInt();
Klasa4 prosto=new Klasa4("Prostopadloscian",a*r*h);
prosto.pokazDane();
break; 
case 6:
System.out.println("Podaj r");
r= wej.nextInt();
Klasa4 kula=new Klasa4("Kula",(4/3)*Math.PI*Math.pow(r, 3));
kula.pokazDane();
break; 
case 7:
System.out.println("Podaj r");
r= wej.nextInt();
System.out.println("Podaj b");
h= wej.nextInt();
Klasa4 stozek=new Klasa4("Stozek",(1/3)*Math.PI*Math.pow(r,2)*h);
stozek.pokazDane();
break;
case 8:
break;
default:
System.out.println("nieprzewidziana sytuacja");    
}        
}while(m!=8);
    }
    
}
