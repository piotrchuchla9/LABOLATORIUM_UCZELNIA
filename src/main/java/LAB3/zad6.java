package LAB3;
import java.util.Arrays;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args){
        zad6 method = new zad6();

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz metode: ");
        System.out.println("1. Sumowanie wszystkich elementow tablicy");
        System.out.println("2. Sumowanie elementow tablicy wiekszych od 0");
        System.out.println("3. Iloczyn wszystkich elementow tablicy");
        System.out.println("4. Ilosc wystapien danego znaku w tablicy");
        System.out.println("5. Przemnazanie elementow tablicy przez liczbe");
        int choice = sc.nextInt();
        if(choice!=4){
            System.out.println("Podaj dlugosc tablicy: ");        
            int n = sc.nextInt();
            int i;
            float tab[] = new float[n];
            for(i = 0;i<tab.length;i++){
            System.out.println(i+1 + "/"+ n + "    Podaj liczbe: ");
            tab[i] = sc.nextInt();
            }        
            if(choice == 1){
                method.sumAll(tab);
            }
            else if(choice == 2){
                method.sumBiggerThan0(tab);
            }
            else if(choice == 3){
                method.multiply(tab);
            }
            else if(choice == 5){
                method.multiplyEveryElement(tab);
            }
        }
        else if(choice == 4){
            method.chars();
        }
        
    }
    
    public void sumAll(float[] tab){
        float sum = 0;
        for(int i = 0;i<tab.length;i++){
            sum += tab[i];
        }
        System.out.println("Suma elementow tablicy to: " + sum);
    }
    
    public void sumBiggerThan0(float[] tab){
        float sum = 0;
        for(int i = 0;i<tab.length;i++){
            if(tab[i]>0){
                sum += tab[i];
            }
        }
        System.out.println("Suma elementow tablicy wiekszych od 0 to: " + sum);
    }
    
    public void multiply(float[] tab){
        float mult = 1;
        for(int i = 0;i<tab.length;i++){
            mult = mult*tab[i];
        }
        System.out.println("Iloczyn elementow tablicy to: " + mult);
    }
    
    public void chars(){
        
        System.out.println("Podaj dlugosc tablicy: ");    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        char tab[] = new char[n];
        
        for(i = 0;i<tab.length;i++){
        System.out.println(i+1 + "/"+ n + "    Podaj liczbe: ");
        tab[i] = sc.next().charAt(0);
        }        
        System.out.println("Podaj znak ktory chcesz policzyc: ");
        char znak;
        int count = 0;
        znak = sc.next().charAt(0);
        for(i=0;i<tab.length;i++){
            if(tab[i] == znak){
                count++;
            }
        }
        System.out.println(znak + " ----- " + count);
    }
    
    
    public void multiplyEveryElement(float[] tab){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartosc mnoznika: ");
        float x = sc.nextFloat();
        int i;
        float temp;
        System.out.println("Pierwotna tablica: " + Arrays.toString(tab));
        for(i = 0;i<tab.length;i++){
            tab[i] = tab[i] * x;
        }
        System.out.println("Przemnozona przez " + x + " tablica: " + Arrays.toString(tab));
    }
}
