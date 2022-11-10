package shape;

import java.util.Objects;

public abstract class Shape {
    private int S;
    private int h;
    private final double V;

    public Shape(int s, int h, double coef) {
        S = s;
        this.h = h;
        this.V = coef*s*h;  // coef = coefficient. The area of a cone is 1/3*S*h
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double getV() {
        return V;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "S=" + S +
                ", h=" + h +
                ", V=" + V +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return S == shape.S && h == shape.h && Double.compare(shape.V, V) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(S, h, V);
    }
}
