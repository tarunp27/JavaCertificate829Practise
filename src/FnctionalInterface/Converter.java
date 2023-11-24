package FnctionalInterface;

public interface Converter {
    long round(double num);
}
class MathFunc{
    public static void main(String[] args) {
        Converter methodref = Math::round;
        Converter lambda = x-> Math.round (x);

        System.out.println(methodref.round(1669.77));
        System.out.println(lambda.round(2999.99));

    }
}
