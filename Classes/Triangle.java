public class Triangle {

    // Class variables
    private double base;
    private double height;

    // Create the builder of Triangle
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (this.base * this.height) / 2; // Return the area of the triangle
    }
}