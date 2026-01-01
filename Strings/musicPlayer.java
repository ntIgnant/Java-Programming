// Import the scanner utility
import java.util.Scanner;

public class musicPlayer {

    public static void main(String[] args){
        String musPlayer = "Music Playing...\nWanna stop the music(yes/no): ";

        boolean stopMusic = false; // Initial flag for music player (change to true to stop the music player)

        while (stopMusic == false){
            // Create the scanner object
            Scanner input = new Scanner(System.in);

            System.out.print(musPlayer);
            String userOpt = input.nextLine().toLowerCase(); // Get the actuall user input and pass it trough lowercase

            if(userOpt.equals("yes")){
                stopMusic = true;
            }
            // else {do nothing}
        }

        System.out.println("Bye...");
    }
}