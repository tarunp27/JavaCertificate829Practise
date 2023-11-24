package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CreateCollection {
    public static void main(String[] args) {

        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "z";

        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        // of.add("x");     //
        // of.set(0,"f");   // immutable list

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers);
        //.................................................................................................
        //Iterator
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer s = it.next();
            System.out.println(s);
        }
    }
}

