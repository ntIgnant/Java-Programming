// Test to try out basic encapsulation
// Public vs private
public class basic_encapsulation{

    // The default values of this class should be changable from outer classes (public)
    public static class Car{
        String brand = "BMW";
        int rate = 7;
        double price = 5465.89;

        // Method to print the instance (object) info
        public void printInfo(){
            System.out.println("Brand: " + this.brand);
            System.out.println("Rate: " + this.rate);
            System.out.println("Price: " + this.price);
        }
    }

    public static void main(String[] args){
        // Create the object
        Car myCar = new Car();

        // Print the object default values
        myCar.printInfo();

        // As the class 'Car' is public, the default values can be changed from outer scope
        myCar.price = 00000;
        myCar.printInfo(); // Print the object data agin with the changed value
    }
}