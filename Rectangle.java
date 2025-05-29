class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void displayDetails() {
        System.out.println("Rectangle Area: " + calculateArea());
        System.out.println("Rectangle Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.displayDetails();
    }
}
