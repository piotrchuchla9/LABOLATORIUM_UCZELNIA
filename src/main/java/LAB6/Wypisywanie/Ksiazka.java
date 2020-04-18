package LAB6.Wypisywanie;

public class Ksiazka implements Wypisywanie{

    private String title = "Wiedzmin";
    private String publisher = "superNova";
    private int publishmentYear = 1986;

    @Override
    public void info() {
        System.out.println("\n" + title + "\t" + publisher + "\t" + publishmentYear);
    }

    @Override
    public void infoExtended() {
        System.out.println("title: " + title + "\tpublisher: " + publisher + "\tpublishmentYear: " + publishmentYear);
    }
}
