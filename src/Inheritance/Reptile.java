package Inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Rulees of overriding using exception
//access modifier of the inherited sub clss must have higher scope than parent class

public class Reptile {
    protected void SleepinShell() throws FileNotFoundException{}
    protected void hideinShell() throws IllegalArgumentException{}
    protected void exitShell() throws IOException {}
}
class GalaposTortoise extends Reptile{
   // public void SleepinShell() throws IOException{}
    public void hideinShell() throws NumberFormatException{}
    public void exitShell() throws FileNotFoundException {}
}
