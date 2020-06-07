package Wyklad_Java.zad7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Listy <T extends Comparable>{
    private List<T> lista = new ArrayList<T>();

    private Random rd = new Random();

    public T losuj(){
        return lista.get(rd.nextInt(lista.size()));
    }

    public List<T> getLista() {
        return lista;
    }

    public void sortuj(){
        Collections.sort(lista);
    }

    public void dodaj(T element){
        lista.add(element);
    }
}
