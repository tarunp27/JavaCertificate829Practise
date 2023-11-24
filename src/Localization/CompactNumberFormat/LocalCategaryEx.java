package Localization.CompactNumberFormat;

import Classes.C;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalCategaryEx {
    public static void main(String[] args) {
        var spain = new Locale("es","ES");
        var money = 1.23 ;

        //print with default Locale
        Locale.setDefault(new Locale("en","US"));
        printCurrency(spain,money);

        //print with selected  locale display
        Locale.setDefault(Locale.Category.DISPLAY,spain);
        printCurrency(spain,money);

        // Print with selected locale format
        Locale.setDefault(Locale.Category.FORMAT, spain);
        printCurrency(spain, money);  // 1,23 ₠, español
    }
    public static void printCurrency(Locale locale, double money){
        System.out.println(NumberFormat.getCurrencyInstance().format(money)+"," + locale.getDisplayLanguage());
    }
}
