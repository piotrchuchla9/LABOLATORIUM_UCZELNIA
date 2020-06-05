package Wyklad_Java.zad1;

import java.text.DecimalFormat;

public class Samochod {

    String model;
    int rok_produkcji;
    double moc;

    private double lekkie_ulepszenie = 1.2;
    private double srednie_ulepszenie = 1.5;
    private double duze_ulepszenie = 2;

    public Samochod(){}

    public Samochod(String model, int rok_produkcji, double moc){
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.moc = moc;
    }

    DecimalFormat df = new DecimalFormat("#.##");
    public void dane(){
        System.out.println(model + "\t\tRok produkcji: " + rok_produkcji
        + "\t\tMoc: " + df.format(moc));
    }

    public void print_moc(){
        System.out.println("Jak bardzo chcesz zwiekszyc moc?");
        System.out.println("1. Lekko (*1.2)");
        System.out.println("2. Srednio (*1.5)");
        System.out.println("3. Mocno (*2)");
    }

    public void zwieksz_moc(int wybor){
        if(wybor == 1){
            moc = moc*lekkie_ulepszenie;
        }
        else if(wybor == 2){
            moc = moc*srednie_ulepszenie;
        }
        else if(wybor == 3){
            moc = moc*duze_ulepszenie;
        }
    }
}