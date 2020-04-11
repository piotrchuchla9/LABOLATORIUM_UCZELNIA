package LAB6.Figury;

public class WszystkieFigury {
    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(10);
        Kolo kolo = new Kolo(9);
        SzesciokatForemny szesciokat = new SzesciokatForemny(2);

        Figura[] figury = new Figura[3];
        figury[0] = kwadrat;
        figury[1] = kolo;
        figury[2] = szesciokat;

        for(int i = 0;i<figury.length;i++){
            figury[i].daneFigury();
        }
    }
}