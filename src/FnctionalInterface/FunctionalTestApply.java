package FnctionalInterface;

import java.util.function.Function;

public class FunctionalTestApply {

    public static void main(String[] args) {

        String[] countries = {"India", "China", "USA", "Russia", "UK", "Japan"};
        Function<String[],String> conveter = (all) -> {
            String names =" ";
            for(String n : all){
                String result = n.substring(0, n.indexOf(""));
                result = n.substring(n.indexOf("")) + " " + result;
                names += result + "\n";
            }
            return names;
        };
        System.out.println(conveter.apply(countries));
    }
}
