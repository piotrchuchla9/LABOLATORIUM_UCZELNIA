/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wyklady_figurygeo;

/**
 *
 * @author Wojtek
 */
public abstract class Stozek implements FiguraPrzestrzenna{
    
    //Fields
    private double r;
    private double H;
    
    //c-tor
    public Stozek(double r, double H) {
        this.r = r;
        this.H = H;
    }

    public double getPromien() {
        return r;
    }

    public void setPromien(double r) {
        if (r>0)
            this.r = r;
        else 
            this.r=0;
    }

    public double getWysokosc() {
        return H;
    }

    public void setWysokosc(double H) {
        if (H>0)
            this.H = H;
        else 
            this.H=0;
    }
    
    @Override
    public double obliczObjetosc(){
        return (1/3)*Math.PI*r*r*H;
    }
    
    @Override
    public double obliczPole(){
        double l = Math.sqrt(r*r + H*H);
        return Math.PI*r*r+Math.PI*r*l;
    }
    
    @Override
    public void pokazDane(){
        System.out.println("Figura jest stożkiem!");
        System.out.println("Stożek o promieniu r="+r+" i wysokości H="+H+" ma pole="+obliczPole()+" ma objętość ="+obliczObjetosc());
    }
    
    
}
