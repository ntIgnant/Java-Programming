package Objects;

public class BuildTriangle {

    public static void main(String[] args){

        // Create two instances of the Triangle object
        Triangle triangleA = new Triangle(17, 11);
        Triangle triangleB = new Triangle(5, 11);
        Triangle triangleC = new Triangle(3, 6);

        // Get the area of TriangleA
        double areaTriangleA = triangleA.getArea();

        System.out.println("Triangle A has Base " + triangleA.base + "height " + triangleA.height + "and area " + areaTriangleA);
    }
}