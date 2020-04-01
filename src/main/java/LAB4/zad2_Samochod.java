package LAB4;

import java.util.Scanner;

public class zad2_Samochod {
    public static void main(String[] args) {
        Samochod task = new Samochod();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Podaj dane samochodów: \n");
        task.add();
        do {
            System.out.println("\n----MENU----\n");
            System.out.println("1. Wyświetl informacje o samochodzie o podanym numerze rejestracyjnym.");
            System.out.println("2. Wyświetl informacje o wszystkich samochodach.");
            System.out.println("3. Zmień właściciela pojazdu o podanym numerze rejestracyjnym.");
            System.out.println("4. Wyświetl informacje o pojazdach wyprodukowanych przed podanym rokiem.");
            System.out.println("5. Posortuj pojazdy według pojemności silnika.");
            System.out.println("\n0. Wyjście z programu");
            System.out.println("\nWybierz jedną z opcji: \n");
            choice = sc.nextInt();
            if (choice == 1) {
                task.showByCarID();
            } else if (choice == 2) {
                task.showAllCars();
            } else if (choice == 3) {
                task.changeOwner();
            } else if (choice == 4) {
                task.showCarsMadeInYears();
            } else if (choice == 5) {
                task.carsSortedByEngine();
            }
        } while (choice != 0);
        if (choice == 0) {
            System.out.println("---------PROGRAM ZAKONCZONY------------");
        }
    }
}