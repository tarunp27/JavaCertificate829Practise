package VarArgs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class varArgsex1
{
    public void walk4(int start, int... nums) {
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
        System.out.println(start);
        if (nums==null){
            System.out.println("argument null");
        } else {
            System.out.println("nums not null");
        }
        if (nums.length == 0) {
            System.out.println("No nums");
        } else {
            System.out.println("No of values in nums "+nums.length);
        }
    }
    public static void main(String[] args) throws IOException  {
        varArgsex1 vararg1 = new varArgsex1();
        if (args != null)  {
//            System.out.println("Not null $$$$");
//            throw new FileNotFoundException("$$$ Exception occured $$$");
            try {
                System.out.println("Not null $$$$");
                throw new IOException("$$$ IOException occured $$$");
            }
            catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        vararg1.walk4 (0);
        vararg1.walk4 (0,1);
        vararg1.walk4 (0,1,2,3,4);
        vararg1.walk4 (0,1,2);
        vararg1.walk4 (1,new int [3]);

    }
}