package LAB2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main (String [] args){
    
}
    public int zad1(int x, int sum){
    
        
        Scanner sc = new Scanner(System.in);
        sum = 0;
        
        do{
            System.out.println("Podaj x: ");
            x = sc.nextInt();
            sum += x;
        }while(x != 0);
        
    return sum;
        
    }
    
}
