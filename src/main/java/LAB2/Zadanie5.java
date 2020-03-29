
package LAB2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args){
        
    }
    public float aX (int x){
        System.out.println("Podaj x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int a=1;
        float sum = 0;
        if(x==0){
            sum = 2;
        }
        else if(x<0){
            System.out.println("error");
        }
        else if(x>0){
            sum = a*(x-1)+3*x;
        }
        return sum;
    }
    public float bX (int x){
        System.out.println("Podaj x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int b = 1;
        float sum = 0;
        if(x==0){
            sum = 1;
        }
        else if(x==1){
            sum = 3;
        }
        else if(x>1){
            sum = 2*b*(x-1)+3*b*(x-2);
        }
        return sum;
    }
    
}
