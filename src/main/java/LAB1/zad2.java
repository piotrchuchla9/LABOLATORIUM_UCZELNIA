
package LAB1;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
    
        System.out.println("Podaj a: ");
        a = sc.nextInt();
        
        System.out.println("Podaj b: ");
        b = sc.nextInt();
        
        System.out.println("Suma a i b to: " + (a+b));
        System.out.println("R�nica a i b to: " + (a-b));
        System.out.println("Iloczyn a i b to: " + (a*b));
        System.out.println("Iloraz a i b to: " + (a/b));
    
    }
    
}
