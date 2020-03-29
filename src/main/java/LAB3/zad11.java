package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class zad11 {
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
        System.out.println("\nMacierz1: ");
        for (float[] wiersz : matrix1){
        System.out.println(Arrays.toString(wiersz));
        }
        
        float matrix2[][] = new float[w][k];
        System.out.println("\nMacierz2: ");
        for(int i = 0;i<=(w-1);i++){
            for(int j = 0;j<=(k-1);j++){
                System.out.println("Wiersz: " + i + ", Kolumna: " + j);
                matrix2[i][j] = sc.nextFloat();
            }
        }
        System.out.println("\nMacierz2: ");
        for (float[] wiersz : matrix2){
        System.out.println(Arrays.toString(wiersz));
        }
        
        float sum = 0;
        
        float multiplyMatrix[][] = new float[w][k];
        
        for(int i = 0;i<w;i++){
            sum=0;
            for(int j = 0;j<k;j++){
                sum=0;
                for(int l = 0; l<k;l++){
                    sum += matrix1[i][l] * matrix2[l][j]; 
                }
                multiplyMatrix[i][j] = sum;

            }
        }
        System.out.println("\n---------ILOCZYN MACIERZY------------");
        for (float[] wiersz : multiplyMatrix){
        System.out.println(Arrays.toString(wiersz));
        }
        
        
    }
}
