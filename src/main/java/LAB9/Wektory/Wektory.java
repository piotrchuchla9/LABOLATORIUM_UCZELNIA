package LAB9.Wektory;

public class Wektory {

    Double x,y;

    Double dlugosc(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    public Wektory(double x, double y){
        this.x=x;
        this.y=y;
    }

}
