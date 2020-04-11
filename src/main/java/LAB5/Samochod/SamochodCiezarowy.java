package LAB5.Samochod;

import java.util.Objects;
import java.util.Scanner;

public class SamochodCiezarowy extends Samochod {

    public static void moreInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer rejestracyjny pojazdu: ");
        String carID = sc.next();
        boolean idExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (Objects.equals(carID, carIDs[i])) {
                System.out.println("Marka: " + carName[i] + "\tSilnik: " + engines[i] + "\tRok produkcji: "
                        + productionYears[i] + "\tNaziwsko właściciela: " + ownerSurenames[i]
                        + "\tMasa calkowita: " + totalMass[i] + "kg\tMasa wlasna: " + ownMass[i] + "kg");
                idExsists = true;
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru rejestracyjnego.");
        }
    }

    public static void carMaxCapacity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer rejestracyjny pojazdu: ");
        String carID = sc.next();
        boolean idExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (Objects.equals(carID, carIDs[i])) {
                System.out.println("Dopuszczalna ladownosc tego pojazdu to: " + (totalMass[i] - ownMass[i]) + "kg");
                idExsists = true;
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego numeru rejestracyjnego.");
        }

    }
}
