public class Task {
    private String title;
    private String description;
    private int number;

    public Task(int number, String title, String description) {
        this.number = number;
        this.title = title;
        this.description = description;
    }

    public Task() {

    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String toString(){
        return title;
    }
}