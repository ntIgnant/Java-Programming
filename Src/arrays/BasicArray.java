// Import utility to work with arrays in Java
import java.util.Arrays;

public class BasicArray{
    public static void main(String[] args){

        // Basic array of integers declaration
        int[] numAr = new int[10]; // Declare an integer array for 10 INTEGERS (not byte like in C)

        // Assign a specific index of the array, the rest are zero by default

        int counter = 0; // This will works as counter and value-index for the arrya
        while(counter < 10){
            numAr[counter] = counter;
            counter += 1;
        }

        System.out.printf("This array is: ");
        System.out.println(Arrays.toString(numAr));

        int[] newNumAr = {1, 2, 3, 4, 5}; // Declare an array of numbers manually

        // Print the new array with for loop
        System.out.printf("This other array is: [");
        for(int i : newNumAr){
            System.out.printf("%d ", i);
        }
        System.out.println("]"); // just to add the newlinec character
    }
}