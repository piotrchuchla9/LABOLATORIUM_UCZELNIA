package LAB8.matematyka;

public class OperacjeNaLiczbachZespolonych {

    static double RE,IM;

    static void dodawanie(LiczbaZespolona ai, LiczbaZespolona bi){

        RE = ai.re + bi.re;
        IM = ai.im + bi.im;

        LiczbaZespolona wynik = new LiczbaZespolona(RE,IM);
        ai.wyswietlZespolone();
        System.out.print(" + ");
        bi.wyswietlZespolone();
        System.out.print(" = ");
        wynik.wyswietlZespolone();
    }

    static void odejmowanie(LiczbaZespolona ai, LiczbaZespolona bi){
        RE = ai.re - bi.re;
        IM = ai.im - bi.im;

        LiczbaZespolona wynik = new LiczbaZespolona(RE,IM);
        ai.wyswietlZespolone();
        System.out.print(" - ");
        bi.wyswietlZespolone();
        System.out.print(" = ");
        wynik.wyswietlZespolone();

    }

    static void mnozenie1(LiczbaZespolona ai, LiczbaZespolona bi){
        RE = ai.re * bi.re - ai.im * bi.im;
        IM = ai.re * bi.im + ai.im * bi.re;

        LiczbaZespolona wynik = new LiczbaZespolona(RE,IM);
        ai.wyswietlZespolone();
        System.out.print(" * ");
        bi.wyswietlZespolone();
        System.out.print(" = ");
        wynik.wyswietlZespolone();
    }

    static void mnozenie2(LiczbaZespolona ai, int liczba){
        RE = ai.re * liczba;
        IM = ai.im * liczba;

        LiczbaZespolona wynik = new LiczbaZespolona(RE,IM);
        ai.wyswietlZespolone();
        System.out.print(" * ");
        System.out.print(liczba);
        System.out.print(" = ");
        wynik.wyswietlZespolone();

    }

    static void dzielenie(LiczbaZespolona ai, LiczbaZespolona bi){

        RE = (ai.re * bi.re + ai.im * bi.im) / (bi.re * bi.re + bi.im * bi.im);
        IM = (ai.im * bi.re - ai.re * bi.im) / (bi.re * bi.re + bi.im * bi.im);

        LiczbaZespolona wynik = new LiczbaZespolona(RE,IM);
        ai.wyswietlZespolone();
        System.out.print(" / ");
        bi.wyswietlZespolone();
        System.out.print(" = ");
        wynik.wyswietlZespolone();

    }

}
