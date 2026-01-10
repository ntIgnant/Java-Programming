package TryOut;

public class BuildSquare {
    public static void main(String[] args){

        // Create a new instance of the object square
        Square sqr1 = new Square(5);
        Square sqr2 = new Square(10);
        Square sqr3 = new Square(3);

        double sqr1_area = sqr1.getSquareArea();

        System.out.println("Square1 with side " + sqr1.side + " has area " + sqr1_area);

        for(int i = 1)
    }
}