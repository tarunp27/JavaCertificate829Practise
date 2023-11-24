package SealedClass;

public sealed class Snake {
}
final class Cobra extends Snake{}

sealed class  Cat permits Cat.kitty{//using inner class in sealed class
    final class kitty extends Cat{}
}