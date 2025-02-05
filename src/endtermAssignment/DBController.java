package endtermAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import endtermAssignment.domain.Company;

public class DBController {
    public static Connection conn() {
        List<Company> companies = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/yourdatabase", "youruser", "yourpassword");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT name FROM company")) {
            while (rs.next()) {
                companies.add(new Company(rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return companies;
    }
}
