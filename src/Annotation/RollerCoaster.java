package Annotation;

//@ZooAttraction             //taget for this annotation is method snd constructors cannot be used with class
public class RollerCoaster {
}
class Events{
 @ZooAttraction String rideTrain(){
     return "fun";
       // return(@ZooAttraction String) "fun";  // cannot be used in paramter.
    }
 @ZooAttraction Events(String Description){  //allowed againts constructor
        super();
    }
    int numberPassengers;
}
