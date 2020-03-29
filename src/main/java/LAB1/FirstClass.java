package LAB1;


import java.util.Scanner;

public class FirstClass {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        int a1;
        
        //System.out.println("Podaj wartosc typu int: ");
        //a1 = sc.nextInt();
        
        float b1;
        //b1 = sc.nextFloat();
        
        System.out.println("Wprowadz tresc: ");
        char as;
        as = sc.next().charAt(1);
        System.out.println(as);
        
        int j=6;
        int a=5;
        float b=7.8f;
        
        
        //System.out.println("zmienna typu int a+b wynosi: " + (a+b));
        
        FirstClass objec1 = new FirstClass();
        
        //System.out.println("a wynosi: " + objec1.addTwoVeriables(a));
        //System.out.println(a);
    }
    
    public float addTwoVeriables(int A){
       
        A = A + 5;
        System.out.println(A);
        return A;
    }
    
}
