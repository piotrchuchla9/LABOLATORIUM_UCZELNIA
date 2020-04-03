package LAB5;

import java.util.Objects;
import java.util.Scanner;

public class WektorZaczepiony extends Wektor{

    public static void moreInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe wektora: ");
        String name = sc.next();
        boolean idExsists = false;
        for (int i = 0; i < tabLength; i++) {
            if (Objects.equals(name,vector[i])) {
                System.out.println("Nazwa wektora: " + vector[i] + "\tKoordynaty: " +
                        coordX[i] + "," + coordY[i] + "\tPunkt zaczepienia: " + point[i]);
                idExsists = true;
            }
        }
        if (idExsists == false) {
            System.out.println("Nie ma takiego wektora.");
        }
    }

    public static void changePoint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe wektora: ");
        String name = sc.next();
        boolean nameExsists = false;
        for(int i =0;i<tabLength;i++){
            if(Objects.equals(name,vector[i])){
                System.out.println("Podaj wspolrzedna X dla nowego punktu zaczepienia: ");
                coordXPoint = sc.nextDouble();
                System.out.println("Podaj wspolrzedna Y dla nowego punktu zaczepienia: ");
                coordYPoint = sc.nextDouble();
                point[i] = "[" + coordXPoint + "," + coordYPoint + "]";
                System.out.println("Obecne dane wektora to: \tNazwa:" + vector[i] + "\tWspolrzedne: " + coordX[i] + "," +
                        coordY[i] + "\tPunkt zaczepienia: " + point[i]);
                nameExsists = true;
            }
        }
        if (nameExsists == false) {
            System.out.println("Nie ma takiego wektora.");
        }
    }

}
