package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public Department getDepartmentByName(String depname) {
        for (Department department : departments) {
            if (department.getName().equals(depname)) {
                return department;
            }
        }
        return null;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public Employee findEmployeeByFullName(String fullName) {
        for (Department department : departments) {
            for (Employee employee : department.getEmployees()) {
                if (employee.getFullName().equals(fullName)) {
                    return employee;
                }
            }
        }
        return null;
    }
}
