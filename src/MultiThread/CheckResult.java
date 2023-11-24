package MultiThread;

public class CheckResult {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(
                ()->{
                    for(int i=0;i<200;i++) {
                        CheckResult.counter++;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Loop completed "+CheckResult.counter);
                }
        ).start();
        System.out.println("Checking "+CheckResult.counter);
        while (CheckResult.counter<100) {
            System.out.println("Not reached yest "+CheckResult.counter);
            Thread.sleep(500);
        }
        System.out.println("Reached "+CheckResult.counter);
    }
}
