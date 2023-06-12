interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Square implements Shape {
    private double side;

    public Square(double s) {
        side = s;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

public class ques15 {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(4, 5);
        Square s = new Square(2);

        System.out.println("Aayush Upadhyay");
        System.out.println("09929802021");
        System.out.println("Circle area: " + c.area());
        System.out.println("Circle perimeter: " + c.perimeter());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Rectangle perimeter: " + r.perimeter());
        System.out.println("Square area: " + s.area());
        System.out.println("Square perimeter: " + s.perimeter());
    }
}
