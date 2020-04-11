package LAB6.Zwierzeta;

public class Stalocieplne extends Zwierze {

    String nazwa;
    double temp;

    public Stalocieplne(String nazwa, double temp) {
        this.nazwa = nazwa;
        this.temp = temp;
    }

    @Override
    public double podajTemperature(double temp) {
        return temp;
    }

    @Override
    public void wyswietlDane() {
        System.out.println("\nZwierze: " + nazwa + "\tTemperatura: " + podajTemperature(temp));
    }
}
