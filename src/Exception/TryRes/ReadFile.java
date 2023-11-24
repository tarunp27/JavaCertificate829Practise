package Exception.TryRes;

import java.io.FileInputStream;
import java.io.IOException;

// this is a long method using try catch block and closing the resources
//here resources is file input stream which needs to be closed

public class ReadFile {
    public static void main(String[] args) {
        FileInputStream is = null;
        try{
            is = new FileInputStream("myFile.txt");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally {
            if(is!=null){
                try{
                    is.close();
                }
                catch (IOException e2){
                    e2.printStackTrace();
                }
            }
        }
    }
}

