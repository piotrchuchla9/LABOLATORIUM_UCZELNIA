package LAB6.Wypisywanie;

public class Samochod implements Wypisywanie{

    private String carName = "Nissan";
    private int productionYear = 1998;
    private double engine = 1.4;

    @Override
    public void info() {
        System.out.println("\n" + carName + "\t" + productionYear + "\t" + engine);
    }

    @Override
    public void infoExtended() {
        System.out.println("carName: " + carName + "\tproductionYear: " + productionYear + "\tengine: " + engine);
    }
}
