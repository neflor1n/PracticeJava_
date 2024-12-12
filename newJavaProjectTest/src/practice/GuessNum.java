package practice;

import java.util.Scanner;

public class GuessNum {


    public static void main(String[] args) {
        int num1;
        int guessCount = 0;
        int num = (int) (Math.random() * 100);

        System.out.println("Hello! I'm a random number!");
        while (true) {
            System.out.print("You should to enter a number between 0 and 100: ");
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();

            if (num1 > num) {
                System.out.println(num1 + " is greater");
                guessCount++;
            } else if (num1 < num) {
                System.out.println(num1 + " is less");
                guessCount++;
            } else {
                guessCount++;
                System.out.println("You got it! Congratulations!");
                System.out.println(num1 + " is equal to " + num);
                System.out.println(guessCount + " guesses left");

                break;
            }
        }
    }

}
