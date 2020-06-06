package Wyklad_Java.zad3;

import java.util.Scanner;

import static Wyklad_Java.zad3.KsiazkiNaukowe.ksiazki;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ksiazki.add(new KsiazkiNaukowe("Chlopaki z marsa", 321));
        ksiazki.add(new KsiazkiNaukowe("Dar gniewu", 265));
        ksiazki.add(new KsiazkiNaukowe("Polscy szpiedzy 2", 411));
        ksiazki.add(new KsiazkiNaukowe("Krotka historia czasu", 499));
        ksiazki.add(new KsiazkiNaukowe("Dlaczego spimy", 290));

        int wybor;

        do{
            System.out.println("---MENU---");
            System.out.println("1. Pokaz ksiazki");
            System.out.println("2. Sortuj wedlug ilosci stron rosnaco");
            System.out.println("3. Sortuj wedlug ilosci stron malejaco");
            System.out.println("0. Wyjscie");
            wybor = sc.nextInt();
            KsiazkiNaukowe ks = new KsiazkiNaukowe();

            if(wybor == 1){
                for(int i = 0;i<ksiazki.size();i++){
                    ksiazki.get(i).pokazDane();
                }
            }
            else if(wybor == 2){
                ks.sortowanieNiemalejace();
            }
            else if(wybor == 3){
                ks.sortowanieNierosnace();
            }
            System.out.println();
        }while(wybor != 0);
    }
}
