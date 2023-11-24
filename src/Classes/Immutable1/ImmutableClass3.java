package Classes.Immutable1;
//immutable object using deep copy

import javax.swing.text.html.parser.Entity;

public class ImmutableClass3 {
    private final int id;
    private final String name;
    private final Engine engine;
    public Engine ee;

    public ImmutableClass3(int id,String s, Engine e){
        this.id=id;
        this.name =s;
        Engine newEngine = new Engine(e.speed);       //deep copy
        this.engine=newEngine;
        ee= newEngine;
    }

//    public int getid(){
//        return id;
//    }
//    public String getName(){
//        return name;
//    }

    public static void main(String[] args) {
        Engine e = new Engine(50);
        ImmutableClass3 a = new ImmutableClass3(1,"java",e);
        System.out.println(a.engine.speed);
        e.speed=70;
        a.ee.speed=99;
        System.out.println(a.engine.speed);
    }
}
