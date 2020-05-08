package LAB9.Osoby;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class mainOsoby {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;

        ArrayList<Osoby> daneOsoby = new ArrayList<>();
        daneOsoby.add(new Osoby("Piotr", "Chuchla", 21, 180, 73));
        daneOsoby.add(new Osoby("Mirek", "Nowak", 42, 165, 80));
        daneOsoby.add(new Osoby("Antoni", "Krawczyk", 80, 170, 65));
        daneOsoby.add(new Osoby("Damian", "Brzoza", 11, 154, 44));
        daneOsoby.add(new Osoby("Marcin", "Majkut", 25, 177, 90));

        int wybor;

        do {

            System.out.println("1. Wyszukaj osobe po wpisaniu danych");
            System.out.println("2. Wyszukaj osobe po najmniejszym lub najwiekszym kryterium");
            System.out.println("3. Posortuj osoby według kryteriów");
            System.out.println("0. Koniec");

            wybor = sc.nextInt();
            if(wybor==1) {
                System.out.println("1. Nazwisko");
                System.out.println("2. Wiek");
                System.out.println("3. Wzrost");
                System.out.println("4. Waga");

                wybor = sc.nextInt();
                if (wybor == 1) {
                    System.out.print("Podaj nazwisko: ");
                    String nazwisko = sc.next();
                    for (i = 0; i < daneOsoby.size(); i++) {
                        if (daneOsoby.get(i).nazwisko.equals(nazwisko)) {
                            System.out.println(daneOsoby.get(i).imie + " " + daneOsoby.get(i).nazwisko + "    wiek: " + daneOsoby.get(i).wiek +
                                    "   wzrost: " + daneOsoby.get(i).wzrost + "   waga: " + daneOsoby.get(i).waga + "\n");
                        }
                    }
                } else if (wybor == 2) {
                    System.out.print("Podaj wiek: ");
                    int wiek = sc.nextInt();
                    for (i = 0; i < daneOsoby.size(); i++) {
                        if (daneOsoby.get(i).wiek == wiek) {
                            System.out.println(daneOsoby.get(i).imie + " " + daneOsoby.get(i).nazwisko + "    wiek: " + daneOsoby.get(i).wiek +
                                    "   wzrost: " + daneOsoby.get(i).wzrost + "   waga: " + daneOsoby.get(i).waga + "\n");
                        }
                    }
                } else if (wybor == 3) {
                    System.out.print("Podaj wzrost: ");
                    int wzrost = sc.nextInt();
                    for (i = 0; i < daneOsoby.size(); i++) {
                        if (daneOsoby.get(i).wzrost == wzrost) {
                            System.out.println(daneOsoby.get(i).imie + " " + daneOsoby.get(i).nazwisko + "    wiek: " + daneOsoby.get(i).wiek +
                                    "   wzrost: " + daneOsoby.get(i).wzrost + "   waga: " + daneOsoby.get(i).waga + "\n");
                        }
                    }
                } else if (wybor == 4) {
                    System.out.print("Podaj wage: ");
                    int waga = sc.nextInt();
                    for (i = 0; i < daneOsoby.size(); i++) {
                        if (daneOsoby.get(i).waga == waga) {
                            System.out.println(daneOsoby.get(i).imie + " " + daneOsoby.get(i).nazwisko + "    wiek: " + daneOsoby.get(i).wiek +
                                    "   wzrost: " + daneOsoby.get(i).wzrost + "   waga: " + daneOsoby.get(i).waga + "\n");
                        }
                    }
                }
            }
            else if(wybor==2){
                System.out.println("1. Wyszukaj osobe najstarsza");
                System.out.println("2. Wyszukaj osobe najwyzsza");
                System.out.println("3. Wyszukaj osobe najciezsza");
                System.out.println("4. Wyszukaj osobe najmlodsza");
                System.out.println("5. Wyszukaj osobe najmniejsza");
                System.out.println("6. Wyszukaj osobe najlzejsza");
                wybor = sc.nextInt();

                if(wybor == 1){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o1.wiek).compareTo(o2.wiek);
                        }
                    });
                    System.out.println("Osoba najstarsza: ");
                    System.out.println(daneOsoby.get(0).imie + " " + daneOsoby.get(0).nazwisko + "    wiek: " + daneOsoby.get(0).wiek +
                            "   wzrost: " + daneOsoby.get(0).wzrost + "   waga: " + daneOsoby.get(0).waga + "\n");
                }
                else if(wybor == 2){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o1.wzrost).compareTo(o2.wzrost);
                        }
                    });
                    System.out.println("Osoba najwyzsza: ");
                    System.out.println(daneOsoby.get(0).imie + " " + daneOsoby.get(0).nazwisko + "    wiek: " + daneOsoby.get(0).wiek +
                            "   wzrost: " + daneOsoby.get(0).wzrost + "   waga: " + daneOsoby.get(0).waga + "\n");
                }
                else if(wybor == 3){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o1.waga).compareTo(o2.waga);
                        }
                    });
                    System.out.println("Osoba najciezsza: ");
                    System.out.println(daneOsoby.get(0).imie + " " + daneOsoby.get(0).nazwisko + "    wiek: " + daneOsoby.get(0).wiek +
                            "   wzrost: " + daneOsoby.get(0).wzrost + "   waga: " + daneOsoby.get(0).waga + "\n");
                }
                else if(wybor == 4){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o2.wiek).compareTo(o1.wiek);
                        }
                    });
                    System.out.println("Osoba najmlodsza: ");
                    System.out.println(daneOsoby.get(0).imie + " " + daneOsoby.get(0).nazwisko + "    wiek: " + daneOsoby.get(0).wiek +
                            "   wzrost: " + daneOsoby.get(0).wzrost + "   waga: " + daneOsoby.get(0).waga + "\n");
                }
                else if(wybor == 5){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o2.wzrost).compareTo(o1.wzrost);
                        }
                    });
                    System.out.println("Osoba najnizsza: ");
                    System.out.println(daneOsoby.get(0).imie + " " + daneOsoby.get(0).nazwisko + "    wiek: " + daneOsoby.get(0).wiek +
                            "   wzrost: " + daneOsoby.get(0).wzrost + "   waga: " + daneOsoby.get(0).waga + "\n");
                }
                else if(wybor == 6){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o2.waga).compareTo(o1.waga);
                        }
                    });
                    System.out.println("Osoba najlzejsza: ");
                    System.out.println(daneOsoby.get(0).imie + " " + daneOsoby.get(0).nazwisko + "    wiek: " + daneOsoby.get(0).wiek +
                            "   wzrost: " + daneOsoby.get(0).wzrost + "   waga: " + daneOsoby.get(0).waga + "\n");
                }
            }
            else if(wybor == 3){
                System.out.println("1. Sortuj wedlug wieku");
                System.out.println("2. Sortuj wedlug wzrostu");
                System.out.println("3. Sortuj wedlug wagi");
                wybor = sc.nextInt();

                if(wybor == 1){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o2.wiek).compareTo(o1.wiek);
                        }
                    });
                    for(i = 0;i<daneOsoby.size();i++){
                        System.out.println(daneOsoby.get(i).imie + " " + daneOsoby.get(i).nazwisko + "    wiek: " + daneOsoby.get(i).wiek +
                                "   wzrost: " + daneOsoby.get(i).wzrost + "   waga: " + daneOsoby.get(i).waga + "\n");
                    }
                }
                else if(wybor == 2){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o2.wzrost).compareTo(o1.wzrost);
                        }
                    });
                    for(i = 0;i<daneOsoby.size();i++){
                        System.out.println(daneOsoby.get(i).imie + " " + daneOsoby.get(i).nazwisko + "    wiek: " + daneOsoby.get(i).wiek +
                                "   wzrost: " + daneOsoby.get(i).wzrost + "   waga: " + daneOsoby.get(i).waga + "\n");
                    }
                }
                else if(wybor == 3){
                    Collections.sort(daneOsoby, new Comparator<Osoby>() {
                        @Override
                        public int compare(Osoby o2, Osoby o1) {
                            return Integer.valueOf(o2.waga).compareTo(o1.waga);
                        }
                    });
                    for(i = 0;i<daneOsoby.size();i++){
                        System.out.println(daneOsoby.get(i).imie + " " + daneOsoby.get(i).nazwisko + "    wiek: " + daneOsoby.get(i).wiek +
                                "   wzrost: " + daneOsoby.get(i).wzrost + "   waga: " + daneOsoby.get(i).waga + "\n");
                    }
                }
            }

        }while(wybor!=0);
    }
}