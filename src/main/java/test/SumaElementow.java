package test;

public class SumaElementow {
    public static int Dodaj(int[] tab, int n){
        if(n==0){
            return tab[0];
        }
        else{
            int x1 = tab[n];
            int x2 = Dodaj(tab,n-1);
            return x1 + x2;
        }
    }

    public static void main(String[] args) {
        int[] tab = {11, 4, 19, 7};
        int result = Dodaj(tab, tab.length-1);
        System.out.println("Wynik = " + result);
    }
}
