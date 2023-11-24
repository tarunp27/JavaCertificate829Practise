package Localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {

        System.out.println("Full Form is..." + DateFormat.getDateInstance(0, Locale.US).format(new Date()));
        System.out.println("Long Form is..." + DateFormat.getDateInstance(1, Locale.US).format(new Date()));
        System.out.println("Medium Form is..." + DateFormat.getDateInstance(2, Locale.US).format(new Date()));
        System.out.println("Short Form is..." + DateFormat.getDateInstance(3, Locale.US).format(new Date()));
        //default is indian style
        System.out.println("Default Form is..." + DateFormat.getDateInstance().format(new Date()));
    }
}
