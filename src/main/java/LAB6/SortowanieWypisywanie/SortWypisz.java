package LAB6.SortowanieWypisywanie;

public class SortWypisz {
    public static void main(String[] args) {
        Liczby liczby = new Liczby();
        Lancuchy wyrazy = new Lancuchy();

        Sortowanie[] sort = new Sortowanie[2];
        Wypisywanie[] wypisz = new Wypisywanie[2];

        sort[0] = liczby;
        sort[1] = wyrazy;

        wypisz[0] = liczby;
        wypisz[1] = wyrazy;

        for (int i = 0; i < sort.length; i++) {
            sort[i].sortowanieNiemalejace();
            wypisz[i].info();
            sort[i].sortowanieNierosnace();
            wypisz[i].info();
            System.out.println();
        }
    }
}
