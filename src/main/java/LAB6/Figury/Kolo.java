package LAB6.Figury;

public class Kolo extends Figura {
    double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double oblicz_obwod(double bok) {
        return 2 * Math.PI * promien;
    }

    @Override
    public double oblicz_pole(double bok) {
        return Math.PI * promien * promien;
    }

    @Override
    public void daneFigury() {
        System.out.println("\nKolo o promieniu: " + promien + "\nObwod: " + oblicz_obwod(promien) + "\nPole: " + oblicz_pole(promien));
    }
}
