package patterns.polygonfactory;
public class Parallelogram extends Polygon {
    private int side_a;
    private int side_b;

    Parallelogram(int side_a, int side_b) {
        this.side_a=side_a;
        this.side_b=side_b;
    }

    @Override
    public double getArea() {
        return side_a*side_b;
    }

    @Override
    public double getPerimeter() {
        return 2*(side_a+side_b);
    }
}
