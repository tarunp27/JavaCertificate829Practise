package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMethods {
    public static void main(String[] args)  throws Exception {
        if (args.length == 0) m2();
        else m3();
    }

    public static void m2() throws FileNotFoundException  {
        throw new FileNotFoundException();
    }

    public static void m3() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }

}
