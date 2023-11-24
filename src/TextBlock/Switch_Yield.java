package TextBlock;

import java.util.List;

public class Switch_Yield {
    private void confusing(){
        this.yield();
    }

    private void yield(){
        String store = "Legoland";

        String output  = switch (store) {
            case "Legoland"->{
                yield "carlsbad";
            }
            default -> "other";
        };
        System.out.println(output);
    }

    public static void main(String[] args) {
        Switch_Yield sy = new Switch_Yield();
        sy.confusing();
    }
}
