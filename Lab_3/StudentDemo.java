import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("Enter details of student " + (i + 1));
            System.out.print("Roll: ");
            s[i].roll = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextDouble();
        }

        double min = s[0].cgpa;
        String lowName = s[0].name;

        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < min) {
                min = s[i].cgpa;
                lowName = s[i].name;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + lowName);
        sc.close();
    }
}