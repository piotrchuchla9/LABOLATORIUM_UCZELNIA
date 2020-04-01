
package wyklady_figurygeo;

public class Kwadrat implements FiguraPlaska, IObrot{
    private double a;

    public Kwadrat(double a) {
        this.setA(a);
    }

    
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a>0)
            this.a = a;
        else this.a =0;
    }
    
    @Override
    public double obliczObwod(){
        return 4*a;
    }
    
    @Override
    public double obliczPole(){
        return a*a;
    }
    
    @Override
    public void pokazDane(){
        System.out.println("Figura jest kwadratem!");
        System.out.println("Kwadrat o boku a="+a+" ma pole="+obliczPole()+" ma obwod ="+obliczObwod());
    }
    
    @Override
    public void rysuj(){
        System.out.println("Rysuję kwadrat");
    }
    
    @Override
    public void obroc(int kat){
            System.out.println("Obracam kwadrat o kąt "+kat);
    }
    
}
