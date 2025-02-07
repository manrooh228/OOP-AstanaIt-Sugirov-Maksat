package endtermAssignment.domain;

public class Employee {
    private String fullName;
    private String position;
    private double salary;
    private Department department;

    public Employee(String fullName, String position, double salary, Department department) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
