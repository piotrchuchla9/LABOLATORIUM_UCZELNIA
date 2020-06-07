package Wyklad_Java.zad5_2;

public class main {
    public static void main(String[] args) {

        Singleton x = Singleton.Singleton();
        Singleton y = Singleton.Singleton();

        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(x.c + "\n");

        System.out.print(y.a);
        System.out.print(" " + y.b);
        System.out.print(" " + y.c + "\n");

        System.out.println("\n" + y.a);
        System.out.println(x.c);
        System.out.println(y.b);

    }
}
