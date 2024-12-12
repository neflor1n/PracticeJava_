package practice;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void myMethod() {
        System.out.println("Hello World");
        //String name = JOptionPane.showInputDialog("What is your name?: ");
        //String lastname = JOptionPane.showInputDialog("What is your last name?: ");

        Scanner myObjName = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = myObjName.nextLine();

        Scanner myObjLastName = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastname = myObjLastName.nextLine();

        System.out.println("Hello, " + name + " " + lastname);
    }

    static void calculation() {
        Scanner myObjFn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = myObjFn.nextInt();

        Scanner myObjSn = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int secondNumber = myObjSn.nextInt();

        Scanner scanSign = new Scanner(System.in);
        System.out.println("Enter sign: ");
        String sign = scanSign.nextLine();

        switch (sign) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Invalid sign");
                break;

        }


    }

    static int option;
    /*
    static void performActionBasedOnOption() {
        switch (option) {
            case 1:
                System.out.println("You chose Multiply");
                numbers();
                break;
            case 2:
                System.out.println("You chose Divide");
                break;
            case 3:
                System.out.println("You chose Addition");
                break;
            case 4:
                System.out.println("You chose Subtraction");
                break;
            case 5:
                System.out.println("You chose Square");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
    */
    static int firstNumber;
    static int secondNumber;

    static void num() {
        Scanner myObjFn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = myObjFn.nextInt();

        Scanner myObjSn = new Scanner(System.in);
        System.out.println("Enter second number: ");
        secondNumber = myObjSn.nextInt();
    }

    static void numbers() {
        switch (option) {
            case 1:
                num();
                System.out.println("Result: " + (firstNumber * secondNumber) + "\n");
                break;
            case 2:
                num();
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber) + "\n");
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case 3:
                num();
                System.out.println("Result: " + (firstNumber + secondNumber) + "\n");
                break;
            case 4:
                num();
                System.out.println("Result: " + (firstNumber - secondNumber) + "\n");
                break;
            case 5:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number: ");
                int number = scanner.nextInt();
                System.out.println("The square root is: " + Math.sqrt(number) + "\n");
                break;
            default:
                System.out.println("Invalid option. Please try again." + "\n");
        }
    }

    static void calculation2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        while (true) { // Бесконечный цикл
            System.out.println("Select an option (0-5): \n" +
                    "0. Exit\n" +
                    "1. Multiply\n" +
                    "2. Divide\n" +
                    "3. Addition\n" +
                    "4. Subtraction\n" +
                    "5. Square Root");

            option = scanner.nextInt();

            if (option == 0) { // Выход из цикла
                System.out.println("Goodbye!");
                break;
            }

            numbers();
        }
    }

    public static void main(String[] args) {

        //myMethod();
        //calculation();
        calculation2();
    }
}