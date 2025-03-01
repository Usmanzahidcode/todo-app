import java.util.ArrayList;

public class TodoList {
    private final ArrayList<TodoItem> list = new ArrayList<TodoItem>();

    public void addItem(TodoItem item) {
        list.add(item);
    }

    public boolean markItemCompleted(int index) {
        if (index >= list.size()){
            return false;
        }

        TodoItem item = list.get(index);
        item.markCompleted();
        return true;
    }

    public void clearList() {
        list.clear();
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
