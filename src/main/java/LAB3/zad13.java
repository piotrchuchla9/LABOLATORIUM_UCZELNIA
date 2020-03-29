package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar macierzy: ");
        int rozmiar = sc.nextInt();
        
        int matrix[][] = new int[rozmiar][rozmiar];
        
        for(int i = 0;i<rozmiar;i++){
            for(int j = 0;j<rozmiar;j++){
                if(i==j){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
        
        System.out.println("\nMacierz jednostkowa: ");
        for (int[] wiersz : matrix){
        System.out.println(Arrays.toString(wiersz));
        }
    }
}
