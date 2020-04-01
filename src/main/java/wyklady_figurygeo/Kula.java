/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wyklady_figurygeo;

/**
 *
 * @author Wojtek
 */
public abstract class Kula implements FiguraPrzestrzenna{
    // fields
    private double r;
    
    // c-tor
    public Kula(double r){
        this.setPromien(r);
    }
    
    public double getPromien(){
        return r;
    }
    
    public void setPromien(double r){
       if (r>0)
           this.r=r;
       else
           this.r=0;
    }
    
    @Override
    public double obliczObjetosc(){
        return (4/3)*Math.PI*r*r*r;
    }
    
    @Override
    public double obliczPole(){
        return 4*Math.PI*r*r;
    }
    
    @Override
    public void pokazDane(){
        System.out.println("Figura jest kulą!");
        System.out.println("Kula o promieniu r="+r+" ma pole="+obliczPole()+" ma objętość ="+obliczObjetosc());
    }


}
