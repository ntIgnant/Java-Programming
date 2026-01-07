import java.util.Scanner; // impor the scanner utility for user input

public class TeaTime {

    // Random Function logic
    public static void announceTeaTime(){
        System.out.println("Hello, please tell me your name!");
        Scanner input = new Scanner(System.in); // Create the scanner object
        String userName = input.nextLine();

        System.out.println("Excelent, well " + userName + " its TeaTime!");
    }


    // Main Function
    public static void main(String[] args){
        announceTeaTime(); // Call the function
    }
}