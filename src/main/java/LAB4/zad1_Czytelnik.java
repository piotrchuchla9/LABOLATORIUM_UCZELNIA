package LAB4;

import java.util.Scanner;

public class zad1_Czytelnik {
    public static void main(String[] args) {
        Czytelnik task = new Czytelnik();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        task.add();

        do {
            System.out.println("\n----MENU----\n");
            System.out.println("1. Wyświetlanie informacji o czytelniku z podanym numerem karty bibliotecznej");
            System.out.println("2. Wyświetlanie informacji o wszystkich czytelnikach biblioteki");
            System.out.println("3. Wyświetlenie informacji o czytelnikach, którzy nie wypożyczyli żadnej książki");
            System.out.println("4. Zmiana liczby wypożyczonych książek przy wypożyczeniu kolejnych książek (maksymalnie 10 książek)");
            System.out.println("5. Zmiana liczby wypożyczonych książek przy oddaniu pewnej ilości książek");
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
            }
        } while (choice != 0);

        if (choice == 0) {
            System.out.println("---------PROGRAM ZAKONCZONY------------");
        }

    }
}
