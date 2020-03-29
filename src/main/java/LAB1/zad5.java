        
package LAB1;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author Piotrek
 */
public class zad5 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Podaj x: ");
        float x = sc.nextFloat();
        
        System.out.println("x + 1/x = " + (x + (1/x)));
        System.out.println("sin(2x) + cos^2(x) = " + sin(2*x)+pow(cos(x),2));
        System.out.println("to wyrazenie to: " + sqrt(pow(x,2)+(3*x)-8));   
        
    }
}
