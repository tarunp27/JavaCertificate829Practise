package Enums.pack1;

public enum Fish {
    STAR,TUNA(55),VANJIRA(20,75),ROHU(35){
        @Override
        void printNames(String s) {
            System.out.println("Country Fish "+s);
        }
    };
    int age = 55;
    int weight = 33;
    Fish(int i){
        this.age = i;
    }
    Fish(int i, int j){
        this.age = i;
        this.weight = j;
    }
    Fish(){
        this.age=75;
    }

    void printNames(String s){
        System.out.println("Name "+s);
    }

    public static void main(String[] args) {
        Fish[] f = Fish.values();
        for (Fish f1: f) {
            f1.printNames(""+f1.name());
            System.out.println(f1.ordinal());
            System.out.println(f1.weight);
            System.out.println(f1.age);
            System.out.println("---------------------");
        }
    }
}
