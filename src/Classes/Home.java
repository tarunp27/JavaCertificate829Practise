package Classes;

public class Home {
    private String greeting = "Hi";
    protected class Room {
        public int repeat = 3;
     public void enter() {
         for (int i = 0; i < repeat; i++) greet(greeting);
     }
        private static void greet(String message) {
                   System.out.println(message);
     }
  }
//    public void enterRoom() {
//        var room = new Room();
//        room.enter();
//    }

    public static void myMethod(){
//        new Home().new Room().enter();
        Home h = new Home();
        h.new Room().enter();
    }
    public static void main(String[] args) {
        var home = new Home();
        Room room = home.new Room();
        System.gc();
        room.enter();
        myMethod();

        String s = """
                Tarun
                         Lives is Hsr Layuout
                Bangalore
                """;
        System.out.println(s);
        System.out.println(s.length());
        //System.gc();
        System.out.println();
    }
}

