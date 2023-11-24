package Classes;
public class GirraffeFamily {   static { System.out.print("A"); }
     { System.out.print("B"); }

            public GirraffeFamily(String name) {
                this(1);System.out.print("C");
 }

            public GirraffeFamily() {
               System.out.print("D");
         }

            public GirraffeFamily(int stripes) {
             System.out.print("E");
           } }
 class Okapi extends GirraffeFamily {
   static { System.out.print("F"); }

           public Okapi(int stripes) {
               super("sugar");
              System.out.print("G");
            }
    { System.out.print("H"); }

            public static void main(String[] grass) {
               new Okapi(1);
               System.out.println();
               new Okapi(2);
   } }