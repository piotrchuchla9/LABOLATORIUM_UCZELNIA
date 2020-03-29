package LAB1;

import static java.lang.Math.*;
import java.util.Scanner;

public class zad7 {
    public static void main(String [] args){
        int a=0; a=aPar(a);
        int b=0; b=bPar(b);
        int c=0; c=cPar(c);
        float delta;
        float wynik0=0; double wynik1=0; double wynik2=0;
        
        delta = b*b - 4*a*c;
        System.out.println("Delta = " + delta);
        if(delta == 0)
        {
            wynik0 = (-1*b)/2*a;
            System.out.println("Dla delty = 0 rozwi�zanie to: " + wynik0);
        }
        else if(delta < 0)
        {
            System.out.println("Brak rozwiazan w zbiorze liczb rzeczywistych.");
        }
        else if(delta > 0)
        {
            wynik1 = (-b - sqrt(delta))/(2*a);
            wynik2 = (-b + sqrt(delta))/(2*a);
            System.out.println("Rozwiazania to: x1= " + wynik1 + " i x2= "+ wynik2);
        }
    }
    
    static int aPar(int a){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj parametr a: ");
        a =sc.nextInt();
        while(a==0){
            System.out.println("podaj a inne niz 0: ");
            a = sc.nextInt();
        }
        return a;
    }
    
    static int bPar(int b){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj parametr b: ");
        b = sc.nextInt();
        return b;
    }
    
    static int cPar(int c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj parametr c: ");
        c = sc.nextInt();
        return c;
    
    }
    
}
