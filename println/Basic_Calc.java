import java.util.Scanner; // Import Scanner from java standard library

public class Basic_Calc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // This creates a new object, input that is type Scanner


        // Get the operation to perform
        System.out.println("-Please Select one of the following operations-");

        System.out.printf("(+, -, *, /): ");
        String operation = input.nextLine(); // To get the input in Java needs to be separated from the string (it's not like input in py)

//        System.out.printf("Chosen Operation: %s\n", operation); // DEBUGG ONLY

        // Validate the operation
        String[] validOps = {"+", "-", "*", "/"};
        boolean opIsValid = false; // flag to validate the operation

        for(String op : validOps){
            if(op.equals(operation)){
                opIsValid = true; // Change the validation flag to true if the operation was found in the array
                break;
            }
        }

        // Validate the falg
        if(opIsValid == false){
            System.out.println("Sorry, the operation was invalid");
            System.exit(0); // Exit the program
        }


        System.out.printf("Give me a Number: ");
        int num1 = input.nextInt(); // Get the first number

        System.out.printf("Now, another Number: ");
        int num2 = input.nextInt(); // Get the second number

//        System.out.printf("Obtained input: %s %d %d\n", operation, num1, num2); // DEBUGG ONLY

        // Now, evaluate the operation that was obtained from the user

        float answer = 0.0f; // Operation result will be stored here

        if(operation.equals("+")){
            answer = num1 + num2;
        }
        else if(operation.equals("-")){
            answer = num1 - num2;
        }
        else if(operation.equals("*")){
            answer = num1 * num2;
        }
        else if(operation.equals("/")){
            if(num2 == 0){
                System.out.println("Couldn't Perform the Operation - ZeroDivisionErr");
                System.exit(0); // Termante the program
            }
            else{
                answer = num1 / num2;
            }
        }

        System.out.printf("%d%s%d = %.3f\n", num1, operation, num2, answer); // Print out the result
    }
}