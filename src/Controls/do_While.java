package Controls;

public class do_While {
    public static void main(String[] args) {
        int num=0;
        do{

            if(num%2==0){
                System.out.println(num);
            }
            num++;
        }while(num<=10);
        System.out.println();
        int x= 0;
        int z=0;
        for(int y=0;x<=5;x++,y++,z++){
            System.out.println(y);
        }
        System.out.println(x);
        System.out.println();
        System.out.println(z);

        String[] names = new String[3];
        names[0]="tarun";
        names[1]="tarun2";
        names[2]="tarun3";
        for(String nm: names){
            System.out.println(nm);
        }
        int [] i1 = new int[10];
        int cnt =0;
        for(int nums : i1){
            i1[cnt]=cnt+1;
            cnt++;
        }
        for(int num1 : i1){
            System.out.println(num1);
        }
    }
}

