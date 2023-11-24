package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardEx {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3,45,6,7);

        System.out.println("Total Sum: " + sum(list1));
    }
    private static double sum(List<? extends Number> list){
        double sum = 0.0;
        for(Number i : list){
            sum+=i.doubleValue();
        }
        return sum;
    }
}
