package LAB5.Czytelnik;

import java.util.Scanner;

public class CzytelnikEkstra extends Czytelnik {

    public static void moreInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer karty czytelnika: ");
        int id = sc.nextInt();
        boolean idExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (id == libraryID[i]) {
                System.out.println("Nazwisko: " + surnames[i].toString() + "\tImię: " + names[i].toString() +
                        "\tWypożyczone książki: " + borrowedBooks[i] + "\tWypożyczone czasopisma: " + borrowedMagazines[i]);
                idExsists = true;
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru karty czytelnika.");
        }
    }

    public static void borrowMoreMagazines() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer karty czytelnika: ");
        int id = sc.nextInt();
        boolean idExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (id == libraryID[i]) {
                System.out.println("Podaj ilosc kolejnych wypozyczonych czasopism: ");
                int nextOnes = sc.nextInt();
                if (nextOnes + borrowedMagazines[i] < 6) {
                    borrowedMagazines[i] += nextOnes;
                    System.out.println("Czytelnik: " + surnames[i] + " " + names[i] + " od teraz wypozycza: " +
                            borrowedMagazines[i] + " czasopism.");
                    idExsists = true;
                } else {
                    System.out.println("Czytelnik: " + surnames[i].toString() + "\t" + names[i].toString() + "\tID " + libraryID[i] +
                            "\tnie może wypożyczyć aż tylu czasopism (maksymalnie: 5/obecnie: " + borrowedMagazines[i] + ").");
                    idExsists = true;
                }
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru karty czytelnika.");
        }
    }

    public static void giveMagazinesBack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer karty czytelnika: ");
        int id = sc.nextInt();
        boolean idExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (id == libraryID[i]) {
                System.out.println("Podaj ilosc magazynow do oddania: ");
                int magazines = sc.nextInt();
                if ((borrowedMagazines[i] - magazines) >= 0) {
                    borrowedMagazines[i] = borrowedMagazines[i] - magazines;
                    System.out.println("Czytelnik: " + surnames[i].toString() + "\t" + names[i].toString() +
                            "\tID: " + libraryID[i] + "\tobecnie wypożyczył: " + borrowedMagazines[i] + " magazynow.");
                    idExsists = true;
                } else {
                    System.out.println("Nie można oddać więcej magazynow niż się wypożyczyło.");
                    idExsists = true;
                }
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru karty czytelnika.");
        }
    }
}
