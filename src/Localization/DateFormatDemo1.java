package Localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo1 {
    public static void main(String[] args) {
        DateFormat uk = DateFormat.getDateInstance(0, Locale.UK);
        DateFormat us = DateFormat.getDateInstance(0, Locale.US);
        DateFormat italy = DateFormat.getDateInstance(0, Locale.ITALY);

        System.out.println("UK style is: " + uk.format(new Date()));
        System.out.println("US style is: " + us.format(new Date()));
        System.out.println("ITALY style is: " + italy.format(new Date()));
    }
}
