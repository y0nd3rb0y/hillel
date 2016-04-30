public class Square implements Polygon {
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
