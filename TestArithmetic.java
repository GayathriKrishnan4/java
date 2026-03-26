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
/*
PS C:\Users\MCA\Desktop\gk java>  javac TestArithmetic.java
PS C:\Users\MCA\Desktop\gk java>  java TestArithmetic      
Given Numbers: 20.0 and 4.0

Addition: 20.0 + 4.0 = 24.0
Subtraction: 20.0 - 4.0 = 16.0
Multiplication: 20.0 * 4.0 = 80.0
Division: 20.0 / 4.0 = 5.0*/
