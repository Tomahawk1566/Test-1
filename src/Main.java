/*
Давайте создадим класс программист (Programmer) у него будут следующие поля:

имя String name
список задач List tasks
список технологий, которыми владеет List technologies, например ( "Java","Git", "JavaScript")
Как вы понимаете, задача (Task) - класс, у него будут следующие поля: номер (number), заголовок(title), описание( description) У программиста должны быть методы, которые позволят

добавить ему задачу,
получить список задач,
проверить, есть ли у программиста задача с заданным номером
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Task pmTask1 = new Task(1, "Define project scope and objectives", "Clearly outline the project goals and deliverables.");
        Task pmTask2 = new Task(2, "Create a project timeline and allocate resources", "Establish a schedule and assign resources effectively.");
        Task pmTask3 = new Task(3, "Monitor project progress and manage risks", "Track project milestones and address any potential risks.");
        Task pmTask4 = new Task(4, "Facilitate communication among stakeholders", "Ensure all stakeholders are informed and engaged throughout the project.");


        Task baTask1 = new Task(1, "Gather and document requirements from stakeholders", "Collect detailed requirements to guide project development.");
        Task baTask2 = new Task(2, "Analyze business processes and identify improvements", "Evaluate current processes and suggest enhancements.");
        Task baTask3 = new Task(3, "Create use cases and user stories", "Develop use cases that illustrate user interactions with the system.");
        Task baTask4 = new Task(4, "Liaise between technical teams and business stakeholders", "Act as a bridge between technical and non-technical teams.");


        Task devTask1 = new Task(1, "Write and test code based on specifications", "Develop software components as per the defined requirements.");
        Task devTask2 = new Task(2, "Participate in code reviews and refactoring", "Engage in peer reviews to maintain code quality.");
        Task devTask3 = new Task(3, "Collaborate with designers to implement UI/UX", "Work with design teams to integrate user interface designs.");
        Task devTask4 = new Task(4, "Maintain documentation for code and development processes", "Document code changes and development methodologies.");


        Task qaTask1 = new Task(1, "Develop test plans and test cases", "Create structured plans for testing the software.");
        Task qaTask2 = new Task(2, "Execute manual and automated tests", "Conduct tests to validate functionality and performance.");
        Task qaTask3 = new Task(3, "Report bugs and verify fixes", "Identify issues and confirm their resolution.");
        Task qaTask4 = new Task(4, "Ensure compliance with quality standards", "Verify that the software meets all required standards.");


        Task uxTask1 = new Task(1, "Create wireframes and mockups for user interfaces", "Design preliminary layouts for user interfaces.");
        Task uxTask2 = new Task(2, "Conduct user research and usability testing", "Gather user feedback to improve design effectiveness.");
        Task uxTask3 = new Task(3, "Design visual elements and branding", "Create graphics and branding materials for the application.");
        Task uxTask4 = new Task(4, "Collaborate with developers to implement designs", "Work with developers to ensure designs are accurately implemented.");


        Task sysAdminTask1 = new Task(1, "Set up and maintain servers and infrastructure", "Install and manage server hardware and software.");
        Task sysAdminTask2 = new Task(2, "Monitor system performance and security", "Track server metrics and ensure security protocols are followed.");
        Task sysAdminTask3 = new Task(3, "Manage backups and disaster recovery", "Implement backup solutions and recovery plans.");
        Task sysAdminTask4 = new Task(4, "Troubleshoot hardware and software issues", "Resolve technical issues that arise in the system.");


        Task devOpsTask1 = new Task(1, "Automate deployment processes and CI/CD pipelines", "Create automated workflows for software deployment.");
        Task devOpsTask2 = new Task(2, "Monitor application performance and reliability", "Ensure applications run smoothly in production.");
        Task devOpsTask3 = new Task(3, "Collaborate with development and operations teams", "Work closely with teams to align development and operational practices.");
        Task devOpsTask4 = new Task(4, "Implement infrastructure as code (IaC) solutions", "Use code to manage and provision infrastructure.");


        Task techSupportTask1 = new Task(1, "Provide support to end-users and resolve technical issues", "Assist users in troubleshooting and resolving tech problems.");
        Task techSupportTask2 = new Task(2, "Document support processes and knowledge base articles", "Create documentation to assist users and support staff.");
        Task techSupportTask3 = new Task(3, "Train users on new systems and software", "Provide training sessions and materials to users.");
        Task techSupportTask4 = new Task(4, "Escalate complex issues to appropriate teams", "Forward complicated problems to specialized teams.");
        Task[] alice = new Task[]{pmTask1, pmTask2, pmTask3, pmTask4};
        Task[] bob = new Task[]{baTask1, baTask2, baTask3, baTask4};
        Task[] charlie = new Task[]{devTask1, devTask2, devTask3, devTask4};
        Task[] diana = new Task[]{qaTask1, qaTask2, qaTask3, qaTask4};
        Task[] eva = new Task[]{uxTask1, uxTask2, uxTask3, uxTask4};
        Task[] frank = new Task[]{sysAdminTask1, sysAdminTask2, sysAdminTask3, sysAdminTask4};
        Task[] grace = new Task[]{devOpsTask1, devOpsTask2, devOpsTask3, devOpsTask4};
        Task[] henry = new Task[]{techSupportTask1, techSupportTask2, techSupportTask3, techSupportTask4};

        Employee projectManager = new Employee("Alice", "Project Management Tools, JIRA",alice);
        Employee businessAnalyst = new Employee("Bob", "Excel, SQL, Modeling Tools", bob);
        Employee developer = new Employee("Charlie", "Java, Python, Git", charlie);
        Employee qaTester = new Employee("Diana", "Selenium, JUnit, TestNG", diana);
        Employee uiUxDesigner = new Employee("Eva", "Figma, Sketch, Adobe XD", eva);
        Employee systemAdmin = new Employee("Frank", "Linux, Windows Server, Networking", frank);
        Employee devOpsEngineer = new Employee("Grace", "Docker, Kubernetes, AWS", grace);
        Employee techSupport = new Employee("Henry", "Help Desk Software, Remote Support Tools", henry);
        Team employees = new Team();
        employees.add(projectManager);
        employees.add(businessAnalyst);
        employees.add(developer);
        employees.add(qaTester);
        employees.add(uiUxDesigner);
        employees.add(systemAdmin);
        employees.add(devOpsEngineer);
        employees.add(techSupport);


        projectManager.addTask(new Task(5,"lazy","Do  nothing"));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(employees.getEmployees()[1].hasA(2));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(projectManager.showAllTask());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(employees.getEmployees()[2].showAllTask());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(employees.getEmployees()[3].isTaskDoneByEmployee(4));
        System.out.println("--------------------------------------------------------------------------------------------");
        employees.getEmployees()[4].addTask(new Task(5,"salary","\"recieves monthly payment\""));
        Task employeeTask = new Task();
        System.out.println("--------------------------------------------------------------------------------------------");
        while (true) {
            while (true) {
                System.out.println("Welcome to It company simulation,dear CEO");
                System.out.println("Make your choice");
                System.out.println("1: Assign a task to an employee");
                System.out.println("2: Show what an employee is doing");
                System.out.println("3: Dissmiss an employee");
                System.out.println("4: Choose an employee to  recieve a salary ");
                System.out.println("5: Promote an employee");
                System.out.println("6: Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter employee index \n1. for Alice\n2. for Bob\n3. for Charlie\n4. for Diana\n5. for Eva\n6. for Frank\n7. for Grace \n8. for Henry");
                switch (choice) {
                    case 1:
                        int empIndex = scanner.nextInt()-1;


                        if (empIndex >= 0 && empIndex < employees.getSize()) {
                            Employee selectedEmployee = employees.getEmployees()[empIndex];


                            System.out.println("Enter task number to assign (1 to 4):");
                            int taskNumber = scanner.nextInt();
                            System.out.println(String.format("you have chosen  %s, to do task number %d", selectedEmployee.getName(), taskNumber));
                            Task employeeTasks = selectedEmployee.getTask1(taskNumber-1);
                            selectedEmployee.setCurrent(selectedEmployee.getTask1(taskNumber-1));


                            if (selectedEmployee.getCurrentTask() != null) {
                                System.out.println(String.format("%s is currently doing task number %d: %s",
                                        selectedEmployee.getName(),
                                        selectedEmployee.getCurrentTask().getNumber(),
                                        selectedEmployee.getCurrentTask().getTitle()));
                            } else {
                                System.out.println("Invalid task number.");
                            }
                            break;
                        }
                    case 2:

                        empIndex = scanner.nextInt();
                        scanner.nextLine();
                        Employee selectedEmployee = employees.getEmployees()[empIndex-1];
                        if (empIndex >= 0 && empIndex-1 < employees.getSize()&& selectedEmployee.getCurrentTask()!=null) {
                            System.out.println("Tasks for " + selectedEmployee.getName() + ":");
                            System.out.println(String.format("%s is currently doing task number %d: %s",selectedEmployee.getName(),selectedEmployee.getCurrentTask().getNumber()
                                    ,selectedEmployee.getCurrentTask().getTitle()));
                        } else {
                            System.out.println("Invalid employee index.");
                        }
                        break;

                    case 3:
                        System.out.println("Choose an employee to  fire");
                        empIndex = scanner.nextInt();
                        scanner.nextLine();
                        Employee selectedEmployeeFire = employees.getEmployees()[empIndex];
                        employees.remove(selectedEmployeeFire);
                        System.out.println(String.format("%s has lost his job",selectedEmployeeFire.getName()));
                        break;
                    case 4:
                        empIndex = scanner.nextInt();
                        scanner.nextLine();
                        if(empIndex==9){
                            for (int i = 0; i < employees.getSize(); i++) {
                                employees.getEmployee(i).setMoney(1000000);
                            }
                        }else{
                            Employee selectedEmployeePay = employees.getEmployees()[empIndex];
                            System.out.println(String.format("%s recieves salary 100000$",selectedEmployeePay.getName()));
                        }
                        break;
                    case 5:
                        System.out.println("Choose an employee to promote:");
                        empIndex = scanner.nextInt();
                        scanner.nextLine();

                        if (empIndex < 0 || empIndex >= employees.getEmployees().length) {
                            System.out.println("Invalid employee index. Please try again.");

                        }

                        selectedEmployee = employees.getEmployees()[empIndex];


                        int currentRankIndex = selectedEmployee.getRankIndex();

                        if (currentRankIndex <3 ) {
                            selectedEmployee.setRankIndex(selectedEmployee.getRankIndex() +1);
                            System.out.println(String.format("%s has been promoted to %s",
                                    selectedEmployee.getName(), selectedEmployee.getRank()));
                        } else {
                            System.out.println(String.format("%s is already at the highest rank",
                                    selectedEmployee.getName()));
                        }
                        break;
                    case 6:

                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice, please try again.");


                }
            }
        }
    }
}