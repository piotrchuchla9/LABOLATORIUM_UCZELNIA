package LAB8.matematyka;

public class OperacjeNaUlamkach {

    static int l,m;

    static void dodawanie(UlamekZwykly a, UlamekZwykly b){

        if(a.mianownik == b.mianownik){
            l = a.licznik + b.licznik;
            m = a.mianownik;
        }
        else{
            l = a.licznik * b.mianownik + b.licznik * a.mianownik;
            m = a.mianownik * b.mianownik;
        }

        UlamekZwykly wynik = new UlamekZwykly(l,m);
        a.wyswietl();
        System.out.print(" + ");
        b.wyswietl();
        System.out.print(" = ");
        wynik.wyswietl();
    }

    static void odejmowanie(UlamekZwykly a, UlamekZwykly b){

        if(a.mianownik == b.mianownik){
            l = a.licznik - b.licznik;
            m = a.mianownik;
        }
        else{
            l = a.licznik * b.mianownik - b.licznik * a.mianownik;
            m = a.mianownik * b.mianownik;
        }

        UlamekZwykly wynik = new UlamekZwykly(l,m);
        a.wyswietl();
        System.out.print(" - ");
        b.wyswietl();
        System.out.print(" = ");
        wynik.wyswietl();
    }

    static void mnozenie1(UlamekZwykly a, UlamekZwykly b){

        l = a.licznik * b.licznik;
        m = a.mianownik * b.mianownik;

        UlamekZwykly wynik = new UlamekZwykly(l,m);
        a.wyswietl();
        System.out.print(" * ");
        b.wyswietl();
        System.out.print(" = ");
        wynik.wyswietl();
    }

    static void mnozenie2(UlamekZwykly a, int liczba){
        l = a.licznik * liczba;
        m = a.mianownik;

        UlamekZwykly wynik = new UlamekZwykly(l,m);
        a.wyswietl();
        System.out.print(" * ");
        System.out.print(liczba);
        System.out.print(" = ");
        wynik.wyswietl();
    }

    static void dzielenie(UlamekZwykly a, UlamekZwykly b){
        l = a.licznik * b.mianownik;
        m = b.licznik * a.mianownik;

        UlamekZwykly wynik = new UlamekZwykly(l,m);
        a.wyswietl();
        System.out.print(" / ");
        b.wyswietl();
        System.out.print(" = ");
        wynik.wyswietl();
        System.out.println();
    }

}
