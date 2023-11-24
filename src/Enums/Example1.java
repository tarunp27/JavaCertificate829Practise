package Enums;

import java.sql.Connection;

enum Beer{
    KF,KO,RC,FO;
        }

public class Example1 {
    public static void main(String[] args) {
        Beer b = Beer.FO;
        switch (b) {
            case KF:
                System.out.println("King Fisher");
                break;
            case KO, RC:
                System.out.println("Knock out and Royal challenge"); break;
            default:
                System.out.println("Others"); break;
        }
        System.out.println(String.class.getModule());
        System.out.println(Connection.class.getModule());
    }
}
