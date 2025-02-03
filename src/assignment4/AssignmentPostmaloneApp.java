package assignment4;

import java.util.Scanner;

public class AssignmentPostmaloneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод названия компании
        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine(); 
        Company company = new Company(companyName);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add new department");
            System.out.println("2. Add employee to department");
            System.out.println("3. Display company info");
            System.out.println("4. Find employee");
            System.out.println("5. Exit");
            System.out.print("Choose (1-5): ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter department name: ");
                    String departmentName = scanner.nextLine();
                    Department department = new Department(departmentName, company);
                    company.addDepartment(department);
                    System.out.println("Department added successfully");
                    break;
                
                case 2:
                    System.out.print("Enter the department name: ");
                    String deptName = scanner.nextLine();
                    Department existingDepartment = company.getDepartmentByName(deptName);
                    if (existingDepartment != null) {
                        System.out.print("Enter employee name: ");
                        String fullName = scanner.nextLine();

                        System.out.print("Enter employee position: ");
                        String position = scanner.nextLine();

                        System.out.print("Enter employee salary: ");
                        double salary = Double.parseDouble(scanner.nextLine());

                        Employee employee = new Employee(fullName, position, salary);
                        existingDepartment.addEmployee(employee);
                        System.out.println("Employee added successfully");
                    } else {
                        System.out.println("Department not found");
                    }
                    break;
                
                case 3:
                    System.out.println("\nCompany: " + company.getName());
                    for (Department dept : company.getDepartments()) {
                        System.out.println("\nDepartment: " + dept.getName());
                        System.out.println("Number of employees: " + dept.getNumberOfEmployees());
                        for (Employee emp : dept.getEmployees()) {
                            System.out.println("- " + emp.getFullName() + ", " + emp.getPosition() + ", Salary: " + emp.getSalary());
                        }
                    }
                    break;
                
                case 4:
                    System.out.print("Search by name: ");
                    String searchName = scanner.nextLine();
                    Employee foundEmployee = company.findEmployeeByFullName(searchName);
                    if (foundEmployee != null) {
                        System.out.println("\nEmployee: " + foundEmployee.getFullName() + ", " + foundEmployee.getPosition() + ", Salary: " + foundEmployee.getSalary());
                        System.out.println("Works in department: " + foundEmployee.getDepartment().getName());
                    } else {
                        System.out.println("\nEmployee with name " + searchName + " not found.");
                    }
                    break;
                
                case 5:
                    System.out.println("Ciao");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
