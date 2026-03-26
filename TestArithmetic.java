import Arithmetic.*;

public class TestArithmetic {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 4;

        Operation add = new Add();
        Operation subtract = new Subtract();
        Operation multiply = new Multiply();
        Operation divide = new Divide();

        System.out.println("Given Numbers: " + num1 + " and " + num2);
        System.out.println();
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtract.calculate(num1, num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiply.calculate(num1, num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + divide.calculate(num1, num2));
    }
}
