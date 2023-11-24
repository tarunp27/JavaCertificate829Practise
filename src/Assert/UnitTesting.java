package Assert;

public class UnitTesting {
    public static void main(String[] args) {

        int age = 2;
        double length = 100.0;
        String name = "Pugal";

//        assert (1==age)  : "$Error$";  // this is false so it will error and throw exception
//        assert (2==length)
        assert 100.0==length : "Problem with length";
        assert ("Pugal".equals(name)) : "Failed to verify data";
    }
}
