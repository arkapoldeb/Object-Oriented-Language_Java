import java.util.*;
public class StringOperations
{
    static void changeCase(String str)
    {
        String result = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else if(Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += ch;
        }

        System.out.println("The string after changing the case is " + result);
    }

    static void reverseString(String str)
    {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
            rev += str.charAt(i);

        System.out.println("The string after reversing is " + rev);
    }

    static void compareStrings(String str1, Scanner sc)
    {
        System.out.print("\n Enter the second string for comparison: ");
        String str2 = sc.next();

        int min = Math.min(str1.length(), str2.length());
        int diff = 0;

        for(int i=0;i<min;i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
            {
                diff = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if(diff == 0)
            diff = str1.length() - str2.length();

        System.out.println("The difference between ASCII value is " + diff);
    }

    static void insertString(String str1, Scanner sc)
    {
        System.out.print("\nEnter the string to be inserted into first string: ");
        String str2 = sc.next();

        String result = str1 + " " + str2;
        System.out.println("The string after insertion is: " + result);
    }

    static void upperLower(String str)
    {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    static void searchChar(String str, Scanner sc)
    {
        System.out.print("\nEnter character to search: ");
        char ch = sc.next().charAt(0);

        boolean found = false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                System.out.println("Character found at position " + (i+1));
                found = true;
            }
        }
        if(!found)
            System.out.println("Character not found");
    }

    static void palindrome(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
            rev+=str.charAt(i);

        if(str.equals(rev))
            System.out.println("The string is Palindrome");
        else
            System.out.println("The string is NOT Palindrome");
    }
    
    static void countStuff(String str)
    {
        int vowels=0, consonants=0, words=1;

        for(int i=0;i<str.length();i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowels++;
            else if(Character.isLetter(ch))
                consonants++;
            else if(ch==' ')
                words++;
        }

        System.out.println("Number of words: " + words);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        changeCase(str);
        reverseString(str);
        compareStrings(str, sc);
        insertString(str, sc);
        upperLower(str);
        searchChar(str, sc);
        palindrome(str);
        countStuff(str);
    }
}