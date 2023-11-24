package Annotation;

public class Bear {
}
enum Size{SMALL,MEDIUM,LARGE}

@interface Panda{
   // Integer height();                //Wrapper class not allowed
   //  String[][] generalInfo();        //multiple arrays not allowed
    Size size() default Size.SMALL;  //valid
   // Bear friendlyBear();             //class type not allowed

    Excercise excersie() default @Excercise(hoursPerDay = 2);//valid

    //access modifiers private and protected not allowed only public allowed
    //if access modifier not specified it is implicitly public
    //final also cannot be used

    int MIN_VOLTAGE = 2;              //constant variable
    //this constant variable is implictly   public static final
}