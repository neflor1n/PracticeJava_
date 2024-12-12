package practice;
import java.util.*;
import java.util.Scanner;

public class GeneratorOfNumbers {

    public static void main(String[] args) {
        int countnumber;
        int MinNumber;
        int MaxNumber;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number how many times you would like to generate: ");

        countnumber = sc.nextInt();
        System.out.printf("Enter the minimum value: ");
        MinNumber = sc.nextInt();
        System.out.printf("Enter the maximum value: ");
        MaxNumber = sc.nextInt();

        if (MinNumber >= MaxNumber) {
            System.out.println("The number should be greater than the minimum number");
            return;
        }

        // Generation of numbers

        List<Integer> randomNumbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < countnumber; i++) {
            int randomNumber = rand.nextInt(MaxNumber - MinNumber + 1) + MinNumber;
            randomNumbers.add(randomNumber);
        }

        // 3.
        Collections.sort(randomNumbers);

        System.out.println("The random numbers are: " + randomNumbers);

    }

}
