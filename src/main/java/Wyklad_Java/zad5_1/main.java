package Wyklad_Java.zad5_1;

public class main {

    private final static int a = 5;
    private final static int b = 7;
    private final static int c = 2;
    private static int d;

    public static void main(String[] args) {

        Operacje operacje = new Operacje();

        System.out.println("Dodawanie");
        System.out.println("a + b = " + operacje.dodawanie(a,b));
        System.out.println();

        System.out.println("Mnozenie");
        System.out.println("a * b = " + operacje.mnozenie(a,b));
        System.out.println();

        System.out.println("Odejmowanie");
        System.out.println("a - b = " + operacje.odejmowanie(a,b));

        System.out.println("\n-----------");
        System.out.println("Potegowanie");
        System.out.println("a ^ c = " + potegowanie(a,c));
        System.out.println();

        System.out.println("Pierwiastkowanie");
        System.out.println("sqrt(d) = " + pierwiastkowanie(d));

    }

    private static int potegowanie(int a, int c){
        d = (int) Math.pow(a,c);
        return d;
    }

    private static  int pierwiastkowanie(int d){
        return (int )Math.sqrt(d);
    }
}