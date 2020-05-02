package LAB8.matematyka;

import static java.lang.Math.sqrt;

public class LiczbaZespolona {

    double re;
    double im;

    static String symbol = "i";

    public LiczbaZespolona(double re, double im){
        this.re = re;
        this.im = im;
    }

    public void wyswietlZespolone(){
        if(im<0){
            System.out.print(re + im + symbol);
        }
        else if(im==0){
            System.out.print(re);
        }
        else if(im>0){
            System.out.print(re + "+" + im + symbol);
        }
    }

    public class Modul{

        double modul;

        Modul(LiczbaZespolona ai)
        {
            this.modul = sqrt(ai.im * ai.im + ai.re * ai.re);
        }
    }

}
