package patterns.polygonfactory;

public class PolygonFactory {
    public Polygon createPolygon(String type){
        Polygon polygon;
        switch(type) {
            case "circle":
                polygon = new Circle(15);
                break;
            case "square":
                polygon = new Square(30);
                break;
            case "parallelogram":
                polygon = new Parallelogram(15, 30);
                break;
            default:
                polygon = null;
                break;
        }
        return polygon;
    }
}
