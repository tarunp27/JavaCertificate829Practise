package Annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVar2 {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("A","B");
        List<String> l2= Arrays.asList("C","D");

        m1(l1,l2);
    }
    // when compiled outside without safvarargs it will give heap pollusion warnings.
    //  To suppress the warning we need to use @safeVarargs.
    //@SafeVarargs
    public static void m1(List<String>... l){
        for(List<String> l1: l){
            System.out.println(l1);
        }
    }
}
