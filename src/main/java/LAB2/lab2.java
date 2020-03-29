package LAB2;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public class lab2 {
    public static void main (String [] args){
        
        int salary = 5000;
        BigInteger big1 = BigInteger.valueOf(salary);
        int and = 400;
        BigInteger big2 = BigInteger.valueOf(and);
    
        System.out.println("suma int " + (salary+=and));
        System.out.println("suma big " + big1.add(big2));
        System.out.println("suma big " + big1.multiply(big2));
        
        NumberFormat formater = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        System.out.println("Salary: " + formater.format(salary));

    }
    
}
