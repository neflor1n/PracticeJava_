package practice;
import java.util.*;
public class GuessWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Список слов
        String[] words = {"apple", "banana", "orange", "grape", "peach"};
        Random random = new Random();
        String chosenWord = words[random.nextInt(words.length)];

        // Переменные игры
        char[] guessedWord = new char[chosenWord.length()];
        Arrays.fill(guessedWord, '_'); // Заполняем массив символами '_'
        int attemptsLeft = 6; // Количество попыток
        Set<Character> wrongGuesses = new HashSet<>();

        System.out.println("Добро пожаловать в игру \"Угадай слово\"!");
        System.out.println("Слово загадано, начинаем игру!");

        // Основной игровой цикл
        while (attemptsLeft > 0) {
            System.out.println("\nТекущее состояние слова: " + String.valueOf(guessedWord));
            System.out.println("Ошибочные буквы: " + wrongGuesses);
            System.out.println("Осталось попыток: " + attemptsLeft);
            System.out.print("Введите букву: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (wrongGuesses.contains(guess) || new String(guessedWord).contains(String.valueOf(guess))) {
                System.out.println("Вы уже вводили эту букву. Попробуйте снова.");
                continue;
            }

            if (chosenWord.contains(String.valueOf(guess))) {
                System.out.println("Правильно!");
                // Открываем буквы в загаданном слове
                for (int i = 0; i < chosenWord.length(); i++) {
                    if (chosenWord.charAt(i) == guess) {
                        guessedWord[i] = guess;
                    }
                }
            } else {
                System.out.println("Ошиблись!");
                wrongGuesses.add(guess);
                attemptsLeft--;
            }

            // Проверяем, угадано ли слово
            if (new String(guessedWord).equals(chosenWord)) {
                System.out.println("Поздравляем, вы угадали слово: \"" + chosenWord + "\"!");
                return;
            }
        }

        System.out.println("Вы проиграли! Загаданное слово было: \"" + chosenWord + "\".");
    }
}
