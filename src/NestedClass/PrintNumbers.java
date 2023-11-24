package NestedClass;

public class PrintNumbers {
    private static int length = 5;

    public void calculate() {
        int width = 20;

        class Calculator {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        //length=100;            //this can be chaned becaue this is not local variable
        //width=10;              //this is CError becaue this is effectivelty final variable it cannot be changed
        var calculator = new Calculator();
        calculator.multiply();
    }
    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate();
    }
}
