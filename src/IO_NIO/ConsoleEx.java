package IO_NIO;
//do not run here, run at cmd .1q
import java.io.Console;
import java.util.Arrays;

public class ConsoleEx {
    public static void main(String[] args) {
        Console console = System.console();
        if(console !=null){
            String userInput = console.readLine();
            console.writer().println("You have entered " + userInput);
            char[] password = console.readPassword("Enter password ");
            char[] verify = console.readPassword("Enter Password again: ");
            console.printf("Passwords "+(Arrays.equals(password,verify) ? "match" :"do not match"));
        }
        else{
            System.out.println("console not available");
        }
    }
}