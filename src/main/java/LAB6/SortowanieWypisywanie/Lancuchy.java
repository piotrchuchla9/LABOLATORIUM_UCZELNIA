package LAB6.SortowanieWypisywanie;

import java.util.Arrays;
import java.util.Comparator;

public class Lancuchy implements Sortowanie,Wypisywanie{

    private String[] wyrazy = {"auto", "dom", "osa", "rzeka", "laptop"};

    @Override
    public void sortowanieNiemalejace() {
        Arrays.sort(wyrazy, Comparator.comparingInt(String::length));
    }

    @Override
    public void sortowanieNierosnace() {
        Arrays.sort(wyrazy, Comparator.comparingInt(String::length).reversed());
    }

    @Override
    public void info() {
        System.out.println(Arrays.toString(wyrazy));
    }
}
