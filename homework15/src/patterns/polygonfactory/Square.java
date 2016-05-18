package patterns.polygonfactory;
public class Square extends Polygon {
    private int edge;

    Square(int edge){
        this.edge = edge;
    }
    @Override
    public double getArea() {
        return edge^2;
    }

    @Override
    public double getPerimeter() {
        return edge*4;
    }
}
