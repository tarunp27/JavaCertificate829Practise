package Exception.TryRes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile2 {
    public static void main(String[] args) {
        try(FileInputStream is = new FileInputStream("MyFile.txt");
        Scanner s = new Scanner(System.in)){
            //read file
        }
        catch(IOException e){
            //s.nextLine();
            //is.close();              cannot be used as this is closed after try block before catch
            e.printStackTrace();
        }
    }
}
