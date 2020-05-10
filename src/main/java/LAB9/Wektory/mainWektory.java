package LAB9.Wektory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class mainWektory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Wektory> wektory = new ArrayList<>();
        wektory.add(new Wektory(2,4));
        wektory.add(new Wektory(6,1));
        wektory.add(new Wektory(8,3));
        wektory.add(new Wektory(3,9));
        wektory.add(new Wektory(1,1));

        int wybor;

        do{

            System.out.println("1. Sortuj wektory wedlug dlugosci");
            System.out.println("2. Pokaz najdluzszy wektor");
            System.out.println("3. Pokaz najkrotszy wektor");
            System.out.println("4. Koniec");
            wybor = sc.nextInt();

            if(wybor == 1){
                wektory.sort(new Comparator<Wektory>() {
                    @Override
                    public int compare(Wektory o1, Wektory o2) {
                        return o1.dlugosc().compareTo(o2.dlugosc());
                    }
                });
                for(int i = 0;i<wektory.size();i++){
                    System.out.println("[" + wektory.get(i).x + " , " + wektory.get(i).y + "]\n");
                }
            }
            else if(wybor == 2){
                wektory.sort(new Comparator<Wektory>() {
                    @Override
                    public int compare(Wektory o1, Wektory o2) {
                        return o1.dlugosc().compareTo(o2.dlugosc());
                    }
                });
                System.out.println("[" + wektory.get(wektory.size()-1).x + " , " + wektory.get(wektory.size()-1).y + "]\n");
            }
            else if(wybor==3){
                wektory.sort(new Comparator<Wektory>() {
                    @Override
                    public int compare(Wektory o1, Wektory o2) {
                        return o1.dlugosc().compareTo(o2.dlugosc());
                    }
                });
                System.out.println("[" + wektory.get(0).x + " , " + wektory.get(0).y + "]\n");
            }


        }while(wybor != 0);

    }
}
