package LAB5;

import java.util.Scanner;

public class zad1_Czytelnik{

    public static void main(String[] args) {
        Czytelnik task = new Czytelnik();
        CzytelnikEkstra ekstraTask = new CzytelnikEkstra();
        Scanner sc = new Scanner(System.in);
        int choice;
        task.addData();
        do {
            System.out.println("\n----MENU----\n");
            System.out.println("1. Wyświetlanie informacji o czytelniku z podanym numerem karty bibliotecznej");
            System.out.println("2. Wyświetlanie informacji o wszystkich czytelnikach biblioteki");
            System.out.println("3. Wyświetlenie informacji o czytelnikach, którzy nie wypożyczyli żadnej książki");
            System.out.println("4. Zmiana liczby wypożyczonych książek przy wypożyczeniu kolejnych książek (maksymalnie 10 książek)");
            System.out.println("5. Zmiana liczby wypożyczonych książek przy oddaniu pewnej ilości książek");
            System.out.println("6. Wyświetlanie inforamcji o czytelniku lacznie z czasopismami.");
            System.out.println("7. Zmiana liczby wypożyczonych czasopism przy wypozyczeniu kolejnych czasopism (maksymalnie 5 magazynow)");
            System.out.println("8. Zmiana liczby wypożyczonych czasopism przy oddaniu pewnej ilości książek");
            System.out.println("\n0. Wyjście z programu");
            System.out.println("\nWybierz jedną z opcji: \n");
            choice = sc.nextInt();
            if (choice == 1) {
                task.showByID();
            } else if (choice == 2) {
                task.showAll();
            } else if (choice == 3) {
                task.showNoBorrowedBooks();
            } else if (choice == 4) {
                task.borrowMoreBooksLessThan11();
            } else if (choice == 5) {
                task.giveBooksBack();
            } else if (choice == 6) {
                ekstraTask.moreInfo();
            } else if (choice == 7) {
                ekstraTask.borrowMoreMagazines();
            } else if (choice == 8) {
                ekstraTask.giveMagazinesBack();
            }
        } while (choice != 0);
        if (choice == 0) {
            System.out.println("---------PROGRAM ZAKONCZONY------------");
        }
    }
}