package Collection;

public class NullEx {
    public static void main(String[] args) {
        try {
            amethod();
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("out");
    }
    static private void amethod () {
    }
}



