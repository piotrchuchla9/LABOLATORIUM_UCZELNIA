package Wyklad_Java.zad5_1;

public class Operacje {

    static {
        System.out.println("Zainicjowano klase: 'Operacje'");
        System.out.println("Tutaj sa przechowywane metody najprostszych operacji matematycznych\n");
    }

    public int dodawanie(int a, int b){
        return a + b;
    }

    public int mnozenie(int a, int b){
        return a * b;
    }

    public int odejmowanie(int a, int b){
        return a - b;
    }

}