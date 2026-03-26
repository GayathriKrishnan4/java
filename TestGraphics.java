import Graphics.*;

public class TestGraphics {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(6, 4);
        Square sq = new Square(4);
        Circle cir = new Circle(3);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
        System.out.println("Area of Square: " + sq.area());
        System.out.println("Area of Circle: " + cir.area());
    }
}
/*PS C:\Users\MCA\Desktop\gk java> javac TestGraphics.java
PS C:\Users\MCA\Desktop\gk java> java TestGraphics      
Area of Rectangle: 50.0
Area of Triangle: 12.0
Area of Square: 16.0
Area of Circle: 28.274333882308138 */