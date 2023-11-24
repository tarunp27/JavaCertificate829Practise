package Annotation;

public abstract class Elephant {
    @Injured("Legs")
    public void fallDown() {
    }

    @Injured(value = "Legs",age = 25)
    public abstract int trip();

    @Injured
    String injuries[];
}

