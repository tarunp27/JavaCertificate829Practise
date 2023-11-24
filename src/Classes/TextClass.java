package Classes;

class Classx {
    int val = 10;
}

class Classy extends Classx {
    Classy val = null;
}

public class TextClass {
    public static void main(String[] args) {
        Classy y = new Classy();
        int k = ((Classx) y).val;
        System.out.println(k);

        Number num = 5;
        if (!(num instanceof Integer data))
            return;
        System.out.println((Integer) data);
    }
}
