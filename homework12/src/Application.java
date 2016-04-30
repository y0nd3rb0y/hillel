public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(50);
        Square square = new Square(31);
        Parallelogram parallelogram = new Parallelogram(13,45);

        getInfo(circle);
        getInfo(square);
        getInfo(parallelogram);
    }

    public static void getInfo(Polygon polygon){
        System.out.println(polygon.getClass().getSimpleName()
                +" has area of: "+String.format("%.1f",polygon.getArea())
                +" and perimeter of: "+String.format("%.1f", polygon.getPerimeter()));
    }
}
