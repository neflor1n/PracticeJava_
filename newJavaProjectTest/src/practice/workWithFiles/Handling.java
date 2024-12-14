package practice.workWithFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Handling {

    static File myObj;

    public static void main(String[] args) {
//        File myObj = new File("Handling.txt");
//        if (myObj.exists()) {
//            Scanner myReader = null;
//            System.out.println(myObj.getName() + " is a file");
//        }else {
//            System.out.println("The file " + myObj.getName() + " doesn't exist");
//        }
//
//
//        System.out.println();

        try {
            File directory = new File("src/practice/workWithFiles");
            if (!directory.exists()) {
                if (directory.mkdirs()) { // Создаёт все необходимые директории
                    System.out.println("Directory created: " + directory.getAbsolutePath());
                } else {
                    System.out.println("Failed to create directory.");
                }
            }

            myObj = new File("src/practice/workWithFiles/HandlCreation.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



        // ----------------- Запись значений в файл -------------------------

        try {
            FileWriter fw = new FileWriter("src/practice/workWithFiles/HandlCreation.txt");
            fw.write("Files in Java might be tricky, but it is fun enough!");
            fw.write(System.getProperty("line.separator")); // ставит новое предложение на новую строку
            fw.write("Hello World!");
            fw.close();
            System.out.println("Files written successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {

            Scanner txtReader = new Scanner(myObj);
            while (txtReader.hasNextLine()) {
                String data = txtReader.nextLine();
                System.out.println(data);

            }
            txtReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        System.out.println();
        System.out.println();


        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("File contents: " + myObj.getAbsolutePath());
            System.out.println("Witeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in byte: " + myObj.length());
        } else {
            System.out.println("File does not exist.");
        }


//        if (myObj.delete()) {
//            System.out.println("Deleting file: " + myObj.getName());
//
//        } else {
//            System.out.println("Failed to delete file.");
//        }


    }
}
