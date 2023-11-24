package TextBlock;

import java.util.Arrays;
import java.util.Locale;

public class Transform_Ex {
    public static void main(String[] args) {
        String op1 = "chiefs".transform(s -> s.toUpperCase());
        System.out.println(op1);
        System.out.println(op1.length());
        String op2 = """
                chiefs\
                """.transform(s -> s.toUpperCase());
        System.out.println(op2);
        System.out.println(op2.length());
        System.out.println();
        int [] i = {1,6,9};
        int [] j = {7,5,1};
        System.out.println(Arrays.compare(i,j));
    }
}
