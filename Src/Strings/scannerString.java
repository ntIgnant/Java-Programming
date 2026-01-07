// Import the Scaner utility in order to use Scanner (for input)
import java.util.Scanner;

public class scannerString {

    public static void main(String[] args){
        System.out.print("Hi! What's your name: ");

        // Create a new scanner for the user input
        Scanner input = new Scanner(System.in); // Create a new scanner oject for the input
        String userName = input.nextLine(); // Get the actuall string (name) from the user

        // Close the scanner object
        input.close();

        System.out.println("Hello " + userName + " what's good!");
    }
}