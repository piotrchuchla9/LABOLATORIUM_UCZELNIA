package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class zad9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy w macierzy: ");
        int w = sc.nextInt();
        System.out.println("Podaj liczbe kolumn w macierzy: ");
        int k = sc.nextInt();

        System.out.println("Macierz1: ");
        float matrix1[][] = new float[w][k];
        
        for(int i = 0;i<=(w-1);i++){
            for(int j = 0;j<=(k-1);j++){
                System.out.println("Wiersz: " + i + ", Kolumna: " + j);
                matrix1[i][j] = sc.nextFloat();
            }
        }
        
        float matrix2[][] = new float[w][k];
        System.out.println("Macierz2: ");
        for(int i = 0;i<=(w-1);i++){
            for(int j = 0;j<=(k-1);j++){
                System.out.println("Wiersz: " + i + ", Kolumna: " + j);
                matrix2[i][j] = sc.nextFloat();
            }
        }
        
        float sumMatrix[][] = new float[w][k];
        
        System.out.println("Macierz1: ");
        for (float[] wiersz : matrix1){
            System.out.println(Arrays.toString(wiersz));
        }
        
        System.out.println("Macierz2: ");
        for (float[] wiersz : matrix2){
            System.out.println(Arrays.toString(wiersz));
        }

        for(int i = 0;i<=(w-1);i++){
            for(int j = 0;j<=(k-1);j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("------------SUMA MACIERZY----------------");
        for (float[] wiersz : sumMatrix){
            System.out.println(Arrays.toString(wiersz));
        }   
    }
}