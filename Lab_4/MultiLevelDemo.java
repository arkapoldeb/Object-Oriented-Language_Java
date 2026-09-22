import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
    }
}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Thickness = " + thick);
    }
}

public class MultiLevelDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, width, height, thickness: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);
        wb.display();
        sc.close();
    }
}