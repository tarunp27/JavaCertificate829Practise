package MultiThread;

//Deadlock example

import java.lang.reflect.WildcardType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Food{}
class Water{}
public class Fox {
    public void eatAndDrink(Food food, Water water){
        synchronized (food){
            System.out.println("Got food");
            move();
            synchronized (water){
                System.out.println("Got water");
            }
        }
    }
    public void drinkandEat(Food food, Water water){
        synchronized (water){
            System.out.println("Got water");
            move();
            synchronized (food){
                System.out.println("Got food");
            }
        }
    }
    public void move(){
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public Fox() {
    }

    public static void main(String[] args) {
        Fox foxy = new Fox();
        Fox tails = new Fox();
        Food food = new Food();
        Water water = new Water();

        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
//            service = Executors.newSingleThreadExecutor();           //if u use this still the thread will run sequentially
            service.submit(() -> foxy.eatAndDrink(food,water));
            service.submit(() -> tails.drinkandEat(food,water));
        }
        finally {
            if(service!=null) service.shutdown();
        }
    }
}
