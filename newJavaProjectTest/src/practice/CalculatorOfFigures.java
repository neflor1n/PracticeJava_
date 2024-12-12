package practice;

import java.sql.Time;
import java.util.Scanner;
import java.util.*;

public class CalculatorOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\nChoose the figure: ");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 4 ) {
                System.out.print("Exiting in 3 seconds");
                Timer timer = new Timer();

                // Создаём анимацию точек в отдельном потоке
                new Thread(() -> {
                    try {
                        for (int i = 0; i < 3; i++) {
                            Thread.sleep(1000); // Задержка в 1 секунду
                            System.out.print("."); // Добавляем точку
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();

                // Завершаем программу через 5 секунд
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("\nProgram terminated.");
                        System.exit(0);
                    }
                }, 3000);

                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the length of the side of the square: ");
                    double side = sc.nextDouble();
                    System.out.println("The area of the square is: " + calculateSquareArea(side));
                    System.out.println("The perimeter of the square is " + calculateSquarePerimeter(side));
                }
                case 2 -> {
                    System.out.print("Enter the length of the side of the rectangle: ");
                    double lenght = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    System.out.println("The area of the rectangle is " + calculateRectangleArea(lenght, width));
                    System.out.println("The perimeter of the rectangle is " + calculateRectanglePerimeter(lenght, width));
                }
                case 3 -> {
                    System.out.print("Enter the radious of the side of the circle: ");
                    double radious = sc.nextDouble();
                    System.out.println("The area of the circle is " + calculateCircleArea(radious));
                    System.out.println("The circumference of the circle is " + calculateCircleCircumference(radious));
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    public static double calculateRectangleArea(double width, double length) {
        return length * width;
    }

    public static double calculateRectanglePerimeter(double width, double length) {
        return 2 * (width + length);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

}
