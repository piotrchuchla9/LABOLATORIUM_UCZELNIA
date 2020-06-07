package Wyklad_Java.zad5_2;

public class Singleton {

    private static Singleton single_instance=null;

    public String a;
    public String b;
    public String c;

    public Singleton(){
        a = "Ala";
        b = "ma";
        c = "kota";
    }

    public static Singleton Singleton()
    {
        if (single_instance == null)
        {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
