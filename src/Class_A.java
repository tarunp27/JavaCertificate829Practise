public class Class_A {
    interface innerInterface {
        static void m5() {

        }
    }

    class InnerClassD extends Class_A implements innerInterface {
    }

    public static class innerClassA extends ClassX {
    }

    //    class InnerClassB extends innerClassA{
//    }
    static class StaticInnerClassA {
        class InnerInnerInstanceClass {
        }

    }
}
class ClassX{
    int age= 90;
    static String name = "Pugal";

    interface interfaceY{
         class InsideInterface {

         }
    }

    void m1(){
        int Mage = 10;
        class LocalClassX{
            static int nums=29;
            void m2(){
                System.out.println(age);
                System.out.println(name);
                System.out.println(Mage);
            }
        }
        LocalClassX lc = new LocalClassX();

        interfaceY iy = new interfaceY()
        {
            void m3(){
                System.out.println(Mage);
            }
        };
        ClassX cl = new ClassX(){
            static int num = 18;
            static void m4(){

            }
        };
    }
}
