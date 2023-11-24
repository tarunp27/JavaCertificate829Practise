package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

class CanNotHopException extends Exception{}

public class Hopper {
    public void hop() throws CanNotHopException{}
}
class Bunny1 extends Hopper{
    //public void hop()throws CanNotHopException{}  // if method does not have dont use throws
}
class Bunny2 extends Hopper{
    public void hop(){}  // but if method has its not neccessary to throws
}
class NewExcep {
    public void seeAnimal() {
        System.out.println();
    }

    public void visitMonkey() {
        try {
            seeAnimal();
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {

        }
    }
}