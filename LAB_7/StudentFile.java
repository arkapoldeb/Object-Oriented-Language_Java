import java.io.*;
import java.util.Scanner;
public class StudentFile 
{
    public static void main(String[] args) throws IOException 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rollno:");
        String roll = sc.nextLine();
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Subject:");
        String subject = sc.nextLine();
        System.out.println("Enter Marks:");
        String marks = sc.nextLine();
        System.out.println("Enter existing file name:");
        String filename = sc.nextLine();

        FileWriter fw = new FileWriter(filename, true);
        fw.write("Rollno: " + roll + "\n");
        fw.write("Name: " + name + "\n");
        fw.write("Subject: " + subject + "\n");
        fw.write("Marks: " + marks + "\n");
        fw.write("---------------------\n");
        fw.close();
        
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line;
        System.out.println("\nDisplaying File Content:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        sc.close();
    }
}
