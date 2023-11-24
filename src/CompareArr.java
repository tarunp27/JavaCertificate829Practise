public class CompareArr {
    public static void main(String[] args) {
        //Arrays.compare(new int[]{9,2},new int[] {1,3})

        int [][] diffarray = {{1,4},{3},{9,8,7}};
        int [][] twod = new int[3][2];
        for(int[]inner:diffarray){
            for(int num:inner)
                System.out.println(num+"");
        }
        System.out.println();
    }
}
