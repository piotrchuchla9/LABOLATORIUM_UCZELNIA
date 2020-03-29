package LAB1;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer miesiaca: ");
        int x = sc.nextInt();
        System.out.println(x + " miesiac ma " + konwert(x) + " dni.");
        
    
    }
    
    public static int konwert(int x){
        
        int[] miesiace = new int[13];
        
        miesiace[0] = 0;
        miesiace[1] = 31;
        miesiace[2] = 28;
        miesiace[3] = 31;
        miesiace[4] = 30;
        miesiace[5] = 31;
        miesiace[6] = 30;
        miesiace[7] = 31;
        miesiace[8] = 31;
        miesiace[9] = 30;
        miesiace[10] = 31;
        miesiace[11] = 30;
        miesiace[12] = 31;
        
        return miesiace[x];
    }
}
