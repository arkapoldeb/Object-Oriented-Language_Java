import java.util.Scanner;

class Sheet {
    double length, breadth;

    void input2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        sc.close();
    }

    double area() {
        return length * breadth;
    }
}

class Box extends Sheet {
    double height;

    void input3D() {
        input2D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        sc.close();
    }

    double volume() {
        return length * breadth * height;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 2D Sheet\n2. 3D Box");
        int ch = sc.nextInt();

        if (ch == 1) {
            Sheet s = new Sheet();
            s.input2D();
            System.out.println("Cost = " + (s.area() * 40));
        } else {
            Box b = new Box();
            b.input3D();
            System.out.println("Cost = " + (b.volume() * 60));
        }
        sc.close();
    }
}