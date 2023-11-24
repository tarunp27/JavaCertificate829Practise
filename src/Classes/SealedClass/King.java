package Classes.SealedClass;

public sealed class King permits Counseller, Duke, Soldier {
}

final class Counseller extends King {

}

final class Duke extends King {

}

sealed class Soldier extends King {

}

final class people extends Soldier {

}
