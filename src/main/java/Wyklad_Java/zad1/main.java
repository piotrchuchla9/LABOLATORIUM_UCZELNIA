package Wyklad_Java.zad1;

import java.util.Scanner;

public class main {
    private static Samochod[] samochod = new Samochod[3];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int wybor;
        int wybor_mocy;

        Samochod auto = new Samochod();

        samochod[0] = new Samochod("Nissan", 1998, 87);
        samochod[1] = new Samochod("Honda", 2010, 100);
        samochod[2] = new Samochod("Lexus", 2016, 250);

        do {
        System.out.println("----MENU----");
        System.out.println("\nCo chcesz zrobic?");
        System.out.println("1. Pokaz dane wszystich samochodow");
        System.out.println("2. Zwieksz moc danego samochodu");
        System.out.println("0. Koniec");

        wybor = sc.nextInt();

            if (wybor == 1) {
                for (int i = 0; i < samochod.length; i++) {
                    samochod[i].dane();
                }
            } else if (wybor == 2) {
                System.out.println("Wybierz samochod: ");
                System.out.println("1. Nissan");
                System.out.println("2. Honda");
                System.out.println("3. Lexus");

                wybor = sc.nextInt();

                if (wybor == 1) {
                    auto.print_moc();
                    wybor_mocy = sc.nextInt();
                    if (wybor_mocy == 1) {
                        zmien_moc(wybor, wybor_mocy);
                    } else if (wybor_mocy == 2) {
                        zmien_moc(wybor, wybor_mocy);
                    } else if (wybor_mocy == 3) {
                        zmien_moc(wybor, wybor_mocy);
                    }
                } else if (wybor == 2) {
                    auto.print_moc();
                    wybor_mocy = sc.nextInt();
                    if (wybor_mocy == 1) {
                        zmien_moc(wybor, wybor_mocy);
                    } else if (wybor_mocy == 2) {
                        zmien_moc(wybor, wybor_mocy);
                    } else if (wybor_mocy == 3) {
                        zmien_moc(wybor, wybor_mocy);
                    }
                } else if (wybor == 3) {
                    auto.print_moc();
                    wybor_mocy = sc.nextInt();
                    if (wybor_mocy == 1) {
                        zmien_moc(wybor, wybor_mocy);
                    } else if (wybor_mocy == 2) {
                        zmien_moc(wybor, wybor_mocy);
                    } else if (wybor_mocy == 3) {
                        zmien_moc(wybor, wybor_mocy);
                    }
                }
            }
        } while (wybor != 0);
    }


    private static void zmien_moc(int wybor, int wybor_mocy) {
        wybor = wybor - 1;

        System.out.println("\nPoprzednio: ");
        samochod[wybor].dane();
        System.out.println();
        samochod[wybor].zwieksz_moc(wybor_mocy);
        System.out.println("Teraz: ");
        samochod[wybor].dane();
    }
}