package assigment;



class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class Rectangle_square{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        Square square = new Square(5);
        System.out.println("\nSquare:");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}
