// Now, this class will be a child of its parent class 'Animal.java'

public class Dog extends Animal{
    // Inherit the constructor from the parent class with 'super'

    public Dog(String name){
        super(name); // Inherits the variable name from the parent class
    }

    // Now the 'must contain' method
    @Override // So @Override will change the behavior of the abstract class depending on the object (in this case is Dog)
    public void MakeSound(String name){
        System.out.printf("My Dog %s says Woof\n", name);
    }
}