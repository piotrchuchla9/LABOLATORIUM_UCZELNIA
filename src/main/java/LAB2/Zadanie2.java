package LAB2;

import static java.lang.StrictMath.*;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String [] args){
    
    }
    
    public double rekur(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj potege n: ");
        n = sc.nextInt();
        return(pow(2,n));
    }
    public double iter(int n,int sum){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj potege n: ");
        n = sc.nextInt();
        
        for(int i = 1;i<=n;i++){
            if(i==1){
                sum = 2;
            }
            else if(i==0){
                sum = 1;
            }
            else{
                sum*=2;
            }
        }
        return sum;
    }
    
}
