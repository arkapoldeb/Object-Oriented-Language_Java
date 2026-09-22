import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.close();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar;

    void inputPerson() {
        Scanner sc = new Scanner(System.in);
        input();

        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar No: ");
        aadhar = sc.nextLine();
        sc.close();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar);
        System.out.println();
    }
    
}

public class PersonDemo {
    public static void main(String[] args) {
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));
            p[i] = new Person();
            p[i].inputPerson();
        }

        System.out.println("\n--- Details ---");
        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}