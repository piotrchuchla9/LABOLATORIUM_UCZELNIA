package LAB2;

import java.util.Scanner;

public class Main {
    
    public static void main (String [] args){

        System.out.println("Podaj numer zadania: ");        
        int choose;
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();
        
        if (choose == 1){
            System.out.println("Zadanie 1");
            Zadanie1 zd1 = new Zadanie1();
            int x = 0,sum = 0;
            System.out.println("Wynik = " + zd1.zad1(x  , sum));
        }
        else if(choose == 2){
            
            System.out.println("Zadanie 2");
            Zadanie2 zd2 = new Zadanie2();
            int n = 0; int sum = 0;
            System.out.println("Rekurencyjnie: " + zd2.rekur(n));
            System.out.println("Iteracyjnie: " + zd2.iter(n, sum));
            
        }
        else if(choose == 3){
            
            System.out.println("Zadanie 3");
            Zadanie3 zd3 = new Zadanie3();
            int n;
            System.out.println("Podaj silnie: ");
            n = sc.nextInt();
            System.out.println("Rekurencyjnie: " + n + "! = " + zd3.rekur(n));
            System.out.println("Iteracyjnie: " + n + "! = " + zd3.iter(n));

        }
        else if (choose == 4){
            System.out.println("Zadanie 4");
            Zadanie4 zd4 = new Zadanie4();
            System.out.println("Szereg 1 = " + zd4.szereg1());
            System.out.println("Szereg 2 = " + zd4.szereg2());
            System.out.println("Szereg 3 = " + zd4.szereg3());
            System.out.println("Szereg 4 = " + zd4.szereg4());
        }
        else if (choose == 5){
            System.out.println("Zadanie 5");
            Zadanie5 zd5 = new Zadanie5();
            int x = 0;
            System.out.println("a(x) = " + zd5.aX(x));
            System.out.println("b(x) = " + zd5.bX(x));
        }
        else if(choose == 6){
            System.out.println("Zadnie 6");
            Zadanie6 zd6 = new Zadanie6();
            int x = 0;
            System.out.println("Najwieksza liczba to: " + zd6.min(x));
        }
        else if(choose == 7){
            System.out.println("Zadanie 7");
            Zadanie7 zd7 = new Zadanie7();
            System.out.println("Liczb z tego przedzialu jest: " + zd7.numbers());
        }
        else if(choose == 8){
            System.out.println("Zadanie 8");
            Zadanie8 zd8 = new Zadanie8();
            System.out.println("Duzych liter jest: " + zd8.count());
        }
    }
    
}
