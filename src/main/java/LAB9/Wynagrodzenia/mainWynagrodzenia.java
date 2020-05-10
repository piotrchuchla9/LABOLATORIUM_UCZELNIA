package LAB9.Wynagrodzenia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class mainWynagrodzenia {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Wynagrodzenia> pensje = new ArrayList<>();
        pensje.add(new Wynagrodzenia("Chuchla", 5001));
        pensje.add(new Wynagrodzenia("Nowak", 3200));
        pensje.add(new Wynagrodzenia("Kowalski", 4100));
        pensje.add(new Wynagrodzenia("Wojtowicz", 9500));
        pensje.add(new Wynagrodzenia("Baran", 2900));

        int wybor;

        do {
            System.out.println("1. Wyswietl informacje o stawce osob");
            System.out.println("2. Wyswietl instniejace stawki");
            System.out.println("3. Znajdz pensje podanej osoby");
            System.out.println("0. Koniec");

            Iterator<Wynagrodzenia> it = pensje.iterator();

            wybor = sc.nextInt();

            if(wybor == 1) {
                while (it.hasNext()) {
                    System.out.println(it.next().toString());
                }
            }
            else if(wybor == 2){
                while (it.hasNext()){
                    System.out.print(it.next().pensja + " \n");
                }
            }
            else if(wybor == 3){
                System.out.print("Podaj nazwisko: ");
                String nazwisko = sc.next();
                nazwisko = nazwisko.substring(0,1).toUpperCase() + nazwisko.substring(1).toLowerCase();
                for(int i = 0;i<pensje.size();i++){
                    if(nazwisko.equals(pensje.get(i).nazwisko)){
                        System.out.println(pensje.get(i).pensja);
                    }
                }
            }
        }while(wybor!=0);
    }
}
