package LAB4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Samochod {

    public static int tabLength = 5;
    public static String carName[] = new String[tabLength];
    public static double engines[] = new double[tabLength];
    public static int productionYears[] = new int[tabLength];
    public static String carIDs[] = new String[tabLength];
    public static String ownerSurenames[] = new String[tabLength];

    public static void add() {
        System.out.println("Dodaj dane: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabLength; i++) {
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj markę samochodu: ");
            carName[i] = sc.next();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj pojemność silnika: ");
            engines[i] = sc.nextDouble();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj rok produkcji samochodu: ");
            productionYears[i] = sc.nextInt();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj numer rejestracyjny: ");
            carIDs[i] = sc.next();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj nazwisko właściciela: ");
            ownerSurenames[i] = sc.next();
        }
    }

    public static void showByCarID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer rejestracyjny samochodu: ");
        String carID = sc.next();
        boolean IDexsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (Objects.equals(carID, carIDs[i])) {
                System.out.println("Marka: " + carName[i] + "\tSilnik: " + engines[i] +
                        "\tRok produkcji: " + productionYears[i] + "\tNaziwsko właściciela: " + ownerSurenames[i]);
                IDexsists = true;
            }
        }
        if (IDexsists == false) {
            System.out.println("Nie ma takiego numeru rejestracyjnego w bazie.");
        }
    }

    public static void showAllCars() {
        for (int i = 0; i < tabLength; i++) {
            System.out.println("Marka: " + carName[i] + "\tSilnik: " + engines[i] + "\tRok produkcji: "
                    + productionYears[i] + "\tNumer rejestracyjny: " + carIDs[i] + "\tNaziwsko właściciela: " + ownerSurenames[i]);
        }
    }

    public static void changeOwner() {
        boolean IDExsists = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer rejestracyjny pojazdu: ");
        String carID = sc.next();
        System.out.println("Podaj nazwisko nowego właściciela pojazdu: ");
        String newOwner = sc.next();
        for (int i = 0; i < tabLength; i++) {
            if (Objects.equals(carID, carIDs[i])) {
                ownerSurenames[i] = newOwner;
                System.out.println("Obecne dane pojazdu:\n");
                System.out.println("Marka: " + carName[i] + "\tSilnik: " + engines[i] + "\tRok produkcji: "
                        + productionYears[i] + "\tNumer rejestracyjny: " + carIDs[i] + "\tNaziwsko właściciela: " + ownerSurenames[i]);
            }
            IDExsists = true;
        }
        if (IDExsists == false) {
            System.out.println("Nie ma takiego numeru rejestracyjnego w bazie.");
        }
    }

    public static void showCarsMadeInYears() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj maksymalny rok produkcji pojazdów: ");
        int year = sc.nextInt();
        System.out.println("Samochody wyprodukowane przed " + year + ": ");
        for (int i = 0; i < tabLength; i++) {
            if (productionYears[i] <= year) {
                System.out.println("Marka: " + carName[i] + "\tSilnik: " + engines[i] + "\tRok produkcji: "
                        + productionYears[i] + "\tNumer rejestracyjny: " + carIDs[i] + "\tNaziwsko właściciela: " + ownerSurenames[i]);
            }
        }
    }

    public static void carsSortedByEngine() {
        double sortedByEngine[] = new double[tabLength];
        for (int i = 0; i < tabLength; i++) {                   //copy tab
            sortedByEngine[i] = engines[i];
        }
        Arrays.sort(sortedByEngine);
        for (int i = 0; i < tabLength; i++) {
            for (int j = 0; j < tabLength; j++) {
                if (sortedByEngine[i] == engines[j]) {
                    System.out.println("Marka: " + carName[j] + "\tSilnik: " + engines[j] + "\tRok produkcji: "
                            + productionYears[j] + "\tNumer rejestracyjny: " + carIDs[j] + "\tNazwisko właściciela: " + ownerSurenames[j]);
                }
            }
        }
    }
}