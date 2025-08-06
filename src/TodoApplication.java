import java.util.Scanner;


// TODO: Write tests for the application.
public class TodoApplication {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the todo list application! \n");

        while (true) {
            displayMenu();
            int selectedOption = getUserInput();

            switch (selectedOption) {
                case 1 -> createTodo();
                case 2 -> listTodos();
                case 3 -> markTodoCompleted();
                case 4 -> clearTodos();
                case 5 -> exitApplication();
                default -> System.out.println("Invalid option. Please choose a number between 1 and 5.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("What do you want to do?");
        System.out.println("1. Create todo");
        System.out.println("2. List down the todos");
        System.out.println("3. Mark a todo as completed");
        System.out.println("4. Clear the todo list");
        System.out.println("5. Exit app");
    }

    private static int getUserInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number:");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextInt();
    }

    private static void createTodo() {
        scanner.nextLine(); // Consume newline
        System.out.println("What should be the name of the todo:");
        String taskName = scanner.nextLine();

        System.out.println("What should be the description of the todo:");
        String taskDescription = scanner.nextLine();

        TodoItem newTodoItem = new TodoItem(taskName, taskDescription);
        todoList.addItem(newTodoItem);

        System.out.println("Todo added successfully.\n");
    }

    private static void listTodos() {
        System.out.println("\nHere are your stored todos:");
        todoList.printList();
    }

    private static void markTodoCompleted() {
        System.out.println("\nEnter the todo number which you want to mark completed:");

        int taskIndex = getUserInput();
        boolean marked = todoList.markItemCompleted(taskIndex - 1);

        if (marked) {
            System.out.println("Todo marked as completed.\n");
        } else {
            System.out.println("Invalid item number.\n");
        }
    }

    private static void clearTodos() {
        todoList.clearList();
        System.out.println("Your todo list has been cleared.\n");
    }

    private static void exitApplication() {
        System.out.println("\nThank you very much.");
        scanner.close();
        System.exit(0);
    }
}
