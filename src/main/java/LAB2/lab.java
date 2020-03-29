package LAB2;
public class lab {
    
    public static void main(String [] args){
    
        int a = 5;
        int b = 6;
        double c = 3.5;
        
        lab MyObject = new lab();
        System.out.println("Metoda1 " + MyObject.addTwoVariables(a,b,c));
        System.out.println("Metoda2 " + MyObject.addTwoVariables(a, c, b));
        
        System.out.println("Metoda3 " + MyObject.addTwoVariables(3, 5, 3, 7));
    
    }
    
    public int addTwoVariables(int a,int b,double c){
        
        return a + b + (int) c;
    }
    
    public int addTwoVariables(int a,double c,int b){
        
        return a + b + (int)c;
    }
    
    public int addTwoVariables(int ... args){
        
        int sum = 0;
        for(int count = 0;count < args.length;count++)
        {
            sum += args[count];
        }
        return sum;
    }
    
}

