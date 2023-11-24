package Controls;

public class DataValues {
    public static void main(String[] args) {
        int i = 99;
        int j = 100;
        if (j == 99 && i++ == 100 ) {     //short circuit
            System.out.println("True");
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println("-----------------");
        if (j == 99 || i++ == 100 ) {     //short circuit
            System.out.println("True");
            System.out.println(i);
        }
        System.out.println(i);

        if (i++ == 100 && i++ ==101 ) System.out.println("True"); else System.out.println("false");;
        System.out.println(i);

        // assignment talk the least precedence
        boolean result;
        int ii = 99;
        int jj = 99;
        if (result = ii == jj ) {
            System.out.println("True");
        } else
        {
            System.out.println("False");
        }

    }
}
