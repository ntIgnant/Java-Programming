import java.util.Scanner; // Import scanner to get user input
import java.util.Arrays;  // Import Arrays utility for 'contains' logic

public class User {
    public static void main(String[] args) {

        // Code where the user enters an operator (as string e.g. 'add') and two numbers
        Scanner readNum = new Scanner(System.in);

        int num1 = 0, num2 = 0; // Initialize the variables outside the loop

        while (true) {
            try {
                System.out.printf("Please enter a number: ");
                num1 = Integer.parseInt(readNum.nextLine()); // Get user input (num1) | Then parse it as int

                System.out.printf("Please enter a 2nd number: ");
                num2 = Integer.parseInt(readNum.nextLine()); // Read second number (num2) | Then parse

                break; // Exit the loop if everything goes ok
            } catch (Exception e) {
                System.out.println("Error with the datatype (please add numbers only)");
            }
        }

        // Array containing the allowed operators
        String[] operators = {"add", "sub", "mult", "div"};

        // Print the available operations
        System.out.println("-Please enter one of the following-");
        for (String op : operators) {
            System.out.printf("- %s\n", op);
        }

        Scanner readOp = new Scanner(System.in); // Create scanner object

        String userOp; // Initialize the string variable (will be used in the loop)

        // Get the user string (for the operator)
        while (true) {
            System.out.printf("Operator: ");
            userOp = readOp.nextLine().toLowerCase(); // Get input and convert to lowercase for uniform format

            if (Arrays.asList(operators).contains(userOp)) {
                break;
            } else {
                System.out.println("Invalid operator, Try again");
            }
        }

        // Evaluate the cases

        // Close the Scanners
        readOp.close();
        readNum.close();
    }
}
