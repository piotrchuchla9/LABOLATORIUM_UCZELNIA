package LAB4;

import java.util.Scanner;

public class Czytelnik {

    public static int tabLength = 10;
    public static String surnames[] = new String[tabLength];
    public static String names[] = new String[tabLength];
    public static int libraryID[] = new int[tabLength];
    public static int borrowedBooks[] = new int[tabLength];

    public static void add() {
        System.out.println("Dodaj dane: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabLength; i++) {
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj nazwisko: ");
            surnames[i] = sc.next();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj imie: ");
            names[i] = sc.next();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj numer karty czytelnika: ");
            libraryID[i] = sc.nextInt();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj ilosc wypozyczonych ksiazek: ");
            borrowedBooks[i] = sc.nextInt();
        }
    }

    public static void showByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer karty czytelnika: ");
        int id = sc.nextInt();
        boolean idExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (id == libraryID[i]) {
                System.out.println("Nazwisko: " + surnames[i].toString() + "\tImię: " + names[i].toString() +
                        "\tWypożyczone książki: " + borrowedBooks[i] + "\n");
                idExsists = true;
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru karty czytelnika.");
        }
    }

    public static void showAll() {
        for (int i = 0; i < tabLength; i++) {
            System.out.println((i + 1) + ".\t" + surnames[i].toString() + "\t" + names[i].toString() +
                    "\t\tID: " + libraryID[i] + "\tWypożyczone książki: " + borrowedBooks[i]);
        }
    }

    public static void showNoBorrowedBooks() {
        boolean allBorrowed = false;
        for (int i = 0; i < tabLength; i++) {
            if (borrowedBooks[i] == 0) {
                System.out.println("Żadnej książki nie wypożyczył czytelnik: " + surnames[i].toString() + " "
                        + names[i].toString() + "\tID: " + libraryID[i] + "\n");
                allBorrowed = true;
            }
        }
        if (allBorrowed == false) {
            System.out.println("Każdy wypożyczył conajmniej 1 książkę.");
        }
    }

    public static void borrowMoreBooksLessThan11() {
        boolean idExsists = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer karty czytelnika ID, który prosi o wypożyczenie kolejnych książek: ");
        int id = sc.nextInt();
        for (int i = 0; i < tabLength; i++) {
            if (id == libraryID[i]) {
                System.out.println("Podaj ilość książek do wypożyczenia: ");
                int nextOnes = sc.nextInt();
                if ((nextOnes + borrowedBooks[i]) < 11) {
                    borrowedBooks[i] += nextOnes;
                    System.out.println("lab4.Czytelnik: " + surnames[i].toString() + "\t" + names[i].toString() + "\tID " + libraryID[i] +
                            "\tobecnie wypożyczył: " + borrowedBooks[i]);
                    idExsists = true;
                } else {
                    System.out.println("lab4.Czytelnik: " + surnames[i].toString() + "\t" + names[i].toString() + "\tID " + libraryID[i] +
                            "\tnie może wypożyczyć aż tylu książek (maksymalnie: 10/obecnie: " + borrowedBooks[i] + ").");
                    idExsists = true;
                }
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru karty czytelnika.");
        }

    }

    public static void giveBooksBack() {
        boolean idExsists = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer karty czytelnika ID, który chce oddać książki: ");
        int id = sc.nextInt();
        for (int i = 0; i < tabLength; i++) {
            if (id == libraryID[i]) {
                int books = 0;
                System.out.println("Podaj ilość książek do oddania: ");
                books = sc.nextInt();
                if ((borrowedBooks[i] - books) >= 0) {
                    borrowedBooks[i] = borrowedBooks[i] - books;
                    System.out.println("lab4.Czytelnik: " + surnames[i].toString() + "\t" + names[i].toString() +
                            "\tID: " + libraryID[i] + "\tobecnie wypożyczył: " + borrowedBooks[i]);
                    idExsists = true;
                } else {
                    System.out.println("Nie można oddać więcej książek niż się wypożyczyło.");
                    idExsists = true;
                }
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru karty czytelnika.");
        }
    }
}
