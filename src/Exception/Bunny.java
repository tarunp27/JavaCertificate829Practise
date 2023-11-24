package Exception;

class NoMoreCarrotException extends Exception{}
public class Bunny {
    public static void main(String[] args) throws Exception {
        eatCarrot();
    }
    private static void eatCarrot() throws NoMoreCarrotException {}
}
