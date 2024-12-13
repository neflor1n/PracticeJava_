package practice;
import java.util.*;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String s = sc.nextLine().toLowerCase();
        String reserved = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reserved += s.charAt(i);
        }

        if (s.equals(reserved)) {
            System.out.println();
            System.out.println("It's a palindrome");
            System.out.println(s + " = " + reserved);
        }
        else {
            System.out.println();
            System.out.println("It's not a palindrome");
            System.out.println(s + " != " + reserved);
        }


    }
}
