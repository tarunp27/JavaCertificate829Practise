public class JammedTurkeyCage implements AutoCloseable{
    public void close() throws IllegalStateException{
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
//        try(JammedTurkeyCage t = new JammedTurkeyCage()){
//            System.out.println("Put turkeys in");
//        }
//        catch (IllegalStateException e ){
//            System.out.println("Caught:" + e.getMessage());
//        }

        /*
        try(JammedTurkeyCage t = new JammedTurkeyCage()){
            throw new IllegalStateException("Turkey ran off");
        }
        catch(IllegalStateException e){
            System.out.println("Caught:" + e.getMessage());
            for (Throwable t : e.getSuppressed())
            {
                System.out.println("Suppressed " + t.getMessage());
            }
         */

//        try(JammedTurkeyCage t = new JammedTurkeyCage()){
//            throw new RuntimeException("Turkeys ran off");
//        }
//        catch (IllegalStateException e){
//            System.out.println("Caught: "+ e.getMessage());
//        }

        try(JammedTurkeyCage t = new JammedTurkeyCage()){
            throw new IllegalStateException("Turkey ran off");
        }
        finally {
            throw new RuntimeException("and we couldnt find them");
        }
            }
        }


