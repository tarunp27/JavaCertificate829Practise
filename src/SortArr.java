import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {

        int [] numbers = {5,4,8,7,1};
        System.out.println(Arrays.binarySearch(numbers,8));
        System.out.println(Arrays.binarySearch(numbers,5));
        System.out.println(Arrays.binarySearch(numbers,3));
        System.out.println(Arrays.binarySearch(numbers,6));
        System.out.println(Arrays.binarySearch(numbers,9));
        Arrays.sort(numbers);
        //System.out.println(numbers);
            //1,4,5,7,8
//        System.out.println(Arrays.binarySearch(numbers,8));
//        System.out.println(Arrays.binarySearch(numbers,5));
//        System.out.println(Arrays.binarySearch(numbers,3));
//        System.out.println(Arrays.binarySearch(numbers,6));
//        System.out.println(Arrays.binarySearch(numbers,9));
    }
}
