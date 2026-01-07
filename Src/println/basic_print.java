public class basic_print {
    public static void main(String[] args){
            System.out.println("Hi, this includes newline character at the end");

            String word = "FORMATING";
            int num1 = 10;
            System.out.printf("This has manual %s | random number: %d\n", word, num1); // WITHOUT the andpercent char

            // Example of a constatn variable
            final int num2 = 20; // Any attemp to change the value of num2 will result in a compile-time error

            // Example string concatenation
            int num3 = 30;
            int num4 = 40;

            String half_message = "My secret number is ";

            final String full_message = half_message + num3+num4; // This should result in 'My secret number is 3040' (without newline char)
            // For string concatenation with numbers, num1 + num2 would be literally connected as strings

            System.out.println(full_message); // Use println to terminate the string with a newline char
    }
}