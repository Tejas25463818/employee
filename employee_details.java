public class employee_details extends employee {
    private int empId;
    private double salary;

    public EmployeeDetails(String name, String dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        super.displayName();
        super.displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}
