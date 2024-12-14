package practice.regist_autoris;

import java.util.*;
import java.io.*;

public class reg_and_aut{
    static char[] Smallletter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] Bigletter = convertToUpperCase(Smallletter);
    static char[] symbol = {'!', '@', '#', '$', '%', '^', '&','*','.', '_', '+', '-', '/', '<', '>', ',', '~'};
    static char[] number = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    static List<String> usernames = new ArrayList<>();
    static List<String> passwords = new ArrayList<>();

    static char[] convertToUpperCase(char[] array) {
        char[] upperCaseArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            upperCaseArray[i] = Character.toUpperCase(array[i]);
        }
        return upperCaseArray;
    }



    static void passwordGenerator() {
        Scanner genPasInt = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int passwordLength = genPasInt.nextInt();


        List<Character> allCharacters = new ArrayList<>();
        for (char c : Smallletter) allCharacters.add(c);
        for (char c : Bigletter) allCharacters.add(c);
        for (char c : symbol) allCharacters.add(c);
        for (char c : number) allCharacters.add(c);

        StringBuilder genPassword = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < passwordLength; i++) {
            char randomChar = allCharacters.get(rand.nextInt(allCharacters.size()));
            genPassword.append(randomChar);
        }

        System.out.println("Your password: " + genPassword.toString());
        passwords.add(genPassword.toString());

    }

    public static void main(String[] args) {

        usernames.add("neflor1nTest");
        passwords.add("515");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Hello! Welcome to the Register System!\n" +
                    "1. Exit\n" +
                    "2. Authorisation\n" +
                    "3. Registration\n" +
                    "4. Show lists\n" +
                    "Please enter your choice: ");
            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Goodbye!\n");
                    return;
                case 2:
                    System.out.print("Enter your username: ");
                    String username = sc.next();
                    System.out.print("Enter your password: ");
                    String password = sc.next();

                    if (usernames.contains(username)) {
                        int index = usernames.indexOf(username);
                        if (passwords.get(index).equals(password)) {
                            System.out.println("Authorisation successful!");
                        } else {
                            System.out.println("Incorrect password!");
                        }
                    } else {
                        System.out.println("Username not found!");
                    }
                    break;

                case 3:

                    System.out.print("Enter your new username: ");
                    String newUsername = sc.next();

                    if (usernames.contains(newUsername)) {
                        System.out.println("Username already exists! Try a different one.");
                    } else {
                        System.out.print("Do you want to generate your password? (Y/N): ");
                        String passwordGen = sc.next();

                        if (passwordGen.equalsIgnoreCase("Y")) {
                            passwordGenerator();
                        } else {
                            System.out.print("Enter your new password: ");
                            String newPassword = sc.next();
                            passwords.add(newPassword);
                        }
                        usernames.add(newUsername);
                        System.out.println("Registration successful!");
                    }
                    break;

                case 4:
                    if (usernames.isEmpty() || passwords.isEmpty()) {
                        System.out.println("No users registered yet.");
                    } else {
                        System.out.println("Registered users and passwords:");
                        for (int i = 0; i < usernames.size(); i++) {
                            System.out.println(usernames.get(i) + ": " + passwords.get(i));
                        }
                    }
                    break;


                default:
                    System.out.println("Invalid choice!");
                    break;

                

            }


        }



    }

}
