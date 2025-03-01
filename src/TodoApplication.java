import java.util.Scanner;

public class TodoApplication {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, welcome to the todo list application! \n");
        Scanner scanner = new Scanner(System.in);

        TodoList mainList = new TodoList();

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Create task");
            System.out.println("2. List down the todos");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Clear the list");
            System.out.println("5. Exit app");

            int selectedOption = scanner.nextInt();

            if (selectedOption == 1) {
                System.out.println("What should be the name of the task:");
                scanner.nextLine();
                String taskName = scanner.nextLine();

                System.out.println("What should be the description of the task:");
                String taskDescription = scanner.nextLine();

                TodoItem newItem = new TodoItem(taskName, taskDescription);
                mainList.addItem(newItem);
            }

            if (selectedOption == 2) {
                System.out.println("\nHere are your stored tasks:");
                mainList.printList();
            }

            if (selectedOption == 3) {
                System.out.println("\nEnter the task number which you want to mark completed:");
                int taskIndex = scanner.nextInt();
                mainList.markItemCompleted(taskIndex);
            }

            if (selectedOption == 4) {
                mainList.clearList();
                System.out.println("Your todo list has been cleared.\n");
            }

            if (selectedOption == 5) {
                System.out.println("\nThank you very much.");
                break;
            }
        }
        scanner.close();
    }
}

