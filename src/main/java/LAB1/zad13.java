package LAB1;
import java.util.Scanner;

public class zad13 {
    public static void main(String [] args){
    
        Scanner sc = new Scanner(System.in);
        String ocena = null;
        System.out.println("Podaj ocene: ");

        int x = sc.nextInt();
     

        int i;
        if(x==1){
            System.out.println("Podaj poprawna ocene: ");
            x = sc.nextInt();
        }
        for(i=2;x>5;i++){
            System.out.println("Podaj poprawna ocene: ");
            x = sc.nextInt();
        }
        
        
        /*while((x!=5) || (x!=4) || (x!=3) || (x!=2))
        {
            System.out.println("Podaj poprawna ocene: ");
            x = sc.nextInt();
        }*/

        System.out.println("Ocena " + x + " to slownie: "+ konwert(x,ocena));
            
    }
    
    public static String konwert(int x,String ocena){
        Scanner sc = new Scanner(System.in);
        
        if(x == 5){
            ocena = "Bardzo Dobry";
            System.out.println(ocena);
        }
        else if (x == 4){
            ocena = "Dobry";
            System.out.println(ocena);
        }
        else if (x == 3){
            ocena = "Dostateczny";
            System.out.println(ocena);
        }
        else if (x == 2){
            ocena = "Niedostateczny";
            System.out.println(ocena);
        }
        
        return ocena;
            
    }
    
}
