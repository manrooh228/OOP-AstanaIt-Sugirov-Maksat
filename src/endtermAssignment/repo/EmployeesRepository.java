package endtermAssignment.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import endtermAssignment.DBController;
import endtermAssignment.domain.Department;
import endtermAssignment.domain.Employee;

public class EmployeesRepository {
    
    public ArrayList<Employee> getEmployeesByDepartment(int departmentId) {
        ArrayList<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employee WHERE department_id = ?";

        try (Connection conn = DBController.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, departmentId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                employees.add(new Employee(rs.getString("full_name"),
                rs.getString("position"), rs.getDouble("salary"), Department.getById(rs.getInt("department_id"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> employee = new ArrayList<>();
        String query = "SELECT * FROM employee";
        try (Connection conn = DBController.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                employee.add(new Employee(rs.getString("full_name"), rs.getString("position"), rs.getInt("salary"), Department.getById(rs.getInt("department_id"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public void addEmployee(String fullName, String position, Integer salary, Integer departmentId) {
        String query = "INSERT INTO employee (full_name, position, salary, department_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBController.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, fullName);
            stmt.setString(2, position);
            stmt.setInt(3, salary);
            stmt.setInt(4, departmentId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
