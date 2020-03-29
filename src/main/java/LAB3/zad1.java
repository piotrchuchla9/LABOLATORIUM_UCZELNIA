
package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args){
        
        char tablica[] = new char[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyrazy: ");
        int i;
        for(i = 0;i<tablica.length;i++){
            tablica[i] = sc.next().charAt(0);
        }
        System.out.println("Tablica: " + Arrays.toString(tablica));
        
        
    }
    
}
