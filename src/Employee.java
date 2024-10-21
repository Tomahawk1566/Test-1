import java.util.ArrayList;
import java.util.List;
public class Employee {
    private String name;
    private String fieldOfExperise;
    private Task[] task;
    private int size;
    private List<Task> taskList;
    public Task current;
    private  int money=0;
    private String[] ranks = {"entry","junior", "middle", "senior"};
    private int rankIndex = 0;
    public int getRankIndex() {
        return rankIndex;
    }
    public void setRankIndex(int rankIndex) {
        this.rankIndex = rankIndex;
    }
    public String getRank() {
        return ranks[rankIndex];
    }
    public void setCurrent(Task current) {
        this.current = current;
    }

    public Task getCurrentTask() {
        return current;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Employee(String name, String listTechnologies, Task... tasks) {
        this.name = name;
        this.fieldOfExperise = listTechnologies;
        this.task = tasks;
        size = tasks.length;
        this.taskList =new ArrayList<>();
        this.money= 0;



    }
    public Task getTask1(int num){
        return task[num];

    }

    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("Task number "+"("+task.getNumber()+") "+ "\"" + task.getTitle()+"\"" + " added to " + name);
    }

    public String showAllTask() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" is qualified to do these tasks:\n");
        for (int i = 0; i < size; i++) {  // Use tasks.length for the correct size
            sb.append(String.format("%d: %s.%n", task[i].getNumber(), task[i].getTitle(),task[i].getDescription()));
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getFieldOfExperise() {
        return fieldOfExperise;
    }

    public Task[] getTasks() {
        return task;
    }

    public int getSize() {
        return size;
    }

    public boolean hasA(int num) {
        for (int i = 0; i < size; i++) {
            if (task[i].getNumber()==num-1) {
                System.out.println(String.format("%s has a task number (%d)",name,num));

                return true;


            }
            break;
        }
        return false;
    }
    public void enlarge () {
        Task[] newArray = new Task[task.length * 2];
        for (int i = 0; i < task.length; i++) {
            newArray[i] = task[i];

        }
        task = newArray;
    }

    public String toString(){
        return String.format("Employee %s is qualified to do these tasks: %s", name, showAllTask());
    }

    public String isTaskDoneByEmployee(int num) {
        for (int i = 0; i < size; i++) {
            if (task[num-2].getNumber() == num) {
                return String.format("Employee %s has completed task %d: %s", name, num, task[i].getTitle());

            } else if(task[num-2].getNumber()!=num){
                return String.format("Employee %s has not completed task %d", name, num);
            }
        }
        return "!!!";
    }
    public void assignTask(Task assign) {
        if (size < task.length) {
            task[size++] =assign;
            this.current = assign;

            System.out.println(String.format("Task number(%d): %s assigned to employee",assign.getNumber(),assign.getTitle()));
        } else {
            System.out.println("Cannot assign more tasks to " + name);
        }
    }

}