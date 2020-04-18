package LAB6.SortowanieWypisywanie;

import java.util.Arrays;
import java.util.Collections;

public class Liczby implements Sortowanie,Wypisywanie{

    private Integer[] rzeczywiste = {9, 1, 14, 54, 19};

    @Override
    public void sortowanieNiemalejace() {
        Arrays.sort(rzeczywiste);
    }

    @Override
    public void sortowanieNierosnace() {
        Arrays.sort(rzeczywiste, Collections.reverseOrder());
    }

    @Override
    public void info() {
        System.out.println(Arrays.toString(rzeczywiste));
    }
}
