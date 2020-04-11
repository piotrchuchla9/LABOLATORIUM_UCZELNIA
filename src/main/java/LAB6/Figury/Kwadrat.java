package LAB6.Figury;

public class Kwadrat extends Figura {

    double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double oblicz_obwod(double bok) {
        return 4 * bok;
    }

    @Override
    public double oblicz_pole(double bok) {
        return bok * bok;
    }

    @Override
    public void daneFigury() {
        System.out.println("\nKwadrat o boku: " + bok + "\nObwod: " + oblicz_obwod(bok) + "\nPole: " + oblicz_pole(bok));
    }

}
