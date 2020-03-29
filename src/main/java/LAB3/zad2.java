
package LAB3;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablicy: ");
        int n = sc.nextInt();
        int tab[] = new int[n];
        int count = 0;
        
        for(int i = 0;i<tab.length;i++){
            System.out.println(i+1 + "/"+ n + "    Podaj liczbe: ");
            tab[i] = sc.nextInt();
            if(tab[i]%3==0 && tab[i]%2!=0){
                count++;
            }
        }
        System.out.println("Liczb spelniajacych warunki jest: " + count);
        
    }
    
}
