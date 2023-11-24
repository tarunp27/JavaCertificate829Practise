package Serializtion;

import java.io.Serializable;

public class Chimpanzee implements Serializable {
    private static final Long serialVersionUID = 2L;
    private transient String name ;
    private int age =10;
    private static char type;
    public static int height;
    {
        this.age=14;
        height=44;
    }
    public Chimpanzee(){
        this.age=12;
        this.name = "unknown";
        this.type = 'Q';
    }

    public Chimpanzee(String name, int age,char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type="+type+
                ", height="+height+
                '}';
    }
}
