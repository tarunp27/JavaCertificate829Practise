package Classes.SealedClass;

public class SealedEx1 {
}
    abstract sealed class NewClass permits classNew, classNew2, classNew3 {                   //sealed or non sealed
    }

    final class classNew extends NewClass {
    }

    non-sealed class classNew2 extends NewClass {
    }

    sealed class classNew3 extends NewClass {

    }

    final class SubNew extends classNew3 {
    }


