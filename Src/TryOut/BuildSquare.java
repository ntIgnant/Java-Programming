package TryOut;
import java.util.ArrayList;

public class BuildSquare {
    public static void main(String[] args){

        // Create a new instance of the object square
        Square sqr1 = new Square(5);
        Square sqr2 = new Square(10);
        Square sqr3 = new Square(3);

        // Create and Add all the class instances (objects) to the arrayList
        ArrayList<Square> squares = new ArrayList<Square>();

        // Add the square objects to the ArrayList
        squares.add(sqr1);
        squares.add(sqr2);
        squares.add(sqr3);

        double sqr1_area = sqr1.getSquareArea();

//        System.out.println("Square1 with side " + sqr1.side + " has area " + sqr1_area);

        for (int i = 0; i < 3; i++){
            System.out.println("Square" + i+1 + " with side " + squares.get(i) + " has area " + squares.get(i).getSquareArea());
        }
    }
}