package LAB10;

public class MainAdres extends ZlyKodPocztowyException {
    public static void main(String[] args) {


        Adres[] adresy = new Adres[4];

        adresy[0] = new Adres("Krakowska", "22B", "4", "34-123", "Krakow");
        adresy[1] = new Adres("Podkarpacka", "44", "X", "38-400", "Krosno");
        adresy[2] = new Adres("Rejtana", "123C", "122", "36X176", "Rzeszow");
        adresy[3] = new Adres("Pomorska", "1", "X", "31X574", "Gdynia");

        //sprawdza czy kod pocztowy jest poprawny
        boolean poprawnosc;
        for (int i = 0; i < adresy.length; i++) {
            try {
                poprawnosc = true;
                char a = adresy[i].kod.charAt(0);
                if (adresy[i].kod.length() != 6) {
                    poprawnosc = false;
                }

                if (!Character.isDigit(a)) {
                    poprawnosc = false;
                }
                char b = adresy[i].kod.charAt(1);
                if (!Character.isDigit(b)) {
                    poprawnosc = false;
                }
                String x = "-";
                char c = adresy[i].kod.charAt(2);
                String tempC = Character.toString(c);
                if (x.equals(tempC) != true) {
                    poprawnosc = false;
                }
                char d = adresy[i].kod.charAt(3);
                if (!Character.isDigit(d)) {
                    poprawnosc = false;
                }
                char e = adresy[i].kod.charAt(4);
                if (!Character.isDigit(e)) {
                    poprawnosc = false;
                }
                char f = adresy[i].kod.charAt(5);
                if (!Character.isDigit(f)) {
                    poprawnosc = false;
                }

                if (poprawnosc == false) {
                    throw new ZlyKodPocztowyException();
                }
            } catch (ZlyKodPocztowyException ex) {
                System.out.println("Error 1 - Zly kod pocztowy!\t\t\tDla mieszkania o adresie: " + adresy[i].ulica + " " + adresy[i].numer_budynku + "/" +
                        adresy[i].numer_mieszkania + "  " + adresy[i].kod + " " + adresy[i].miejscowosc +
                        " - wprowadzono niepoprawny kod pocztowy: " + adresy[i].kod);
            }
        }

        //sprawdza czy numer mieszkania jest poprawny
        for (int i = 0; i < adresy.length; i++) {
            try {
                int numer = Integer.parseInt(adresy[i].numer_mieszkania);
            } catch (NumberFormatException e) {
                System.out.println("Error 2 - Zly numer mieszkania!\t\tDla mieszkania o adresie: " + adresy[i].ulica + " " + adresy[i].numer_budynku + "/" +
                        adresy[i].numer_mieszkania + "  " + adresy[i].kod + " " + adresy[i].miejscowosc +
                        " - wprowadzono niepoprawny numer mieszkania: " + adresy[i].numer_mieszkania);
            }
        }


    }
}