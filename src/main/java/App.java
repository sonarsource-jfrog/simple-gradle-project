import java.io.*;

public class App {
    
    public String getGreeting(String firstName, String lastName) {
        StringBuilder message = new StringBuilder("Hello");
        message.append(" ");
        message.append(firstName);
        message.append(" ");
        message.append(lastName);

        return message.toString();
    }

    public static void main(String[] args) {
        int i =0;
    }
}
