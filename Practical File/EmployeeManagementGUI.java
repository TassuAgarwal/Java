import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class EmployeeManagementGUI extends JFrame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    private JTextField idField, nameField, deptField;
    private JTextArea outputArea;

    public EmployeeManagementGUI() {
        super("Employee Management");

        // Create GUI components
        JLabel idLabel = new JLabel("ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel deptLabel = new JLabel("Department:");

        idField = new JTextField(10);
        nameField = new JTextField(20);
        deptField = new JTextField(20);

        JButton displayButton = new JButton("Display");
        JButton insertButton = new JButton("Insert");
        JButton deleteButton = new JButton("Delete");

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(deptLabel);
        add(deptField);
        add(displayButton);
        add(insertButton);
        add(deleteButton);
        add(new JScrollPane(outputArea));

        // Add event listeners
        displayButton.addActionListener(new DisplayButtonListener());
        insertButton.addActionListener(new InsertButtonListener());
        deleteButton.addActionListener(new DeleteButtonListener());
    }

    private class DisplayButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            outputArea.setText(""); // Clear the output area

            try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    Statement stmt = conn.createStatement()) {

                // Execute the SELECT query
                String sql = "SELECT * FROM employee";
                ResultSet rs = stmt.executeQuery(sql);

                // Process the result set
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String dept = rs.getString("deptt");

                    outputArea.append("ID: " + id + "\n");
                    outputArea.append("Name: " + name + "\n");
                    outputArea.append("Department: " + dept + "\n\n");
                }

                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private class InsertButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String id = idField.getText();
            String name = nameField.getText();
            String dept = deptField.getText();

            try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    Statement stmt = conn.createStatement()) {

                // Execute the INSERT query
                String sql = "INSERT INTO employee (id, name, deptt) VALUES ('" + id + "', '" + name + "', '" + dept
                        + "')";
                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record inserted successfully!");

                // Clear the input fields
                idField.setText("");
                nameField.setText("");
                deptField.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private class DeleteButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String id = idField.getText();

            try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    Statement stmt = conn.createStatement()) {

                // Execute the DELETE query
                String sql = "DELETE FROM employee WHERE id = '" + id + "'";
                int rowsAffected = stmt.executeUpdate(sql);

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "No record found with ID: " + id);
                }

                // Clear the input field
                idField.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagementGUI empGUI = new EmployeeManagementGUI();
        empGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        empGUI.setSize(400, 400);
        empGUI.setVisible(true);
    }
}
