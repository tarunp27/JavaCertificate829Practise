package AAOperation;

public class FloatOperation {
    public static void main(String[] args) {
        double f1 = -10.0f;
        double f2 = -0.0f;
        Double f3 = null;
        double f = 0.0;
        short i1 = 10;
        short i2 = 0;
        int result = 0;
        try {
            f = f1 / f2;
//            result = i1/i2;
            f3 = f1 / f2;
            System.out.println(f);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(f3.isInfinite());
    }
}
