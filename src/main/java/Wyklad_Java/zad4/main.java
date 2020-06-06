package Wyklad_Java.zad4;

public class main {
    public static void main(String[] args) {

        int[] tablica = {5,6,7};
        int a = 30;
        double wynik;
        int reszta = 0;
        try{
            System.out.println("Dzielenie ma dac wynik bez reszty");

            for(int i = 0;i<tablica.length;i++){
                wynik = a/tablica[i];
                reszta = a%tablica[i];
                System.out.println("30 / " + tablica[i] + " = " + wynik + ", reszty: " + reszta);
                if(reszta != 0){
                    throw new MyException();
                }
            }
        } catch(MyException ex){
            System.out.println("Error!\tReszta wynosi " + reszta);
        }
    }
}