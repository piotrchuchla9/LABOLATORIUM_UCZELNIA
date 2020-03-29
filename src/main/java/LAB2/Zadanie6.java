package LAB2;
import java.util.*;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args){
        
    }
    public float min(float x){
        
        float numbers[] = new float[10];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<10;i++){
            System.out.println("Podaj liczbe: ");
            x = sc.nextFloat();
            numbers[i] = x;
        }
        Arrays.sort(numbers);
        x = numbers[numbers.length-1];
        return x;
    }
}
