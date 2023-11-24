package Localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args) throws ParseException {
        var NFde = NumberFormat.getInstance(Locale.GERMAN);
        var NFfr = NumberFormat.getInstance(Locale.FRANCE);
        //var NFjp = NumberFormat.getInstance(Locale.JAPANESE);
        var NFin = NumberFormat.getInstance(new Locale("en","GB"));

        int attendees = 3200000;

        System.out.println(NFde.format(attendees));
        System.out.println(NFfr.format(attendees));
        //System.out.println(NFjp.format(attendees));
        System.out.println(NFin.format(attendees));
        //----------------------------------------------------------------------------
        double price =873763.785;

        var NCde = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        var NCfr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        var NCjp = NumberFormat.getCurrencyInstance(Locale.JAPANESE);

        System.out.println(NCde.format(price));
        System.out.println(NCfr.format(price));
        System.out.println(NCjp.format(price));
        //-------------------------------------------------------------------------------
        String income = NCfr.format(price);
        double resultPrice = (Double) NCfr.parse(income);
        System.out.println(resultPrice);

        String sales = "$926,382.85";
        var salesCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        double salesValue = (Double) salesCurrencyFormat.parse(sales);
        System.out.println(salesValue);

    }
}
