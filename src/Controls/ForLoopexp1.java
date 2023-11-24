package Controls;

public class ForLoopexp1 {
    public static void main(String[] args) {
        int[][] list = {{5,1,2,3},{3,9,8,10},{11,13,17,19}};
        PARENT_LOOP : for(int i=0;i<list.length;i++){
            for(int j= 0;j<list[i].length;j++){
//                System.out.println(list[i].length);
//                System.out.println("position " + i+ " " + j);
//                System.out.println(list[i][j]);
                if(list[i][j]==10){
                    System.out.println("position " + i+ " " + j);
                    break PARENT_LOOP;
                }
            }
        }
        //ureachable code
        int checkdate =0;
        while(checkdate<10){
            checkdate++;
            if(checkdate>5){
                break;
          //      checkdate++;
            }
        }
    }
}
