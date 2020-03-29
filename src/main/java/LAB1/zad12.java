package LAB1;

import java.util.Scanner;

public class zad12 {
    static public void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        int y = 0;
        float wynik;
        
        System.out.println("Podaj X: ");
        x = sc.nextInt();
        
        while (x < 0)
        {
            System.out.println("Podaj X > 0: ");
            x = sc.nextInt();    
        }
        
        System.out.println("Podaj Y: ");
        y = sc.nextInt();
        
        while (y < 0)
        {
            System.out.println("Podaj Y > 0: ");
            y = sc.nextInt();    
        }
        
        wynik = podzielnosc(x,y);
        
        if(wynik == 0)
        {
            System.out.println("X dzieli sie przez Y.");
        }
        else
        {
            System.out.println("X nie dzieli sie przez Y.");
        }
    
    
    }
    
    public static int podzielnosc(int x,int y){
        
        return x%y;
    
    }
    
}
