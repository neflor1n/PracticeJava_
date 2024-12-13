package practice;
import java.util.*;
public class PasswordGenerator {

    static char[] Smallletter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] Bigletter = convertToUpperCase(Smallletter);
    static char[] symbol = {'!', '@', '#', '$', '%', '^', '&','*','.', '_', '+', '-', '/', '<', '>', ',', '~'};
    static char[] number = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};





    static char[] convertToUpperCase(char[] array) {
        char[] upperCaseArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            upperCaseArray[i] = Character.toUpperCase(array[i]);
        }
        return upperCaseArray;
    }



    static void generatePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи количество символов в пароле: ");
        int passwordLength = sc.nextInt();



        List<Character> allCharacters = new ArrayList<>();
        for (char c : Smallletter) allCharacters.add(c);
        for (char c : Bigletter) allCharacters.add(c);
        for (char c : symbol) allCharacters.add(c);
        for (char c : number) allCharacters.add(c);


        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < passwordLength; i++) {
            char randomChar = allCharacters.get(rand.nextInt(allCharacters.size()));
            password.append(randomChar);
        }

        System.out.println("Сгенерированный пароль: " + password);


    }

    public static void main(String[] args) {

        // -------------------- Проверка списков --------------------

//        System.out.println(Smallletter);
//        System.out.println(Bigletter);
//        System.out.println(symbol);
//        System.out.println(number);


        generatePassword();
    }
}
