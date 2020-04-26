package LAB7.Punkty_Wektory;

public class Punkt_3D extends Punkt_2D {

    Double z;

    public void setxyz(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Double getZ() {
        return z;
    }
}