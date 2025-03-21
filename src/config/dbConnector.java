package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class dbConnector {
    private Connection connect;

    // Constructor to connect to our database
    public dbConnector() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/youthify", "root", "");
        } catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
        }
    }

    // Function to retrieve data (no parameters)
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }

    // Function to retrieve data with parameters (to prevent SQL injection)
    public ResultSet getDataWithParams(String query, int uid) {
        try {
            PreparedStatement pst = connect.prepareStatement(query);
            pst.setInt(1, uid);  // Assuming the query expects an integer parameter
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error executing query with parameters: " + ex.getMessage());
            return null;
        }
    }

    // Function to save data (insert data)
    public boolean insertData(String sql) {
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            pst.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
            return false;
        }
    }

    // Function to update data (update existing data)
    public void updateData(String sql) {
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
            } else {
                System.out.println("Data Update Failed!");
            }
            pst.close();
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
        }
    }

    // Function to update data with parameters (to prevent SQL injection)
    public void updateDataWithParams(String updateQuery, String newHashedPassword, int uid) {
        try {
            PreparedStatement pst = connect.prepareStatement(updateQuery);
            pst.setString(1, newHashedPassword);
            pst.setInt(2, uid); // Assuming the query expects an integer for the user ID
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
            } else {
                System.out.println("Data Update Failed!");
            }
            pst.close();
        } catch (SQLException ex) {
            System.out.println("Error executing update with parameters: " + ex.getMessage());
        }
    }
}
