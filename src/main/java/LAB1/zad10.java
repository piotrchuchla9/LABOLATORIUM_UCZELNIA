package LAB1;

import static java.lang.Math.*;
import java.util.Scanner;

public class zad10 {
    public static void main(String [] args){
        
        System.out.println("Podaj x: ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        
        System.out.println("Signum x to: " + calc(x));
    }
    
    public static float calc(float x){
        
        x = signum(x);
        return x;
    }
}
