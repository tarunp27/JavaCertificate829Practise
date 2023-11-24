package Lamda;

import java.util.ArrayList;
import java.util.List;


public class L_ex1 {
    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("Long ear");
        bunnies.add("Long nose");
        bunnies.add("Hoppy");

        bunnies.forEach(s-> System.out.println(s));
    }
}
