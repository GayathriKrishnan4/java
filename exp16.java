import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0.0;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", area()));
        System.out.println("Perimeter: " + String.format("%.2f", perimeter()));
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + String.format("%.2f", area()));
        System.out.println("Perimeter: " + String.format("%.2f", perimeter()));
    }
}

public class exp16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========== SHAPE CALCULATOR ==========");
            System.out.println("1. Calculate Circle Area and Perimeter");
            System.out.println("2. Calculate Rectangle Area and Perimeter");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    choice = sc.nextInt();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a number between 1-3.");
                    sc.nextLine();
                    System.out.print("Enter your choice (1-3): ");
                }
            }

            switch (choice) {
                case 1:
                    double radius = 0.0;
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.print("Enter radius of circle: ");
                            radius = sc.nextDouble();
                            sc.nextLine();
                            if (radius <= 0) {
                                System.out.println("Radius must be positive!");
                                continue;
                            }
                            validInput = true;
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid number.");
                            sc.nextLine();
                        }
                    }

                    Circle circle = new Circle(radius);
                    System.out.println("\n" + "=".repeat(30));
                    circle.display();
                    System.out.println("=".repeat(30));
                    break;

                case 2:
                    double length = 0.0;
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.print("Enter length of rectangle: ");
                            length = sc.nextDouble();
                            sc.nextLine();
                            if (length <= 0) {
                                System.out.println("Length must be positive!");
                                continue;
                            }
                            validInput = true;
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid number.");
                            sc.nextLine();
                        }
                    }

                    double width = 0.0;
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.print("Enter width of rectangle: ");
                            width = sc.nextDouble();
                            sc.nextLine();
                            if (width <= 0) {
                                System.out.println("Width must be positive!");
                                continue;
                            }
                            validInput = true;
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid number.");
                            sc.nextLine();
                        }
                    }

                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("\n" + "=".repeat(30));
                    rectangle.display();
                    System.out.println("=".repeat(30));
                    break;

                case 3:
                    System.out.println("Thank you for using Shape Calculator!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }
        }
    }
}
/*========= SHAPE CALCULATOR ==========
1. Calculate Circle Area and Perimeter
2. Calculate Rectangle Area and Perimeter
3. Exit
Enter your choice (1-3): 1
Enter radius of circle: 4

==============================
Circle:
Radius: 4.0
Area: 50.27
Perimeter: 25.13
==============================

========== SHAPE CALCULATOR ==========
1. Calculate Circle Area and Perimeter
2. Calculate Rectangle Area and Perimeter
3. Exit
Enter your choice (1-3): 2
Enter length of rectangle: 10
Enter width of rectangle: 20

==============================
Rectangle:
Length: 10.0
Width: 20.0
Area: 200.00
Perimeter: 60.00
==============================

========== SHAPE CALCULATOR ==========
1. Calculate Circle Area and Perimeter
2. Calculate Rectangle Area and Perimeter
3. Exit
Enter your choice (1-3): 3
Thank you for using Shape Calculator! */