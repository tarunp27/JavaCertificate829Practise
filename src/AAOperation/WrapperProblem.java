package AAOperation;

public class WrapperProblem {
    public static void main(String[] args) {
//        Byte b = 1;
//        Integer i = 1;
//        System.out.println(b==i);  // both are different class cannot be compared.
        compareWrapper("0");
        compareWrapper("-1");
        compareWrapper("127");
        compareWrapper("-256");
        compareWrapper("256");
        compareWrapper("1000");
       // compareWrapper("1_00");   // error during parse
    }

    public static void compareWrapper(String s) {
        Integer i = Integer.parseInt(s);
        Integer j = i;
        i--;
        i++;
        System.out.println((i==j));
    }
}
