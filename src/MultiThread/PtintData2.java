package MultiThread;

public class PtintData2 extends Thread{
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println("Printing inventory" + i);
        }
    }

    public static void main(String[] args) {
//        new PtintData2().start();
        PtintData2 pd1 = new PtintData2();
        PtintData2 pd2 = new PtintData2();

        System.out.println("Starting first thread");
        pd1.start();
//        System.out.println("starting 2nd thread");
//        pd2.start();
        System.out.println("process completed");


    }
}
