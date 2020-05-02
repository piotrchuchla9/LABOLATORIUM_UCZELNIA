package LAB8.matematyka;

public class UlamekZwykly {

    Integer licznik;
    Integer mianownik;
    static int ileUlamkow = 0;
    static String kreska = "/" ;

    UlamekZwykly(int licznik, int mianownik)
    {
        this.licznik = licznik;
        this.mianownik = mianownik;
        ileUlamkow++;
    }

    public void wyswietl()
    {
        System.out.print(licznik + kreska + mianownik);
    }



    public class UlamekDziesietny
    {
        float dziesietny;

        UlamekDziesietny(UlamekZwykly a)
        {
            this.dziesietny = (float)a.licznik / (float)a.mianownik;
        }

    }
}
