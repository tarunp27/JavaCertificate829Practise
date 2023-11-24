package Classes.SealedClass;

import javax.swing.*;

public class SealedInterfaceEx {
}
sealed interface Swims permits Duck,Swan,Floats{
}
final class Duck implements Swims{
}
final class Swan implements Swims{
}
/*
final interface Floats extends Swims{              final not allowed because interface implicitly abstract and both cannot be togerther
}
*/
sealed interface Floats extends Swims{
}
non-sealed interface SuperFloat extends Floats{
}

