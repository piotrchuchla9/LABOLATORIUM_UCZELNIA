package LAB6.Wypisywanie;

public class WszystkieWypisywania {
    public static void main(String[] args) {

        Samochod samochod = new Samochod();
        Ksiazka ksiazka = new Ksiazka();

        Wypisywanie[] wypisz = new Wypisywanie[2];
        wypisz[0] = samochod;
        wypisz[1] = ksiazka;

        for (int i = 0; i < wypisz.length; i++) {
            wypisz[i].info();
            wypisz[i].infoExtended();
        }

    }
}
