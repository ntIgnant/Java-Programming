import java.util.Scanner; // Import java utility 'Scanner' to get input from the user

class Person{
    // Attributes of the class:
    String name;
    int age;

    // Class Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void PrintPersonData(){
        System.out.printf("Name: %s\nAge: %d\n", this.name, this.age); // 'this' is like 'self' in python
    }
}

public class Basic_Class{ // Top-level class (public top-level class must match the file name)
    public static void main(String[] args){
        Person persona1 = new Person("Thekla", 21); // Create the object persona1

        persona1.PrintPersonData(); // Call the class method to print its data
    }
}