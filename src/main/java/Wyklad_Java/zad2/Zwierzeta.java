package Wyklad_Java.zad2;


public class Zwierzeta {
    public static void main(String[] args) {

        Stalocieplne zwierzeStalocieplne = new Stalocieplne("Chomik", 20);
        Zmiennocieplne zwierzeZeminnocieplne = new Zmiennocieplne("ryba", 20, 10, 50);

        Zwierze[] zwierzeta = new Zwierze[2];
        zwierzeta[0] = zwierzeStalocieplne;
        zwierzeta[1] = zwierzeZeminnocieplne;

        for (int i = 0; i < zwierzeta.length; i++) {
            zwierzeta[i].wyswietlDane();
        }
    }
}
