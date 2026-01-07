public class basic_class {

    // Define a class before the 'main' class
    public class Person{
        public String name;
        public int age;
        public double height;

        // Declare a function to print all the values of the object (works as a __str__ in py)
        public void printInfo(){
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Height: " + this.height);
        }
    }

    public static void main(String[] args){

        // Create an instance of the class Person
        basic_class outer = new basic_class(); // Required to access inner class
        Person persona1 = outer.new Person();   // Instantiate inner class

        persona1.name = "Oscar";
        persona1.age = 17;
        persona1.height = 1.70;

        // Invoque te function from the created object
        persona1.printInfo();
    }
}