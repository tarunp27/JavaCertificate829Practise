package Enums;
//VERY IMPORTSNT , the contructot will only run once for one object here there are fout objrct so construtor will run four times
enum Beer1{
    KF,KO,RC,FO;

    Beer1(){
        System.out.println("Constructor");
    }
}

public class Enumex4 {
    public static void main(String[] args) {
        Beer1 b1 = Beer1.FO;
        System.out.println("FO");

        Beer1 b2 = Beer1.KF;
        System.out.println("KF");

        //System.out.println(Beer1.KF);
    }
}
