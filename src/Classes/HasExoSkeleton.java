package Classes;

public interface HasExoSkeleton {
    double size =2.0;
    abstract int getNumberofSection();
}
abstract class Insect implements HasExoSkeleton {
    abstract int getNumberOfLegs();
}
class Beetle extends Insect {
    int getNumberOfLegs() { return 6; }
    public int getNumberofSection() { return 1; }
}
