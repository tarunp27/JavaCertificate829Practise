package Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class PrintWelcome {
    public static void printMessage(Locale locale){
        var rb = ResourceBundle.getBundle("Zoo",locale);
        System.out.println(rb.getString("hello")+", "+rb.getString("open"));
    }
    public static void main(String[] args) {
//        Locale l2 = new Locale("pa","IN");
//        Locale.setDefault(l2);

        var us = new Locale("en","US");
        var france = new Locale("fr","FR");
        printMessage(us);
        printMessage(france);
    }
}
