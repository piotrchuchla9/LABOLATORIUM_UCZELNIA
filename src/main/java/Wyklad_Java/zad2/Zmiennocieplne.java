package Wyklad_Java.zad2;

public class Zmiennocieplne extends Zwierze{

    String nazwa;
    double temp;
    double minTemp;
    double maxTemp;

    public Zmiennocieplne(String nazwa, double temp, double minTemp, double maxTemp) {
        this.nazwa = nazwa;
        this.temp = temp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    @Override
    public double podajTemperature(double temp) {
        return temp;
    }

    @Override
    public void wyswietlDane() {
        System.out.println("\nZwierze: " + nazwa + "\tTemperatura: " + podajTemperature(temp) +
                "\tTemperatura minimalna: " + minTemp + "\tTemperatura maksumalna: " + maxTemp);
    }

}
