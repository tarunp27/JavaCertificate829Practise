package Classes.SealedClass;

public class SealedEx2 {
}
sealed class Bike permits Tvs,Bike.Yamaha,Bike.KTM{
    final class Yamaha extends Bike{
    }
    sealed class KTM extends Bike{
    }
    final class Duke extends KTM{
    }
}
final class Tvs extends Bike{
}