package Localization;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.util.Locale.US;

public class NumberForEx {
    public void print(double t) {
        System.out.print(NumberFormat.getCompactNumberInstance().format(t));
    }
    public static void main(String[] args) {
        Locale.setDefault(new Locale("nu","NY"));
        System.out.println(Locale.getDefault());
        double t = 100_102.2;
        System.out.println(
                NumberFormat.getCompactNumberInstance(
                        Locale.getDefault(), NumberFormat.Style.SHORT).format(t));
        System.out.println(NumberFormat.getCurrencyInstance().format(t));
        var f = DateTimeFormatter.ofPattern("hh' o''clock'" );
        System.out.println(f.format(LocalDateTime.now()));
    }
}

