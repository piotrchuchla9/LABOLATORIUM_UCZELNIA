package LAB5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Wektor {

    public static int tabLength = 15;
    public static String[] vector = new String[tabLength];
    public static double[] coordX = new double[tabLength];
    public static double[] coordY = new double[tabLength];

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dane wektorów: ");
        for (int i = 0; i < tabLength; i++) {
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj nazwe wektora: ");
            vector[i] = sc.next();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj współrzędną X wektora: ");
            coordX[i] = sc.nextDouble();
            System.out.println((i + 1) + "/" + tabLength + "\tPodaj współrzędną Y wektora: ");
            coordY[i] = sc.nextDouble();
        }
    }

    public static void allVectors() {
        for (int i = 0; i < tabLength; i++) {
            System.out.println((i + 1) + "/" + tabLength + "\tNazwa wektora: " + vector[i] +
                    " Współrzędne: " + coordX[i] + "," + coordY[i]);
        }
    }

    public static void vectorLength() {
        System.out.println("Długości zaokrąglone do 2 miejsc po przecinku.");
        for (int i = 0; i < tabLength; i++) {
            double vecLen = sqrt((pow(coordX[i], 2)) + (pow(coordY[i], 2)));
            BigDecimal bd = new BigDecimal(vecLen).setScale(2, RoundingMode.HALF_UP);
            double newVecLen = bd.doubleValue();
            System.out.println("lab4.Wektor " + vector[i] + " ma długość: " + newVecLen);
        }
    }

    public static void parallelX() {
        boolean parallelExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (coordY[i] == 0) {
                System.out.println("lab4.Wektor " + vector[i] + " " + coordX[i] + "," + coordY[i] + " jest równoległy do OX.");
                parallelExsists = true;
            }
        }
        if (!parallelExsists) {
            System.out.println("Nie ma wektorów równoległych do OX.");
        }
    }

    public static void parallelY() {
        boolean parallelExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (coordX[i] == 0) {
                System.out.println("lab4.Wektor " + vector[i] + " " + coordX[i] + "," + coordY[i] + " jest równoległy do OY.");
                parallelExsists = true;
            }
        }
        if (!parallelExsists) {
            System.out.println("Nie ma wektorów równoległych do OY.");
        }
    }

    public static void sortByLength() {
        double[] vectorsSortedByLength = new double[tabLength];
        double[] vectorsLength = new double[tabLength];
        for (int i = 0; i < tabLength; i++) {
            double vecLen = sqrt((pow(coordX[i], 2)) + (pow(coordY[i], 2)));
            vectorsLength[i] = vecLen;
        }
        for (int i = 0; i < tabLength; i++) {
            vectorsSortedByLength[i] = vectorsLength[i];
        }
        Arrays.sort(vectorsSortedByLength);
        for (int i = 0; i < tabLength; i++) {
            for (int j = 0; j < tabLength; j++) {
                if (vectorsSortedByLength[i] == vectorsLength[j]) {
                    System.out.println("lab4.Wektor: " + vector[j] + "\t Koordynaty: " + coordX[j] + "," + coordY[j] +
                            "\tDługość: " + vectorsLength[j]);
                }
            }
        }
    }

    public static void scalarMultiplication() {
        Scanner sc = new Scanner(System.in);
        double coordXTemp1 = 0, coordYTemp1 = 0, coordXTemp2 = 0, coordYTemp2 = 0;
        System.out.println("Podaj nazwę pierwszego wektora: ");
        String nameTemp1 = sc.next();
        System.out.println("Podaj nazwę drugiego wektora: ");
        String nameTemp2 = sc.next();
        for (int i = 0; i < tabLength; i++) {
            if (Objects.equals(nameTemp1, vector[i])) {
                coordXTemp1 = coordX[i];
                coordYTemp1 = coordY[i];
            } else if (Objects.equals(nameTemp2, vector[i])) {
                coordXTemp2 = coordX[i];
                coordYTemp2 = coordY[i];
            }
        }
        double scalar = ((coordXTemp1 * coordXTemp2) + (coordYTemp1 * coordYTemp2));
        System.out.println("Iloczyn skalarny tych wektorów to: " + scalar);
    }
}