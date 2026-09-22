import java.util.Scanner;
class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println("Area = " + (length * breadth));
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }
}

public class RectConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);
        r.display();
        sc.close();
    }
}