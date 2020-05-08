package LAB9.Osoby;

public class Osoby {

    String imie,nazwisko;
    int wiek,wzrost,waga;

    public Osoby(String imie, String nazwisko, int wiek, int wzrost, int waga){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
        this.wzrost=wzrost;
        this.waga=waga;
    }

    public void dane(){
        System.out.println(imie + nazwisko + " wiek: " + wiek + " wzrost: " + wzrost + " waga: " + waga);
    }
}