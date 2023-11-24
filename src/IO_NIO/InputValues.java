package IO_NIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValues {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();
        System.out.println("You have entered "+ userInput);
    }
}
