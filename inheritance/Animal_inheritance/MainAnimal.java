public class MainAnimal {
    public static void main(String[] args){

        // Some code here, creating the animal objects
        // Create the object for Dog and Cat

        Animal newDog = new Dog("Oscar"); // So this object is type Animal, but it is class Dog
        Animal newCat = new Cat("jose"); // This is type animal, but is class Cat

        // Now call both MakeSound, which each object has it's own 'version' depending on which animal
        newDog.MakeSound();
        newCat.MakeSound();
    }
}