import java.util.Scanner; //Import Scanner to get the user input

public class Main {
    public static void main(String... args) {
        Message message = new TextMessage();

        // Get the recipient (name) from the user
        Scanner readName = new Scanner(System.in); // scanf()???
        String Username = readName.nextLine(); // Get the actual user input

        // Assign the user name as the recipient
        message.setRecipient(Username);
        System.out.println(message.getRecipient());

        // Create an object of TextMessage
        TextMessage msg = new TextMessage();

        Scanner readMsg = new Scanner(System.in); // Create a new scanner object
        String UserMessage = readMsg.nextLine();

        // Set the message (with the message prompted by the user)
        msg.setMessage(UserMessage);
        String the_message = msg.getMessage(); // This will get the message

        System.out.println(the_message);
    }

}
