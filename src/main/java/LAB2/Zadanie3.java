package LAB2;

public class Zadanie3 {
    public static void main(String [] args){
        
    }
    
    public int rekur(int n){
        int factorial = 1;
        if(n>=1){
            factorial = n* rekur(n-1);
        }
        return factorial;
    }
    
    public int iter(int n){
        int factorial = 1;
        for(int i = 1;i<=n;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    
}
