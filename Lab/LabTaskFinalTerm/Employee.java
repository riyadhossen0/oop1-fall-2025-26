abstract class Employee{
    String name;

    public Employee(String name) {   
       // System.out.println("Employee constructor called.");
        this.name = name;
    }
    
    abstract double calculateSalary();
    public abstract String toString();

    public String showDetails(){
        return "Employee Name: " + name;
    }

}