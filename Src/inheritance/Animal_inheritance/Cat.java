public class Cat extends Animal {
    // Inherit the constructor values from it's parent class 'Animal.java'
    public Cat(String name){
        super(name); // Inherit the name attribute from the parent class 'Animal'
    }

    // Now, the abstract 'must have' method 'MakeSound'
    @Override
    public void MakeSound(String name){
        System.out.printf("My Cat %s says Mew\n", name);
    }
}