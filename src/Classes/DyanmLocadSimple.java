package Classes;

class Human{
    static int age = 10;
    static {
        System.out.println("Human blovk");
    }
}

class Animals
{
    static {
        System.out.println("Animal block");
    }
}

public class DyanmLocadSimple {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Dynamic Block");
    }
    public static void main(String[] args) {
        int i = 10;
       // new DyanmLocadSimple();
        System.out.println(Human.age);
    }
}
