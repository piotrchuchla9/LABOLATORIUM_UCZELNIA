package Wyklad_Java.zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KsiazkiNaukowe extends Ksiazki implements Sortowanie{

    public static ArrayList<KsiazkiNaukowe> ksiazki = new ArrayList<>(5);

    private String nazwa;
    private int strony;

    public KsiazkiNaukowe(){

    }

    public KsiazkiNaukowe(String nazwa, int strony){
        this.nazwa = nazwa;
        this.strony = strony;
    }

    @Override
    public void pokazDane() {
        System.out.println("Nazwa: " + nazwa + "\tStrony: " + strony);
    }

    @Override
    public void sortowanieNiemalejace() {
        Collections.sort(ksiazki, new Comparator<KsiazkiNaukowe>() {
            @Override
            public int compare(KsiazkiNaukowe o1, KsiazkiNaukowe o2) {
                return Integer.valueOf(o1.strony).compareTo(o2.strony);
            }
        });
        for(int i = 0;i<ksiazki.size();i++){
            ksiazki.get(i).pokazDane();
        }
    }

    @Override
    public void sortowanieNierosnace() {
        Collections.sort(ksiazki, new Comparator<KsiazkiNaukowe>() {
            @Override
            public int compare(KsiazkiNaukowe o1, KsiazkiNaukowe o2) {
                return Integer.valueOf(o2.strony).compareTo(o1.strony);
            }
        });
        for(int i = 0;i<ksiazki.size();i++){
            ksiazki.get(i).pokazDane();
        }
    }
}