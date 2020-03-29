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
public class zad4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float a;
        float b;
    
        System.out.println("Podaj a: ");
        a = sc.nextFloat();
        
        System.out.println("Podaj b: ");
        b = sc.nextFloat();
        
        System.out.println("Suma a i b to: " + (a+b));
        System.out.println("R�nica a i b to: " + (a-b));
        System.out.println("Iloczyn a i b to: " + (a*b));
        System.out.println("Iloraz a i b to: " + (a/b));
        
    }
}
