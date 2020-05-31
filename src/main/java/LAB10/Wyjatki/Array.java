package LAB10.Wyjatki;

public class Array {
    public static void main(String[] args) {

        int[] liczby = new int[3];

        liczby[0] = 32;
        liczby[1] = 11;
        liczby[2] = 152;

        for(int i = 0;i<liczby.length;i++){
            System.out.println("Liczba " + (i+1) + ". " + liczby[i]);
        }
        System.out.println();

        try{
            System.out.print("Podaje wartosc tablicy o indeksie 1: ");
            System.out.println(liczby[1]);

            System.out.print("Podaje wartosc tablicy o indeksie 0: ");
            System.out.println(liczby[0]);

            System.out.print("Podaje wartosc tablicy o indeksie 3: ");
            System.out.println(liczby[3]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error - Wykroczono poza zakres tablicy!");
        }

    }
}
