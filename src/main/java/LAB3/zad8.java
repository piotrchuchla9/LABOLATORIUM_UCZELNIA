package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class zad8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy w macierzy: ");
        int w = sc.nextInt();
        System.out.println("Podaj liczbe kolumn w macierzy: ");
        int k = sc.nextInt();
        
        float matrix[][] = new float[w][k];
        
        for(int i = 0;i<=(w-1);i++){
            for(int j = 0;j<=(k-1);j++){
                System.out.println("Wiersz: " + i + ", Kolumna: " + j);
                matrix[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Macierz: ");
        for (float[] wiersz : matrix){
            System.out.println(Arrays.toString(wiersz));
        }
    }
}