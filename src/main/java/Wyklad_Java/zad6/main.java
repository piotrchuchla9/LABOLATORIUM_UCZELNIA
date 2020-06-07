package Wyklad_Java.zad6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Macierze m = new Macierze();
        ArrayList<String> lista = new ArrayList<>();
        lista.add(m.mnozenie());
        lista.add(m.transponowanie());
        for(int i = 0; i<lista.size(); i++){
            if(i == 0){
                System.out.println("Macierz przemnozona: ");
            }
            else if(i == 1){
                System.out.println("Macierz1 transponowana: ");
            }
            System.out.println(lista.get(i) + "\n");
        }
        System.out.println("--------------------\n\n");

        HashSet<String> hash = new HashSet<>();

        hash.add("Polska");
        hash.add("Australia");
        hash.add("Polska");
        hash.add("Niemcy");

        System.out.println(hash + "\n");
        System.out.println("Czy Polska wystepuje w hash? - " + hash.contains("Polska") + "\n");

        hash.remove("Niemcy");
        System.out.println("hash po usunieciu Niemcy: "+ hash + "\n");

        System.out.println("Iterowanie po hash:");
        Iterator<String> i = hash.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
