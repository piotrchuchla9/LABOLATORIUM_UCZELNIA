package Wyklad_Java.zad7;

public class main {
    public static void main(String[] args) {

        Listy<Integer> lista = new Listy<>();

        lista.dodaj(4);
        lista.dodaj(12093);
        lista.dodaj(0);
        lista.dodaj(111111111);

        System.out.print("Lista: ");
        System.out.println(lista.getLista());

        System.out.print("Posortowana lista: ");
        lista.sortuj();
        System.out.println(lista.getLista());

        System.out.print("Losowy element listy: ");
        System.out.println(lista.losuj());

        System.out.print("Usun ostatni element: ");
        lista.usunOstatniElement();
        System.out.println(lista.getLista());
    }
}
