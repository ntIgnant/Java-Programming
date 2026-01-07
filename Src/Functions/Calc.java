import java.util.Scanner; // Import the scanner utility

public class Calc {

    // Main function
    public static void main (String[] args){

        System.out.print("Please Enter a Number: ");

        // Create the Scanner object
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(); // Get thr user input | NOTE: nextInt() for int reading

        System.out.print("Please enter another Number: ");
        int num2 = input.nextInt(); // Get th second number form the user | NOTE: nextInt() for int reading


        // Now, once the two numbers were collected, prompt the user to decide the operation
        System.out.print("Please prompt an operation (+, -, *, /): ");
        String userOp = input.nextLine(); // | NOTE: nextLine() for String reading

        // Close the inputt
        input.close();

        // Set the value as 0 for the result of the clculation
        int calcResult = 0;

        switch (userOp){
            case "+":
                calcResult = sumNums(num1, num2); // Get th result with the sum logic
                break;
            default:
                System.out.println("Oops, something went wrong...");
                break;
        }

        // Conver to the user numbers to strings
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);

        // Convert the calc result to String for Output representation
        String strCalcRes = Integer.toString(calcResult);

        System.out.println("The result of " + strNum1 + userOp + strNum2 + " is " + strCalcRes);

    }

    // Function for the sum (+) logic
    // Note: This function will retun an int type
    public static int sumNums(int a, int b){
        int result = a - b;
        return result;
    }
}