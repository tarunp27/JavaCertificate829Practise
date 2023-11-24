package Abstract;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

abstract class Bird{
    public abstract String getName();    //abstract class is a class that cannot be intansiated, abstract class may contain
    public void printName(){
        System.out.println(getName());
    }
}
public class Stork extends Bird{

    @Override
    public String getName() {
        return ("Stork");
    }

    public static void main(String[] args)   {
        Path zooPath1 = FileSystems.getDefault()
                .getPath("/home/tiger/data/stripes.txt");
        var file = new File("C:\\data\\zoo.txt");

        //Bird b1 = new Bird() ; cannot be
        Stork s1 = new Stork();
        s1.printName();
        new Stork().printName();

        final int numbers [] = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[0] = 10;   // allowed
        System.out.println(numbers);

        String [] names = new String[5];

        var list1 = new ArrayList<>();
        var list2 = new ArrayList<String>();
        list1.add("Pugal");
        list1.add(23);
        list2.add("Pugal");
//        list3.add(23);
        if (checkage()) {    // if can have method

        }

        boolean a = true;
        boolean b = true;
        if(a | b) {

        }


    }

    static boolean checkage() {
        return true;
    }
}

