package Objects;

public class Triangle {

    // Class variables
    public double base;
    public double height;

    // Create the builder of Triangle
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (this.base * this.height) / 2; // Return the area of the triangle
    }
}