package Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo2 {
    public static void main(String[] args) {
        double d = 123456.789;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
        System.out.println("Italy Form is: " + nf.format(d));
        System.out.println();
        //PROGRAM TO DISPLAY JAVA NUMBER IN JAPANA,UK,US AMD INDIA CURRENC FORMS
        Locale INDIA = new Locale("en","IN");
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("India currency form is: " + nf1.format(d));
        System.out.println("Japan currency form is: " + nf2.format(d));
        System.out.println("UK currency form is: " + nf3.format(d));
        System.out.println("US currency form is: " + nf4.format(d));
    }
}
