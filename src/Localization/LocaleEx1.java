package Localization;

import java.util.Locale;

public class LocaleEx1 {
    public static void main(String[] args) {
        Locale l1 = Locale.getDefault();
        System.out.println(l1.getCountry()+ "_____" +l1.getLanguage());
        System.out.println(l1.getDisplayCountry()+"____"+l1.getDisplayLanguage());

//        Locale l2 = new Locale("pa","IN");
//        Locale.setDefault(l2);
//        System.out.println(Locale.getDefault().getDisplayLanguage());

        String[] s3 = Locale.getISOLanguages();
//        for(String s4:s3){
//            System.out.println(s4);
//        }

        String []s4 = Locale.getISOCountries();
//        for(String s5:s4){
//            System.out.println(s5);
//        }

        Locale[]s = Locale.getAvailableLocales();
        for(Locale s1:s){
            System.out.println(s1.getDisplayCountry()+".."+s1.getDisplayLanguage());
        }
    }
}
