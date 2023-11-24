package Exception;

public class RuntimeExcep {
    // ArithmeticException is a run time exception, it should be handled in the program using try/catch.
// program should be corrected
    public static int i = 0;

    public static void main(String[] args) {
//        int answer = 11 / i;
        int answer;
        if (i != 0)
            answer = 11 / i;
        else
            answer = 0;
        System.out.println(answer);

        // arrayindexout of bound exception is a lso runtime exception
        int total = 0;
        int[] counts = new int[3];
        for (int j = 0; j < counts.length;j++){  // not using j <= counts.length;
            total += counts[j];
        }
    }
}
