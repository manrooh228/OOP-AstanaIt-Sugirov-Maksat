package endtermAssignment.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import endtermAssignment.DBController;

public class Company {
    private Integer id;
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Company getById(int id) throws SQLException {
        Connection connection = DBController.getConnection();
        String query = "SELECT * FROM company WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) { 
                Company company = new Company(rs.getString("name"), rs.getInt("id"));
                return company;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
