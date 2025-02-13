package endtermAssignment.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import endtermAssignment.DBController;
import endtermAssignment.domain.Company;

public class CompanyRepository {
    
    public ArrayList<Company> getAllCompanies() {
        ArrayList<Company> companies = new ArrayList<>();
        String query = "SELECT * FROM company";

        try (Connection conn = DBController.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                companies.add(new Company(rs.getString("name"), rs.getInt("id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return companies;
    }

    public void addCompany(String name) {
        String query = "INSERT INTO company (name) VALUES (?)";

        try (Connection conn = DBController.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCompany(int id, String name) {
        String query = "UPDATE company SET name = ? WHERE id = ?";
        try (Connection conn = DBController.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод для удаления компании
    public void deleteCompany(int id) {
        String query = "DELETE FROM company WHERE id = ?";
        try (Connection conn = DBController.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
