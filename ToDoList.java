import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully."); //anytime task is added
    }

    public static void removeTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("YAY! TASK COMPLETE");//when task is marked complete
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void viewTasks() {
        System.out.println("\nTO DO LIST\n-----------"); //displays list 
        if (!tasks.isEmpty()) {
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        } else {
            System.out.println("No tasks found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            viewTasks();  // always show tasks before choices 
            System.out.println("\n1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice (1-3): ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter your task: ");
                String task = scanner.nextLine();
                addTask(task);
            } else if (choice.equals("2")) {
                System.out.print("Enter the task you have complete: ");
                String task = scanner.nextLine();
                removeTask(task);
            } else if (choice.equals("3")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
