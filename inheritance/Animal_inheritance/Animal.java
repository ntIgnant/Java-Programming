public abstract class Animal{
    public String name; // This should be modifiable form 'MainAnimal.java'

    // Class constructor
    public Animal(String name){
        this.name = name;
    }

    // So this class will be override depending on the child
    public abstract void MakeSound(String name);
    // For example, if the child is

    // Dog, it should make Woof
    // Cat, it should make Mew (or some shit like that)

}