package Localization;

import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceEx1 {
    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hell") + "," + rb.getString("open"));
//        rb.keySet().stream()
//                .map(k->k+":"+rb.getString(k))
//                .forEach(System.out::println);
    }

    public static void main(String[] args) {
//        Locale.setDefault(Locale.JAPAN);
//        System.out.println(Locale.getDefault());
        // var us = new Locale("ja","JP");
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");
        // printWelcomeMessage(us);
        // printWelcomeMessage(france);
        System.out.println("-------------------------------");
        Locale.setDefault(new Locale("hi"));
        ResourceBundle rb2 = ResourceBundle.getBundle("Zoo", new Locale("ta"));     //removed "name" form Zoo_en
        System.out.println(rb2.getString("name"));
//        String [] saname = rb2.getStringArray("name");      // not working...
//        for (String sa1: saname) {
//            System.out.println(sa1);
//        }
        System.out.println("-------------------------------");

        // pull all keyes from resource bundle
        Enumeration<String> en = rb2.getKeys();
        while (en.hasMoreElements()) {
            String key = en.nextElement();
            String val = rb2.getString(key);
            System.out.println(key + " : " + val);
        }
        System.out.println("-------------------------------");


        // String result = rb2.getString("name");
        //System.out.println(MessageFormat.format(result,"HSR Layout","Bangalore"));

        var props = new Properties();
        props.setProperty("name1", "ourzoo");
        props.setProperty("open", "10Am");
        System.out.println(props.getProperty("dog"));          //null  -> dog not availbale
        System.out.println(props.getProperty("name", "pugal"));  //pugal->not found but pugal available
        System.out.println(props.getProperty("name1", "pugal")); //ourzoo->available from property
        System.out.println(props.get("name1"));  //ourzoo
        System.out.println(props.get("name2"));  //null ->name no available
        System.out.println(props.get("open"));     //10Am
    }
}
