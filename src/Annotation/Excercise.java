package Annotation;

public @interface Excercise {
    int hoursPerDay();            // this is a required field/data
    int startHour() default 6;    // this is optional data
}

