package FnctionalInterface;

interface drawable {
    public void draw();
}

public class LamdaEx {
    public static void main(String[] args) {

        int width = 10;

        drawable d1 = new drawable() {
            @Override
            public void draw() {
                System.out.println("drawing :" + width);
            }
        };
        d1.draw();

        //using lamda

        drawable d2 = () -> {
            System.out.println("Drawing using lamda: " + width);
        };
        d2.draw();
    }
}
