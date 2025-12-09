class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String toString() {
        return title + ", "+salary;
    }
}
class Employee {
    private String name;
    private Position position;

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void showEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
    }
}

class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[numberOfEmployees];
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Cannot add more employees to " + companyName);
        }
    }

    public void showEmployeeNames() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + employees[i].getName());
        }
    }

    public void showAllEmployeeDetails() {
        for (int i = 0; i < count; i++) {
            employees[i].showEmployeeInfo();
            System.out.println();
        }
    }
}


public class LabTask2 {
    public static void main(String[] args) {
        Company c = new Company("American International ", 3);
        Position dev = new Position("Developer", 50000);
        Position manager = new Position("Manager", 80000);
        Position designer = new Position("Designer", 45000);

     
        c.addEmployee(new Employee("Riyad Hossen", dev));
        c.addEmployee(new Employee("Shan e Elahi", manager));
        c.addEmployee(new Employee("Sazid Hasan", designer));

        c.showEmployeeNames();
        System.out.println();

        c.showAllEmployeeDetails();
    }
}
