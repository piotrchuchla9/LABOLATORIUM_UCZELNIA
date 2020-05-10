package LAB9.Miesiace;

import LAB9.Wynagrodzenia.Wynagrodzenia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class mainMiesiace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Miesiace> miesiace = new ArrayList<>();
        miesiace.add(new Miesiace("Styczen", 31));
        miesiace.add(new Miesiace("Luty", 28));
        miesiace.add(new Miesiace("Marzec", 31));
        miesiace.add(new Miesiace("Kwiecien", 30));
        miesiace.add(new Miesiace("Maj", 31));
        miesiace.add(new Miesiace("Czerwiec", 30));
        miesiace.add(new Miesiace("Lipiec", 31));
        miesiace.add(new Miesiace("Sierpien", 31));
        miesiace.add(new Miesiace("Wrzesien", 30));
        miesiace.add(new Miesiace("Pazdziernik", 31));
        miesiace.add(new Miesiace("Listopad", 30));
        miesiace.add(new Miesiace("Grudzien", 31));

        Iterator<Miesiace> it = miesiace.iterator();
        int wybor;

        do {

            System.out.println("1. Wyswietl dni kazdego miesiaca");
            System.out.println("2. Pokaz liczbe dni dla podanego miesiaca");
            System.out.println("0. Koniec");

            wybor = sc.nextInt();

            if(wybor == 1){
                while(it.hasNext()){
                    System.out.println(it.next().toString());
                }
            }
            else if(wybor==2){
                System.out.print("Podaj miesiac: ");
                String miesiac = sc.next();
                miesiac = miesiac.substring(0,1).toUpperCase() + miesiac.substring(1).toLowerCase();
                for(int i = 0;i<miesiace.size();i++){
                    if(miesiac.equals(miesiace.get(i).nazwa)){
                        System.out.println(miesiace.get(i).dni);
                    }
                }
            }
        }while(wybor!=0);
    }
}
