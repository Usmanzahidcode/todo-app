import java.util.ArrayList;

public class TodoList {
    private ArrayList<TodoItem> list;

    public TodoList() {
        list = new ArrayList<TodoItem>();
    }

    public TodoList addItem(TodoItem item) {
        list.add(item);
        return this;
    }

    public TodoList markItemCompleted(int index) {
        TodoItem item = list.get(index);
        item.markCompleted();
        return this;
    }

    public TodoList clearList() {
        list.clear();
        return this;
    }

    public void printList() {
        if (list.isEmpty()) {
            System.out.println("No tasks in the list.");
            return;
        }

        System.out.println("To-Do List:");
        for (int i = 0; i < list.size(); i++) {
            TodoItem item = list.get(i);
            System.out.println((item.isCompleted() ? "[✔] " : "[ ] ") + (i + 1) + ". " + item.getName() + " - " + item.getDescription());
        }
    }
}
