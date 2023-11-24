package Localization;

import java.util.Locale;

public class NewEx {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale locale1 = Locale.GERMAN;  //1st way of defining locale
        System.out.println(locale1);

       // Locale locale2 = new Locale("KANNADA","karnataka");//it allows anything
        Locale locale2 = new Locale("hi","fr");   //2nd WAY
        System.out.println(locale2);

        Locale locale3 = new Locale.Builder().setLanguage("kanada").setRegion("KA").build();  //this allows anything too
        System.out.println(locale3);               //3rd way

        Locale locale4 = new Locale("hi","IN");
        Locale.setDefault(locale4);
        System.out.println(Locale.getDefault());
    }
}
