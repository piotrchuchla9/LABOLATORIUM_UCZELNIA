/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author Piotrek
 */
public class zad6 {
    
    public static void main(String [] args){
    
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = x%2;
        float z = x%5;
        if (x<0)
        {
            int b = -x;
            float c = -x;
            System.out.println("Wartosc bezwzgledna z x to: " + b);
            System.out.println("Czesc calkowita z dzielenia x przez 2 to: " + b%2);
            System.out.println("Reszta z dzielenia x przez 5 to: " + c%5);
        }
        else if(x == 0)
        {
            System.out.println("Wartosc bezwzgledna z x to: 0");
            System.out.println("Czesc calkowita z dzielenia x przez 2 to: " + y);
            System.out.println("Reszta z dzielenia x przez 5 to: " + z);
        }
        else if(x>0)
        {
            System.out.println("Wartosc bezwzgledna z x to: " + x);
            System.out.println("Czesc calkowita z dzielenia x przez 2 to: " + y);
            System.out.println("Reszta z dzielenia x przez 5 to: " + z);
        }
        
        
    }
    
}
