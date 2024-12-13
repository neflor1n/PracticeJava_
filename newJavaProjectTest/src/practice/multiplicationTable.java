package practice;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введи число: ");
        int n = sc.nextInt();

        System.out.println("Таблица умножения на " + n + ":");
        for (int i = 0; i != 11; i ++) {
            System.out.println(n + "*" + i + " = " + (n*i));

        }
    }
}
