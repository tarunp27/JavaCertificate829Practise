package Generics;

import java.util.ArrayList;
import java.util.List;

public class PrintNames {
    public static void main(String[] args) {
        //List names = new ArrayList();
        List <String > names = new ArrayList<String>();
        //names.add(new StringBuilder("Tarun"));   //classcast exception
        names.add("Tarun");
        names.add("neha");
        names.add("mala");
        prtNames(names);
    }
    static void prtNames(List list){
        for(int i= 0;i<list.size();i++){
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }
}
