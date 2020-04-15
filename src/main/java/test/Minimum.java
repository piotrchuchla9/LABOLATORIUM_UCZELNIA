package test;

public class Minimum {
    public static int Szukaj(int [] tab, int n){
        if(n==0){
            return tab[0];
        }
        else{
            int x1 = tab[n];
            int x2 = Szukaj(tab,n-1);

            if(x1<x2){
                return x1;
            }
            else{
                return x2;
            }
        }
    }

    public static void main(String[] args) {
        int[] tab = {0, 4, 8, 3};
        int result = Szukaj(tab, tab.length-1);
        System.out.println("Wynik = " + result);
    }
}
