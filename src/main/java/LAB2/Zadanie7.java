package LAB2;

import java.util.Scanner;



public class Zadanie7 {
    public static void main(String[] args){
        
    }
    public int numbers(){
        Scanner sc = new Scanner(System.in);
        float tablica[] = new float [4];
        int length = 0;

        for(int i = 0;i<5;i++){
            System.out.println("Podaj liczbe: ");
            float x = sc.nextFloat();
            if(x>-1 && x<1){
                length++;
            }
        }
        return length;
    }
}
