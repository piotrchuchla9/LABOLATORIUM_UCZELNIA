
package LAB2;
public class Zadanie4 {
    public static void main (String [] args){
        
    }
    public float szereg1(){
        float i,sum = 0;
        for(i = 1;i<=30;i++){
            sum += i/(i+2);
        }
        return sum;
    }
    public float szereg2(){
        float j,sum = 0;
        for(j = 1;j<=5;j++){
            sum += 2*j;
        }
        return sum;
    }
    public float szereg3(){
        float i,j,sum=0;
        for(i=1;i<=20;i++){
            for(j=1;j<=10;j++){
                sum += (i+j)/(2*i);

            }
        }
        return sum;
    }
    public float szereg4(){
        float j,k,sum=0;
        for(j=1;j<=40;j++){
            for(k=1;k<=20;k++){
                sum += j+(2*k);
            }
        }
        return sum;
    }
    
}
