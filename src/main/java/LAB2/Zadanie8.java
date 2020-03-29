package LAB2;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args){

    }
    
    public int count(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj litery: ");
        boolean bool = true;
        int x = 0;
        char smth;
        do{
            smth = sc.next().charAt(0);
            if(Character.isUpperCase(smth)){
                x++;
            }
        }while(Character.isLetter(smth));
        return x;
    }
}
