package LAB9.Wynagrodzenia;

public class Wynagrodzenia {

    String nazwisko;
    int pensja;

    public Wynagrodzenia(String nazwisko,int pensja){
        this.nazwisko=nazwisko;
        this.pensja=pensja;
    }

    @Override
    public String toString() {
        return nazwisko + " " + pensja;
    }

}
