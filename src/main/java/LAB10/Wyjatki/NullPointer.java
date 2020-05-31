package LAB10.Wyjatki;

public class NullPointer {
    public static void main(String[] args) {

        String a = "Tomek";
        String b = "Jan";
        String c = "Tadeusz";
        String d = null;

        System.out.println("a = Tomek\nb = Jan\nc = Tadeusz\nd = NIC\n");

        try{
            System.out.print("Porownuje a i Tomek: ");
            if(a.equals("Tomek")){
                System.out.println("Takie same imiona");
            }
            else{
                System.out.println("Nie takie same imiona");
            }
            System.out.print("Porownuje b i c: ");
            if(b.equals(c)){
                System.out.println("Takie same imiona");
            }
            else{
                System.out.println("Nie takie same imiona");
            }
            System.out.print("Porownuje d i Jan: ");
            if(d.equals("Jan")){
                System.out.println("Takie same imiona");
            }
            else{
                System.out.println("Nie takie same imiona");
            }
        } catch(NullPointerException e){
            System.out.println("Error - Porownales imie z 'niczym'");
        }

    }
}
