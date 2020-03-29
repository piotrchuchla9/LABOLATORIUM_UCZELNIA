package LAB1;

import static java.lang.Math.*;
import java.util.Scanner;

public class zad11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj x: ");
        float x = sc.nextFloat();
        float wynik = 0;
        System.out.println("a(x)= " + aX(x,wynik));
        System.out.println("b(x)= " + bX(x,wynik));
        System.out.println("c(x)= " + cX(x,wynik));
        
    
    }
    
    public static float aX (float x, float wynik){
        
        if(x >= 0)
        {
            wynik = 2*x;
        }
        else
        {
            wynik = x/2;
        }
        return wynik;
    }
    
    public static float bX (float x, float wynik){
        
        if(x > 0)
        {
            wynik = (float) sin(x);
        }
        else if(x == 0)
        {
            wynik = x;
        }
        else
        {
            wynik = (float) cos(x);
        }
        return wynik;
    
    }
    
    public static float cX (float x, float wynik){
        float y = x-1;
        if(x > 0)
        {
            wynik =(float) sqrt(x+1);
        }
        else if(x == 0)
        {
            wynik = 0;
        }
        else
        {
            if(y < 0)
            {
                y = -y;
            }
        
            wynik =(float) sqrt(y);
            
        }
        return wynik;

    }
    
}
