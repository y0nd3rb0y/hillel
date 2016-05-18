package patterns.polygonfactory;
public class Circle extends Polygon {

    private int diameter;

    Circle(int diameter){
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return Math.PI*(diameter^2)/4;
    }

    @Override
    public double getPerimeter() {
        return diameter*Math.PI;
    }
}
