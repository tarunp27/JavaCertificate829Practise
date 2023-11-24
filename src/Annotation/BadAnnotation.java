package Annotation;

public @interface BadAnnotation {
   // String name() default new String(" ");   //does not comppile // its not a csntant
    String address() default "";
    //String title () default null;           //does not complie // null is not permitted // empty string is permitted
}
