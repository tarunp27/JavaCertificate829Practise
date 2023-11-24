package apis;

import com.mysql.cj.x.protobuf.MysqlxExpr;

public class CompareVal {
    public void compareVal(Object num) {
        if (num instanceof Number data) {
            System.out.println(data.toString());
        }
        else {
            System.out.println("Not Integer instance");
        }
    }

    public static void main(String[] args) {
        CompareVal c = new CompareVal();
        double s = 15.5;
        c.compareVal(s);
    }
}
