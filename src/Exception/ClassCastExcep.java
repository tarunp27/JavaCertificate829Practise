package Exception;

//class casst exception

public class ClassCastExcep {
    public static void main(String[] args) {
        String type= "mouse";
        Object obj = type;
        Integer number = (Integer) obj;
    }
}
