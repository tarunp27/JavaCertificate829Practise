package SealedClass;

public sealed class Person permits Employee,Worker,Students {
}
final class Employee extends Person{

}
non-sealed class Students extends Person{

}
sealed class Worker extends Person permits TemporaryWorker {

}
final class TemporaryWorker extends Worker {

}
//final class Hospital extends Person{}
abstract sealed class Wolf permits Timber{}
final class Timber extends Wolf{}

