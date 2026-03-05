import java.util.*;

public class exp12 {

    // Overloaded method for circle area (radius)
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method for rectangle area (length, width)
    double area(double length, double width) {
        return length * width;
    }

    // Overloaded method for triangle area (base, height)
    double area(double base, double height, int flag) {
        return 0.5 * base * height;
    }

    // Overloaded method for square area (side)
    int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exp12 shape = new exp12();

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Square");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                System.out.println("Area of Circle: " + shape.area(sc.nextDouble()));
                break;
            case 2:
                System.out.print("Enter length and width: ");
                System.out.println("Area of Rectangle: " + shape.area(sc.nextDouble(), sc.nextDouble()));
                break;
            case 3:
                System.out.print("Enter base and height: ");
                System.out.println("Area of Triangle: " + shape.area(sc.nextDouble(), sc.nextDouble(), 1));
                break;
            case 4:
                System.out.print("Enter side: ");
                System.out.println("Area of Square: " + shape.area(sc.nextInt()));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
