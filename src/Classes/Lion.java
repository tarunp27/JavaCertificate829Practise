package Classes;

public class Lion extends Animal{

    //constructor rules

    public void Lion(){
        System.out.println("not a constructor"); // has  a return type
    }
    public Lion (){
        //super(); internally done automatically
        System.out.println("Constructor"); // default constructor
    }

//    public lion (){
//                        not a constructor because the class name doesnot match
//    }

    public Lion (int i){
        System.out.println("valid Parametrized constructor");
    }



    public void setProperties(int age, String s){
        setAge(age);
        name = s;
    }
    public void Roar(){
        System.out.println(name + ",age "+getAge()+" Roaring ");
    }

    public static void main(String[] args) {
        var lion =new Lion();
        lion.setProperties(3,"kion");
        lion.Roar();
    }
}
