package Inheritance;

//overriding rules  related to return type

public class Rhino {
    protected CharSequence getName(){
        return "Rhino";
    }
    protected String getColor(){
        return "Grey,Black or White";
    }
}
class JavanRhino extends Rhino{
    public String getName(){
        return "JavaRhino";
    }
    //public CharSequence getColor(){             Dosnt compile because charsequence is not a sub class of string type
       // return "Grey";
   // }
}
