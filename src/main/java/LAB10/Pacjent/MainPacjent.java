package LAB10.Pacjent;

public class MainPacjent extends NieprawidlowaDataException {
    public static void main(String[] args) {
        Pacjent[] pacjenci = new Pacjent[4];

        pacjenci[0] = new Pacjent("Piotr", "Chuchla", 2, 6, 2019);
        pacjenci[1] = new Pacjent("Adam", "Kowalski", 12, 13, 2017);
        pacjenci[2] = new Pacjent("Jan", "Nowak", 32, 10, 2011);
        pacjenci[3] = new Pacjent("Andrzej", "Wojtowicz", 1, 19, 2020);

        for(int i = 0;i<pacjenci.length;i++){
            System.out.println("Pacjent: " + pacjenci[i].imie + " " + pacjenci[i].nazwisko +
            "\t\tOstatnia wizyta: " + pacjenci[i].dzien + " - " + pacjenci[i].miesiac + " - " + pacjenci[i].rok);
        }
        System.out.println("\n");


        //sprawdza czy podana data jest prawidlowa
        for (int i = 0; i < pacjenci.length; i++) {
            try {
                if (pacjenci[i].miesiac >= 1 && pacjenci[i].miesiac <= 12) {
                    if (pacjenci[i].miesiac == 1 || pacjenci[i].miesiac == 3 || pacjenci[i].miesiac == 5 || pacjenci[i].miesiac == 7
                            || pacjenci[i].miesiac == 8 || pacjenci[i].miesiac == 10 || pacjenci[i].miesiac == 12) {
                        if (!(pacjenci[i].dzien <= 31 && pacjenci[i].dzien >= 1)) {
                            throw new NieprawidlowaDataException();
                        }
                    } else if (pacjenci[i].miesiac == 4 || pacjenci[i].miesiac == 6 || pacjenci[i].miesiac == 9 || pacjenci[i].miesiac == 11) {
                        if (!(pacjenci[i].dzien <= 30 && pacjenci[i].dzien >= 1)) {
                            throw new NieprawidlowaDataException();
                        }
                    } else if (pacjenci[i].miesiac == 2 && ((pacjenci[i].rok % 4 == 0 && pacjenci[i].rok % 100 != 0) || pacjenci[i].rok % 400 == 0)) {
                        if (!(pacjenci[i].dzien <= 29 && pacjenci[i].dzien >= 1)) {
                            throw new NieprawidlowaDataException();
                        }
                    } else if (pacjenci[i].miesiac == 2 && !((pacjenci[i].rok % 4 == 0 && pacjenci[i].rok % 100 != 0) || pacjenci[i].rok % 400 == 0)) {
                        if (!(pacjenci[i].dzien <= 28 && pacjenci[i].dzien >= 1)) {
                            throw new NieprawidlowaDataException();
                        }
                    }
                }
                else if (!(pacjenci[i].miesiac >= 1 && pacjenci[i].miesiac <= 12)){
                    throw new NieprawidlowaDataException();
                }

            } catch (NieprawidlowaDataException e) {
                System.out.println("Error 1 - Data nieprawidlowa!\t\tPacjent: " + pacjenci[i].imie + " " + pacjenci[i].nazwisko +
                        "\t\tOstatnia wizyta: " + pacjenci[i].dzien + " - " + pacjenci[i].miesiac + " - " + pacjenci[i].rok);
            }
        }
    }
}