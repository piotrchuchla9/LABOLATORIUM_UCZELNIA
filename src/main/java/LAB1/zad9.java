package LAB1;

import static java.lang.Math.*;
import java.util.Scanner;

public class zad9 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        double podatek = 0;
        double podstawa = 0;
        
        System.out.println("Podstawa: ");
        podstawa = sc.nextDouble();
        
        if(podstawa <= 85528)
        {
            podatek = lessTax(podstawa,podatek);
            System.out.println("Podatek mniejszy to: " + podatek);
        }
        else if(podstawa > 85528)
        {
            podatek = biggerTax(podstawa,podatek);
            System.out.println("Podatek wiekszy to: " + podatek);
        }
    
    }
    
    public static double lessTax(double podstawa,double podatek){
        
        podatek = (0.18 * podstawa) - 556.02;
        return podatek;
    
    }
    
    public static double biggerTax(double podstawa,double podatek){
        
        double over = 0;
        over = podstawa - 85528;
        podatek = 14839 + (0.32 * over);
        return podatek;
    
    } 
}
