import java.util.Scanner;
class Subtract {

    int sub(int a, int b) {
        return a - b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    int sub(int a, int b, int c) {
        return a - b - c;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subtract s = new Subtract();

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result = " + s.sub(a, b));

        System.out.print("Enter two decimals: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Result = " + s.sub(x, y));

        System.out.print("Enter three integers: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Result = " + s.sub(p, q, r));
        sc.close();
    }
}