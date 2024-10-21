public class Team {
    private Employee[] employees;
    private int size = 0;
    public Team(Employee... employee) {
        this.employees = employee;
        size = employee.length;
    }
    public void remove(Employee em){
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(em)){
                employees[i] = null;
            }

        }
    }
    public Team() {
        employees = new Employee[1];
        size = 0;
    }

    public void add (Employee employee){
        if (size >= employees.length) {
            enlarge();
        }
        employees[size++] = employee;
    }

    public void enlarge(){
        Employee[] newArray = new Employee[ employees.length * 2];
        for (int i = 0; i < employees.length; i++) {
            newArray[i] = employees[i];

        }
        employees = newArray;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            sb.append(i+1);
            sb.append(". ");
            sb.append(employees[i].getName());
            if (i < employees.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();

    }
    public String getEmployeesExpertise(int num) {
        return employees[num].getFieldOfExperise();
    }
    public Employee getEmployee(int index){
        return employees[index];
    }
    public String getEmployeesName(int num) {
        return employees[num].getName();
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getSize() {
        return size;
    }
    public boolean hasA(int indexEm,int indexT) {
        for (int i = 0; i < size; i++) {
            if (getEmployee(1).getTask1(3).toString().equals(indexT)) {
                return true;
            }
        }
        return false;
    }
}