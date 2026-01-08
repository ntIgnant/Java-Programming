package TryOut;

public class BuildSquare {
    public static void main(String[] args){

        // Create a new instance of the object square
        Square sqr1 = new Square(5);

        double sqr1_area = sqr1.getSquareArea();

        System.out.println("Square1 with side " + sqr1.side + " has area " + sqr1_area);
    }
}