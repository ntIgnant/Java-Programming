// Import the scanner utility
import java.util.Scanner;

public class musicPlayer {

    public static void main(String[] args){
        String musPlayer = "Music Playing...\nWanna stop the music(yes/no): ";

        boolean isOnRepeat = true; // Initial flag for music player (change to false to stop the music player)

        while (isOnRepeat){
            // Create the scanner object
            Scanner input = new Scanner(System.in);

            System.out.print(musPlayer);
            String userOpt = input.nextLine().toLowerCase(); // Get the actuall user input and pass it trough lowercase

            if(userOpt.equals("yes")){
                isOnRepeat = false;
            }
            // else {do nothing}
        }

        System.out.println("Bye...");
    }
}