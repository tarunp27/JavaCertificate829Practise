package Wrapper;

interface InterOver{
    void m1();
}

public class InterfaceOverride implements InterOver {
    String name = """                          
            "Pugalendi" """;

    public void m1() {               // should be public because parent interface method is implicit public.
        System.out.println("Hello");
    }
}
