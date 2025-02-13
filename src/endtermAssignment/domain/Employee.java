package endtermAssignment.domain;

public class Employee {
    private int id;
    private String fullName;
    private String position;
    private double salary;
    private Department department;

    public Employee(int id,String fullName, String position, double salary, Department department) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public Integer getId() {
        return id;
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
