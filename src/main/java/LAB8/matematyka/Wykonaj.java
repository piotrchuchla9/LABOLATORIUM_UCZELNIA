package LAB8.matematyka;

public class Wykonaj {
    public static void main(String[] args) {

        UlamekZwykly a = new UlamekZwykly(12,32);
        UlamekZwykly b = new UlamekZwykly(-13,4);
        UlamekZwykly c = new UlamekZwykly(15,2);
        UlamekZwykly d = new UlamekZwykly(-20,19);

        System.out.println("Ilość ułamków: " + UlamekZwykly.ileUlamkow);

        a.wyswietl();
        System.out.println();
        b.wyswietl();
        System.out.println();
        c.wyswietl();
        System.out.println();
        d.wyswietl();
        System.out.println();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();



        System.out.print("a+b: ");
        OperacjeNaUlamkach.dodawanie(a,b);
        System.out.println();

        System.out.print("b-c: ");
        OperacjeNaUlamkach.odejmowanie(b,c);
        System.out.println();

        System.out.print("c*d: ");
        OperacjeNaUlamkach.mnozenie1(c,d);
        System.out.println();

        System.out.print("c*liczba: ");
        OperacjeNaUlamkach.mnozenie2(c,10);
        System.out.println();

        System.out.print("c/b: ");
        OperacjeNaUlamkach.dzielenie(c,b);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();



        UlamekZwykly.UlamekDziesietny aDzies = a.new UlamekDziesietny(a);
        System.out.println("a dziesietnie: " + aDzies.dziesietny);

        UlamekZwykly.UlamekDziesietny bDzies = b.new UlamekDziesietny(b);
        System.out.println("b dziesietnie: " + bDzies.dziesietny);

        UlamekZwykly.UlamekDziesietny cDzies = c.new UlamekDziesietny(c);
        System.out.println("c dziesietnie: " + cDzies.dziesietny);

        UlamekZwykly.UlamekDziesietny dDzies = d.new UlamekDziesietny(c);
        System.out.println("d dziesietnie: " + dDzies.dziesietny);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        LiczbaZespolona ai = new LiczbaZespolona(4,2);
        LiczbaZespolona bi = new LiczbaZespolona(-6,13);
        LiczbaZespolona ci = new LiczbaZespolona(13,0);
        LiczbaZespolona di = new LiczbaZespolona(0,-8);

        ai.wyswietlZespolone();
        bi.wyswietlZespolone();
        ci.wyswietlZespolone();
        di.wyswietlZespolone();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("ai + b1:");
        OperacjeNaLiczbachZespolonych.dodawanie(ai,bi);
        System.out.print("\n");

        System.out.println("bi - a1:");
        OperacjeNaLiczbachZespolonych.odejmowanie(bi,ai);
        System.out.print("\n");

        System.out.println("ci * di:");
        OperacjeNaLiczbachZespolonych.mnozenie1(ci,bi);
        System.out.print("\n");

        System.out.println("di * liczba: ");
        OperacjeNaLiczbachZespolonych.mnozenie2(di,12);
        System.out.print("\n");

        System.out.println("ai / b1:");
        OperacjeNaLiczbachZespolonych.dzielenie(ai,bi);
        System.out.println("\n");

    }
}
