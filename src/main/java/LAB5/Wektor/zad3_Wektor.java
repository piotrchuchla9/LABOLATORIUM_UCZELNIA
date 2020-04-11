package LAB5.Wektor;

import java.util.Scanner;

public class zad3_Wektor {
    public static void main(String[] args) {
        Wektor task = new Wektor();
        WektorZaczepiony taskZaczepiony = new WektorZaczepiony();
        Scanner sc = new Scanner(System.in);
        int choice;
        task.add();
        do {
            System.out.println("\n----MENU----\n");
            System.out.println("1. Wyświetlanie informacji o wektorach");
            System.out.println("2. Obliczanie długosci wektorów");
            System.out.println("3. Wyświetlenie wektorów równoległych do OX");
            System.out.println("4. Wyświetlenie wektorów równoległych do OY");
            System.out.println("5. Sortowanie wektorów pod względem ich długości");
            System.out.println("6. Iloczyn skalarny dwóch podanych wektorów");
            System.out.println("7. Wyświetl informacje o wektorze lacznie z punktem zaczepienia");
            System.out.println("8. Zmien punkt zaczepienia wektora");
            System.out.println("\n0. Wyjście z programu");
            System.out.println("\nWybierz jedną z opcji: \n");
            choice = sc.nextInt();
            if (choice == 1) {
                task.allVectors();
            } else if (choice == 2) {
                task.vectorLength();
            } else if (choice == 3) {
                task.parallelX();
            } else if (choice == 4) {
                task.parallelY();
            } else if (choice == 5) {
                task.sortByLength();
            } else if (choice == 6) {
                task.scalarMultiplication();
            } else if (choice == 7) {
                taskZaczepiony.moreInfo();
            } else if (choice == 8) {
                taskZaczepiony.changePoint();
            }
        } while (choice != 0);
        if (choice == 0) {
            System.out.println("---------PROGRAM ZAKONCZONY------------");
        }
    }
}