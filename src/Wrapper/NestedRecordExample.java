package Wrapper;

class classxx{

}

record TopEmployee (String name, int age)
{
   static String name2 = "Raghu";
};

public class NestedRecordExample {
    record InnerEmployee(String name, int age){};

    TopEmployee te = new TopEmployee("Pugalendi",58);
    InnerEmployee ie = new InnerEmployee("Tarun", 27);

}
