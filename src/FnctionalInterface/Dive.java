package FnctionalInterface;

/*this is a functoinal interface because this contains only one single abstract method.
other methods such as toString(),int hashCode(), boolean equals() is not considered is coming from objext class
and it should not be considered.
*/
public interface Dive {
    String toString();
    int hashCode();
    boolean equals(Object o);
    public void dive();
}
