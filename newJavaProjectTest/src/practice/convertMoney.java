package practice;

import java.util.Scanner;

public class convertMoney {

    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Евро\n" +
                    "2. Доллары\n" +
                    "3. Рубли\n" +
                    "Выберите валюту для конвертирования: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.printf("bye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.printf("Введите сколько евро вы хотите конвертировать (число): ");
                    double amount = sc.nextDouble();

                    System.out.print("1. Доллары\n" +
                            "2. Рубли\n" +
                            "Выберете валюту для конвертации евро: ");
                    int choiceInt = sc.nextInt();

                    switch (choiceInt) {
                        case 1:
                            x = amount * 1.04575;
                            System.out.println(amount + " Евро: " + x + " долларов");
                            break;
                        case 2:
                            x = amount * 109.0126;
                            System.out.println(amount + " Евро: " + x + " рублей");
                            break;
                        default:
                            System.out.println("Неправильная цифра!");
                            return;
                    }

                case 2:
                    System.out.print("Введите, сколько долларов вы хотите конвертировать (число): ");
                    double amount2 = sc.nextDouble();

                    System.out.print("1. Евро\n" +
                            "2. Рубли\n" +
                            "Выберите валюту для конвертирования: ");
                    int choiceInt2 = sc.nextInt();
                    switch (choiceInt2) {
                        case 1:
                            x = amount2 * 0.9488;
                            System.out.printf(amount2 + " долларов: " + x + " евро");
                            break;
                        case 2:
                            x = amount2 * 103.4305;
                            System.out.printf(amount2 + " долларов: " + x + " рублей");
                            break;
                        default:
                            System.out.println("Неправильная цифра!");
                            return;
                    }
                case 3:
                    System.out.print("Введите, сколько рублей вы хотите конвертировать (число): ");
                    double amount3 = sc.nextDouble();

                    System.out.print("1. Евро\n" +
                            "2. Доллары\n" +
                            "Выберите валюту для конвертирования: ");
                    int choiceInt3 = sc.nextInt();
                    switch (choiceInt3) {
                        case 1:
                            x = amount3 * 0.0092;
                            System.out.println(amount3 + " рублей: " + x + " евро");
                            break;
                        case 2:
                            x = amount3 * 0.0097;
                            System.out.println(amount3 + " рублей: " + x + " долларов");
                            break;
                        default:
                            System.out.println("Неправильная цифра!");
                            return;
                    }
                default:
                    System.out.println("Неправильная цифра!");
                    return;


            }


        }
    }
}
