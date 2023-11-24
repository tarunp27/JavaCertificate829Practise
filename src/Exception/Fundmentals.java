package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Fundamentals{
    public static void main(String[] args) throws IOException {
        if (args != null)  {
//            System.out.println("Not null $$$$");
//            throw new FileNotFoundException("$$$ Exception occured $$$");
            try {
                System.out.println("Not null $$$$");
                throw new IOException("$$$ IOException occured $$$");
            }
            catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
    }
}