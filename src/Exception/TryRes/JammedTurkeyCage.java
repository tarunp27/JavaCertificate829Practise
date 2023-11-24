package Exception.TryRes;

import java.io.IOException;
import java.rmi.RemoteException;

public class JammedTurkeyCage implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new RuntimeException("Turkey ran off");
        } catch (IllegalStateException e) {
            System.out.println("Caught " + e.getMessage());
            e.printStackTrace();
        } finally {

        }
    }
    public void whatHappensNext() throws IOException{
        System.out.println("its ok");
            throw new IllegalArgumentException();
    }
}
