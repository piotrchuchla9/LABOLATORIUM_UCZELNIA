package LAB6.Figury;

public class SzesciokatForemny extends Figura {

    double bok;

    public SzesciokatForemny(double bok) {
        this.bok = bok;
    }

    @Override
    public double oblicz_obwod(double bok) {
        return 6 * bok;
    }

    @Override
    public double oblicz_pole(double bok) {
        return 6 * ((bok * bok * Math.sqrt(3)) / 4);
    }

    @Override
    public void daneFigury() {
        System.out.println("\nSzesciokat o boku: " + bok + "\nObwod: " + oblicz_obwod(bok) + "\nPole: " + oblicz_pole(bok));
    }
}
