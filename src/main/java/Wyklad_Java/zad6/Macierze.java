package Wyklad_Java.zad6;

import java.util.Arrays;

public class Macierze {

    private static int suma;

    private static Integer[][] macierz1 = {{2, 0, 9}, {5, 1, 23}, {14, 0, 3}};
    private static Integer[][] macierz2 = {{5, 8, 11}, {3, 5, 12}, {4, 1, 0}};
    private static Integer[][] macierzMnozona = new Integer[3][3];
    private static Integer[][] macierzTransponowana = new Integer[3][3];

    public <T> String mnozenie(){
        for(int i = 0; i<3; i++){
            suma = 0;
            for(int j = 0; j<3; j++){
                suma = 0;
                for(int l = 0; l<3;l++){
                    suma += macierz1[i][l] * macierz2[l][j];
                }
                macierzMnozona[i][j] = suma;
            }
        }
        String macierz = "";
        for (Integer[] wiersz : macierzMnozona){
            macierz += Arrays.toString(wiersz) + "\n";
        }
        return macierz;
    }

    public <T> String transponowanie(){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                macierzTransponowana[j][i] = macierz1[i][j];
            }
        }
        String macierz = "";
        for (Integer[] wiersz : macierzTransponowana){
            macierz += Arrays.toString(wiersz) + "\n";
        }
        return macierz;
    }

}
