import java.io.*;
import java.util.Scanner;
public class Count {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name:");
        String filename = sc.nextLine();

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        int characters = 0;
        int words = 0;
        int lines = 0;

        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            characters += line.length();
            words += line.split("\\s+").length;
        }

        System.out.println("No. of characters - " + characters);
        System.out.println("No. of lines - " + lines);
        System.out.println("No. of words - " + words);

        br.close();
        sc.close();
    }
}
