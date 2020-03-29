package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy w macierzy: ");
        int w = sc.nextInt();
        System.out.println("Podaj liczbe kolumn w macierzy: ");
        int k = sc.nextInt();

        System.out.println("Macierz: ");
        float matrix[][] = new float[w][k];
        
        for(int i = 0;i<=(w-1);i++){
            for(int j = 0;j<=(k-1);j++){
                System.out.println("Wiersz: " + i + ", Kolumna: " + j);
                matrix[i][j] = sc.nextFloat();
            }
        }
        
        float matrixT[][]=new float[k][w];
        
        for(int i = 0;i<w;i++){
            for(int j = 0;j<k;j++){
                matrixT[j][i] = matrix[i][j];
            }
        }
        System.out.println("\nMacierz: ");
        for (float[] wiersz : matrix){
        System.out.println(Arrays.toString(wiersz));
        }
        
        System.out.println("\nMacierz Transponowana: ");
        for (float[] wiersz : matrixT){
        System.out.println(Arrays.toString(wiersz));
        }
    }
}
