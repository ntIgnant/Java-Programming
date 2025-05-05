import java.util.Scanner; // Import the java Scanner to get imput from the user

class Book{
    String name;
    String genre;
    int pages;
    double price;

    // Constructor of the class (like __init__)
    public Book(String name, String genre, int pages, double price){
        this.name = name;
        this.genre = genre;
        this.pages = pages;
        this.price = price;
    }

    public void PrintData(){
        System.out.printf("--Book Data--\nName: %s\nGenre: %s\nPages: %d\nPrice: $%.2f\n", this.name, this.genre, this.pages, this.price);
    }
}

// Top-Level Public class (must match with the file name)
public class Library{
    public static void main(String[] args){

        // Create the class instance (object)
        Book book1 = new Book("The Echo of Midnight", "Mystery", 384, 17.99);
        book1.PrintData();
    }
}