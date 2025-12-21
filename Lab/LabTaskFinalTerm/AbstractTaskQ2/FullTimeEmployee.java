class FullTimeEmployee extends Employee {

    double monthlySalary;

    public FullTimeEmployee(String name , double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary ;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }

    @Override
    public String toString(){
        return "Employee Type : Full Time \n"+"Employee name: " + name + "\n" + 
                        "Monthly Salary: " + monthlySalary;
    }

}
