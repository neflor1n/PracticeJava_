package practice;
import java.util.*;

public class TaskManager {

    public static void main(String[] args) {
        List<String> taskList = new ArrayList<String>();

        taskList.add("Java");
        taskList.add("C");
        taskList.add("C++");
        taskList.add("C#");
        taskList.add("Python");
        taskList.add("PHP");


        System.out.printf("\nHello! This is a task manager!\n" +
                "Continue? (0-1)/(exit-continue): ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

            if (Objects.equals(choice, "1") || Objects.equals(choice, "continue")) {
                System.out.println("You are running Java Task Manager.");
                while (true){
                    System.out.printf("\n" +
                            "1. Show all tasks\n" +
                            "2. Add a new task\n" +
                            "3. Delete a task\n" +
                            "4. Exit\n" +
                            "Enter your choice: ");
                    int taskChoice = scanner.nextInt();

                    if (taskChoice == 4) {
                        System.out.println("You turned off Java Task Manager.");
                        System.out.println("Good bye!");
                        break;
                    }
                    if (taskChoice == 1) {
                        for (String task : taskList) {
                            System.out.println(task);
                        }
                    }
                    if (taskChoice == 2) {

                        System.out.printf("What task would you like to add?: ");
                        Scanner sc = new Scanner(System.in);
                        String task = sc.nextLine();
                        taskList.add(task);
                    }
                    if (taskChoice == 3) {
                        if (taskList.isEmpty()) {
                            System.out.println("No tasks to delete.");
                        } else {
                            System.out.println("Tasks:");
                            int numberOfTasks = 0;
                            for (String task : taskList) {
                                System.out.println(numberOfTasks + ". " + task);
                                numberOfTasks++;
                            }
                            System.out.printf("Enter the number of the task to delete: ");
                            Scanner sca = new Scanner(System.in);
                            int taskChoice2 = sca.nextInt();

                            if (taskChoice2 >= 0 && taskChoice2 < taskList.size()) {
                                taskList.remove(taskChoice2);
                                System.out.println("Task deleted successfully.");
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        }
                    }

                }
            }


    }
}
