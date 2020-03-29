package LAB3;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args){
        
        int i;
        float min = 0;
        float position = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablicy: ");
        int n = sc.nextInt();
        
        float tab[] = new float[n];
        
        for(i = 0;i<tab.length;i++){
            System.out.println(i+1 + "/"+ n + "    Podaj liczbe: ");
            tab[i] = sc.nextInt();
        }
        
        for(i=0;i<tab.length;i++){
            if(i==0){
                min=tab[i];
                position=i;
            }
            else{
                if(tab[i]<tab[i-1]){
                    min=tab[i];
                    position=i;
                }
            }
        }
        
        System.out.println("Min: " + min);
        System.out.println("Pozycja: " + (position+1) + " (w tablicy: " + position + ")");
        
        
    }
}
