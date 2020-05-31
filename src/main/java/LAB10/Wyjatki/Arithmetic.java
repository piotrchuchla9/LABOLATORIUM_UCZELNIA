package LAB10.Wyjatki;

public class Arithmetic {
    public static void main(String[] args) {

        int[] liczby = new int[4];

        liczby[0] = 32;
        liczby[1] = 16;
        liczby[2] = 0;
        liczby[3] = 4;

        for(int i = 0;i<liczby.length;i++){
            System.out.println("Liczba " + (i+1) + ". " + liczby[i]);
        }
        System.out.println();

        try{
            System.out.print("Suma liczb 2 i 4 (16+4): ");
            System.out.println(liczby[1] + liczby[+3]);

            System.out.print("Iloczyn liczb 1 i 3 (32*0): ");
            System.out.println(liczby[0]*liczby[2]);

            System.out.print("Roznica liczb 2 i 1 (16-32): ");
            System.out.println(liczby[1]-liczby[0]);

            System.out.print("Iloraz liczb 4 i 3 (4/0): ");
            System.out.println(liczby[3]/liczby[2]);
        } catch(ArithmeticException e){
            System.out.println("Nie wolno dzielic przez 0!");
        }
    }
}
