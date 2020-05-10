package LAB9.Miesiace;

public class Miesiace {

    String nazwa;
    int dni;

    public Miesiace(String nazwa,int dni){
        this.nazwa=nazwa;
        this.dni=dni;
    }

    @Override
    public String toString() {
        return nazwa +" "+ dni;
    }
}
