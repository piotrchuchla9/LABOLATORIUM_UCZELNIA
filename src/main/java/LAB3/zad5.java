
package LAB3;

import java.util.Scanner;

public class zad5 {
    
    public static void main(String[] args){
        zad5 avg = new zad5();
        
        System.out.println("Srednia to: " + avg.avarage());
        
        
    }
    
    public double avarage(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablicy: ");        
        int n = sc.nextInt();
        int i;
        float tab[] = new float[n];
        float sum = 0;
        for(i = 0;i<tab.length;i++){
            System.out.println(i+1 + "/"+ n + "    Podaj liczbe: ");
            tab[i] = sc.nextInt();
        }
        
        for(i=0;i<tab.length;i++){
            sum += tab[i];
        }
        
        float avarage = sum/i;
        
        return avarage;
    }
}
