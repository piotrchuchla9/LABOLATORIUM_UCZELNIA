
package wyklady_figurygeo;

public class Kolo implements FiguraPlaska{
    // Fields
    private double r;

    // C-tors
    public Kolo(double r) {
        setPromien(r);
    }

    // Methods
    public double getPromien() {
        return r;
    }

    public void setPromien(double r) {
        if (r>0) 
            this.r = r;
        else 
            this.r=0;
    }
    
    @Override
    public double obliczObwod(){
        return 2*Math.PI*r;
    }
    
    @Override
    public double obliczPole(){
        return Math.PI*r*r;
    }
    
    @Override
    public void pokazDane(){
        System.out.println("Figura jest kołem!");
        System.out.println("Koło o promieniu r="+r+" ma pole="+obliczPole()+" ma obwod ="+obliczObwod());
    }
    
    @Override
    public void rysuj(){
       System.out.println("Rysuję koło");
   
    }
    
}
