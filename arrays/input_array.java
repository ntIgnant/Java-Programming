// Import standard Java libraries for Scanner and Arrya
import java.util.Arrays;
import java.util.Scanner;

public class input_array{
    public static void main(String[] args){

        // Create a new scanner object (instance)
        Scanner myScanner = new Scanner(System.in);

        // Get the name and age from the user
        System.out.printf("Please enter your name: ");
        String username = myScanner.nextLine();

        System.out.printf("Please enter your age: ");

        // Handle the potential error of the input
        while (!myScanner.hasNextInt()){
            System.out.printf("Please enter a valid age: ");
            myScanner.nextLine(); // Clears the invalid input from the scanner
            // Here, the scanner gets the input, end evaluates it based on the while loop statement
            // If it is not 'int', it clears the input buffer
        }
        int userage = myScanner.nextInt(); // Get the input for the age (int)

        // Print the obtained information
        System.out.printf("This is %s and he is %d years old\n", username, userage);

        // Now, create an array for 3 numbers, and the user needs to enter the numbers
    }
}