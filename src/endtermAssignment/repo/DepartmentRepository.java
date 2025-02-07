package endtermAssignment.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import endtermAssignment.DBController;
import endtermAssignment.domain.Company;
import endtermAssignment.domain.Department;

public class DepartmentRepository {
    
    public ArrayList<Department> getDepartmentsByCompany(Company company) {
        ArrayList<Department> departments = new ArrayList<>();
        String query = "SELECT * FROM department WHERE company_id = ?";

        try (Connection conn = DBController.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, company.getId());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                departments.add(new Department(rs.getInt("id"),rs.getString("name"), Company.getById(company.getId())));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }

    public ArrayList<Department> getAllDepartments() {
        ArrayList<Department> departments = new ArrayList<>();
        String query = "SELECT * FROM department";
        try (Connection conn = DBController.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                departments.add(new Department(rs.getInt("id"), rs.getString("name"), Company.getById(rs.getInt("id"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }

    public void addDepartment(String name, int companyId) {
        String query = "INSERT INTO department (name, company_id) VALUES (?, ?)";

        try (Connection conn = DBController.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setInt(2, companyId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
