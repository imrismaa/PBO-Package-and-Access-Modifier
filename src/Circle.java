public class Circle extends MathLib {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getLuas() {
        return phi*r*r;
    }
}
