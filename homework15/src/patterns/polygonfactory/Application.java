package patterns.polygonfactory;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter polygon type(circle | square | parallelogram):");
        String type = scanner.next();
        PolygonFactory polygonFactory = new PolygonFactory();
        Polygon polygon = polygonFactory.createPolygon(type);

        getInfo(polygon);
    }

    public static void getInfo(Polygon polygon){
        System.out.println(polygon.getClass().getSimpleName()
                +" has area of: "+String.format("%.1f",polygon.getArea())
                +" and perimeter of: "+String.format("%.1f", polygon.getPerimeter()));
    }
}
