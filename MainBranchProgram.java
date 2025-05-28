class CircleArea {
    double radius;

    CircleArea(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + getArea());
        System.out.println("Circle Perimeter: " + getPerimeter());
    }
}

// RectanglePerimeter.java
class RectanglePerimeter {
    double length;
    double breadth;

    RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Breadth: " + breadth);
        System.out.println("Rectangle Area: " + getArea());
        System.out.println("Rectangle Perimeter: " + getPerimeter());
    }
}

// MainBranchProgram.java
 class MainBranchProgram {
    public static void main(String[] args) {
        System.out.println("=== Circle Details ===");
        CircleArea circle = new CircleArea(7.0);
        circle.display();

        System.out.println("\n=== Rectangle Details ===");
        RectanglePerimeter rectangle = new RectanglePerimeter(10.0, 5.0);
        rectangle.display();
    }
}