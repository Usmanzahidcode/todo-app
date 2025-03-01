public class TodoItem {
    private String name;
    private String description;
    private boolean completed;

    public TodoItem(String name, String description) {
        this(name, description, false);
    }

    public TodoItem(String name, String description, boolean completed) {
        this.name = name;
        this.description = description;
        this.completed = completed;
    }


    // Getters
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    // Setters
    public TodoItem changeName(String name) {
        this.name = name;
        return this;
    }

    public TodoItem changeDescription(String description) {
        this.description = description;
        return this;
    }

    public TodoItem markCompleted() {
        this.completed = true;
        return this;
    }

    public TodoItem markUnComplete() {
        this.completed = false;
        return this;
    }
}
