package endtermAssignment.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import endtermAssignment.DBController;

public class Department {
    private Integer id;
    private String name;
    private Company company;
    private List<Employee> employees = new ArrayList<>();

    public Department(Integer id, String name, Company company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public static Department getById(int id) throws SQLException {
            Connection connection = DBController.getConnection();
            String query = "SELECT * FROM department WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    Department dep = new Department(rs.getInt("id"), rs.getString("name"), Company.getById(rs.getInt("company_id")));
                    return dep;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null; 
        
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public void addEmployee(Employee employee) {
        employee.setDepartment(this);
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
