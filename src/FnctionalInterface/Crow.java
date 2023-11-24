package FnctionalInterface;

import java.util.function.Consumer;

//referencing variable from lambda body
public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
//        name = "catly";
        color = "black";

        Consumer<String> consumer = s -> System.out.println(s +" "+  name + "says" + volume + "that  she is " + color);
//        volume= "softly";
    }
}
