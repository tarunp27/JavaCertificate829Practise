public class Switch_Final {
    final int age = 10;
    void feedAnimals(int noofanimals) {
        final int apples = 2;
        int weight = 22;
        int local;

        int result = age + weight;

        int numberOfAnimals = 3;
        switch (noofanimals){
            case age :
                System.out.println("Apples");
                local = 10;
                break;
            default:
                local=9;
                System.out.println(local);
                System.out.println("default");
                break;
        }
//        age = 12;
//        weight = 22;
        //apples=67+numberOfAnimals;
    }
    public static void main(String[] args) {
        Switch_Final sw = new Switch_Final();
        sw.feedAnimals(34);
    }
}
