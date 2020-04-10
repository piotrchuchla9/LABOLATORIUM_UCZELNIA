package wyklady_figurygeo;

public class FiguryGeometryczne {

    public static void main(String[] args) {
        Figura kolo = new Kolo(5.5f);
        kolo.pokazDane();
        System.out.println();

        Figura kwadrat = new Kwadrat(5.5f);
        kwadrat.pokazDane();
        System.out.println();

        Kula kula = new Kula(2.0) {
            @Override
            public void rysuj() {

            }
        };
        kula.pokazDane();
        System.out.println();
        Stozek stozek = new Stozek(2.0, 4.0) {
            @Override
            public void rysuj() {

            }
        };
        stozek.pokazDane();

        Figura[] fabryka_figur = new Figura[8];
        fabryka_figur[0] = kolo;
        fabryka_figur[1] = kwadrat;
        fabryka_figur[2] = kula;
        fabryka_figur[3] = stozek;
        fabryka_figur[4] = new Kwadrat(10.2f);
        fabryka_figur[5] = new Kolo(20.4);
        fabryka_figur[6] = new Kula(15.6) {
            @Override
            public void rysuj() {

            }
        };
        fabryka_figur[7] = new Stozek(10.6, 2.8) {
            @Override
            public void rysuj() {

            }
        };

        for (int i = 0; i < fabryka_figur.length; i++) {
            fabryka_figur[i].pokazDane();
            System.out.println();
        }

    }
}
