package practice;
import java.util.*;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {

        String[] games = {"Камень", "Ножницы", "Бумага"};

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        while (true) {
            System.out.print("Камень, ножницы, бумага (или введите 'выход')?: ");
            String userChoice = sc.nextLine().toLowerCase();

            if (userChoice.equals("выход")) {
                System.out.println("Игра завершена! Спасибо за участие!");
                break;

            }

            // -------------- Проверка на корректность ввода --------------
            if (!userChoice.equals("камень") && !userChoice.equals("ножницы") && !userChoice.equals("бумага")) {
                System.out.println("Некорректный ввод. Пожалуйста, введите 'Камень', 'Ножницы' или 'Бумага'.\"");
                continue;

            }


            int computerIndex = rand.nextInt(3); // генерация случайного элемента из списка games
            String computerChoice = games[computerIndex];


            System.out.println("Компьютер выбрал: " + computerChoice);

            if (userChoice.equals("камень") && computerChoice.equals("Ножницы") ||
                    userChoice.equals("ножницы") && computerChoice.equals("Бумага") ||
                    userChoice.equals("бумага") && computerChoice.equals("Камень")) {
                System.out.println("Вы выиграли!");

            } else if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("Ничья!");
            } else {
                System.out.println("Вы проиграли!");

            }

            System.out.println();



        }


    }
}
