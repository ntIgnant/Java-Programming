import java.util.Arrays;

public class stringIndexing {

    // Some String related methods
    // .charAt(index) // | This returns the character of the array (string) at a specific index

    public static void main(String[] args){
        String firstName = "Oscar";
        String lastName = "Diaz";
        int age = 19;

        // Basic string concatenation
        String fullName = firstName + lastName; // "OscarDiaz"
        System.out.println("My name is " + fullName);

        // Print out characters of specific indexes
        char char1 = fullName.charAt(0);
        char char2 = fullName.charAt(4);

        int i = fullName.length()-1; // The last index of the char array
        int j = fullName.length()-2; // The second last inex of the char array
        char char3 = fullName.charAt(i);
        char char4 = fullName.charAt(j);

        // Print the generated 'name' based on indexed-characters of the fullName
        String emptyStr = ""; // Empty string for char concatenation
        String newName = emptyStr+char1+char2+char3+char4;
        System.out.println("My new name is " + newName + "!");
    }
}