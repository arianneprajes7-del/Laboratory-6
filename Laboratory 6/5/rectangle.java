class Rectangle {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
}

public class rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        System.out.println("Area = " + r1.area());
    }
}