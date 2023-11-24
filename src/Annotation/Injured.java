package Annotation;

public @interface Injured {
    String veterinarian() default "unnassigned";
    String value() default "foot";
    int age() default 1;
}
